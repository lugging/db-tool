package db.tool.controller;

import java.math.BigDecimal;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import db.tool.util.RandomUtils;
import db.tool.util.SpringContextUtil;
import db.tool.util.StringUtils;

/**
 * @author liugang
 * http://localhost:8080/BankAcc/1/10000000 
 *
 */
@Controller
public class AccountController {

	private static final Logger LOG = LoggerFactory.getLogger(AccountController.class);
	
	/**
	 * 
	 * @param begin
	 * 			起始
	 * @param end
	 * 			结束
	 * @return
	 */
	@RequestMapping(value="/BankAcc/{begin}/{end}")
	@ResponseBody
	public String exec(@PathVariable long begin, @PathVariable long end){
		LOG.info("初始化数据[{}]开始,计划插入数据库开始条数 {}，结束条数 {}", "BankAccount", begin, end);
		return execute(begin, end)+"";
	}
	
	private int execute(long begin, long end){
		int ok = 0;
		DefaultTransactionDefinition definition = new DefaultTransactionDefinition();
		//设置事务的传播行为，此处是设置为开启一个新事物
        definition.setPropagationBehavior(TransactionDefinition.PROPAGATION_SUPPORTS);
        //设置事务的隔离级别，此处是读已经提交(不同版本MYSQL，事物级别会报错)
        definition.setIsolationLevel(TransactionDefinition.PROPAGATION_NOT_SUPPORTED);
        //从spring容器对象中获取DataSourceTransactionManager，这个根据配置文件中配置的id名（transactionManager）
        DataSourceTransactionManager transactionManager = (DataSourceTransactionManager) SpringContextUtil.getBean("transactionManager", DataSourceTransactionManager.class);
        TransactionStatus transactionStatus = (TransactionStatus) transactionManager.getTransaction(definition);
		
        long i = begin;
        for( ; i <= end ; i++){
        			
			try{
				
				if(i % 20 ==0 || i == end){
					transactionManager.commit(transactionStatus);
					transactionStatus = (TransactionStatus) transactionManager.getTransaction(definition);
					LOG.info("数据入库开始数{},总共条数【{}】,当前第【{}】,成功【{}】", begin, end, i, ok);
				}
			}catch (Exception e){
				e.printStackTrace();
				transactionManager.rollback(transactionStatus);
				throw e;
			}
		}
		return ok;
	}
	
}
