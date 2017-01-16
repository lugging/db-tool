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

import db.tool.dao.BankAccountAttributeMapper;
import db.tool.dao.BankAccountBalanceMapper;
import db.tool.dao.BankAccountContractMapper;
import db.tool.dao.BankContractMapper;
import db.tool.model.BankAccountAttribute;
import db.tool.model.BankAccountBalance;
import db.tool.model.BankAccountContract;
import db.tool.model.BankContract;
import db.tool.util.RandomUtils;
import db.tool.util.SpringContextUtil;
import db.tool.util.StringUtils;

/**
 * 账户信息
 * @author liugang
 * 生成从 1 - 10000000 的账户信息
 * http://localhost:8080/BankAcc/1/10000000 
 *
 */
@Controller
public class AccountController {

	private static final Logger LOG = LoggerFactory.getLogger(AccountController.class);
	
	@Autowired
	private BankAccountContractMapper bankAccountContractMapper;
	
	@Autowired
	private BankAccountAttributeMapper bankAccountAttributeMapper;
	
	@Autowired
	private BankContractMapper bankContractMapper;
	
	@Autowired
	private BankAccountBalanceMapper bankAccountBalanceMapper;
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
		
        BankAccountContract bankAccountContractpo;
        BankAccountAttribute bankAccountAttributepo;
        BankContract bankContractpo;
        BankAccountBalance bankAccountBalancepo;
        long i = begin;
        for( ; i <= end ; i++){
        	bankAccountContractpo  = createBankAccountContract(i);
        	bankAccountAttributepo = createBankAccountAttribute(i);
        	bankAccountBalancepo   = createBankAccountBalance(i);
        			bankContractpo = createBankContract(i);
        			
			try{
				ok += 
				bankAccountContractMapper.insert(bankAccountContractpo);
				bankAccountAttributeMapper.insert(bankAccountAttributepo);
				bankContractMapper.insert(bankContractpo);
				bankAccountBalanceMapper.insert(bankAccountBalancepo);
				
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
	
	/**
	 * 账户合同表
	 * 
	 *  bank_account_contract[
        CONTRACT_ID, HT6235688501000000001
        BANK_KEY,  1001
        ACCOUNT_NO,  6235688501000000001
        ACCOUNT_NAME,  张三
        OPERATOR,  U10100100001
        STATUS,  1
        CREATE_TELLER  U10100100008
        ]
	 * @param i
	 * @return
	 */
	public BankAccountContract createBankAccountContract(long i){
		BankAccountContract po = new BankAccountContract();
		po.setAccountName("张" + RandomUtils.getRandomAlphabet(3));
		po.setAccountNo(StringUtils.getFixAccountNo(i));
		po.setBankKey("1001");
		po.setContractId(StringUtils.getContractId(i));
		po.setOperator("U10100100001");
		po.setStatus("1");
		po.setCreateTeller("U10100100008");
		return po;
	}
	
	/**
	 * 账户基本信息表
	 * @param i
	 * @return
	 */
	public BankAccountAttribute createBankAccountAttribute(long i){
		BankAccountAttribute po = new BankAccountAttribute();
		po.setAccountNo(StringUtils.getFixAccountNo(i));
		po.setContractId(StringUtils.getContractId(i));
		po.setTimestamp(new Date());
		return po;
	}
	
	/**
	 * 合同主表
	 * @param i
	 * @return
	 */
	public BankContract createBankContract(long i){
		BankContract po = new BankContract();
		po.setContractId(StringUtils.getContractId(i));
		po.setCurrency("RMB");
		po.setBankKey("1001");
		po.setCreateTimestamp(new Date());
		return po;
	}
	
	/**
	 * 账户余额
	 * @param i
	 * @return
	 */
	public BankAccountBalance createBankAccountBalance(long i){
		BankAccountBalance po = new BankAccountBalance();
		po.setContractId(StringUtils.getContractId(i)); 
		po.setAmount(new BigDecimal(10000));  //金额
		po.setCurrency("RMB");
		po.setBalanceType("1");
		return po;
	}
}
