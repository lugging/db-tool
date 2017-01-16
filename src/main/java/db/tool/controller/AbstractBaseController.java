package db.tool.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import db.tool.util.Context;
import db.tool.util.SpringContextUtil;
import tk.mybatis.mapper.common.Mapper;

/**
 * 单个实体类的批量插入数据
 * @author liugang
 *
 * @param <T>
 */
@Controller
public abstract class AbstractBaseController<T>{

	private static final Logger LOG = LoggerFactory.getLogger(AbstractBaseController.class);
	
	protected Context context;
	
	private long i ;
	/**
	 * 批量入库执行类
	 * @param mapper
	 * @param number
	 * @return
	 */
	@RequestMapping("/execute/{begin}/{end}")
	@ResponseBody
	public Context execute(@PathVariable long begin, @PathVariable long end){
		 //获取Mybatis 实体类的Mapper
		Mapper<T> mapper = getMapper();
		//当前程序运行的上下文
		context = new Context(); 
		int ok = 0;
		DefaultTransactionDefinition definition = new DefaultTransactionDefinition();
		//设置事务的传播行为，此处是设置为开启一个新事物
        definition.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW);
        //设置事务的隔离级别，此处是读已经提交(不同版本MYSQL，事物级别会报错)
        definition.setIsolationLevel(TransactionDefinition.PROPAGATION_NOT_SUPPORTED);
        //从spring容器对象中获取DataSourceTransactionManager，这个根据配置文件中配置的id名（transactionManager）
        DataSourceTransactionManager transactionManager = (DataSourceTransactionManager) SpringContextUtil.getBean("transactionManager", DataSourceTransactionManager.class);
        TransactionStatus transactionStatus = (TransactionStatus) transactionManager.getTransaction(definition);
        T po;
        //当前执行的条数
        i = begin;
        //设置状态的变量
        context.setBeginDate(new Date());
        context.setCount(end - begin);
        context.setCurrentNumber(i);
        context.setStatus(1);
		for(; i <= end ; i++){
			po = beanFactory(i);
			ok += mapper.insert(po);
			if(i % 50 == 0 || i == end){
				transactionManager.commit(transactionStatus);
				transactionStatus = (TransactionStatus) transactionManager.getTransaction(definition);
				LOG.info("数据入库,总共条数【{}】,当前第【{}】,成功【{}】", begin, i, ok);
			}
		}
		context.setEndDate(new Date());
		context.setStatus(2);
		return context;
	}
	
	/**
	 * 查询当前实体的总条数
	 * @param mapper
	 * @param clazz
	 * @return
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	@SuppressWarnings({ "unchecked" })
	protected int count(Mapper<T> mapper, Class<?> clazz) throws InstantiationException, IllegalAccessException{
		T obj = (T) clazz.newInstance();
		int count = mapper.selectCount(obj);
		LOG.info("查询数据库总条数:{}", count);
		return count;
	}
	
	/**
	 * 保存对象的实体类
	 * @param param
	 * @return
	 */
	protected abstract T beanFactory(Object param);
	
	/**
	 * 获取当前程序运行的状态
	 * @return
	 */
	@RequestMapping("getstate")
	@ResponseBody
	public abstract Context getState();
	
	/**
	 * 获取当前实体类的Mapper
	 * @return
	 */
	protected abstract Mapper<T> getMapper();
}
