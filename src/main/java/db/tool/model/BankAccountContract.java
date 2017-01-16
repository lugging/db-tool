package db.tool.model;

import javax.persistence.*;

/**
 * 账户合同表
 * @author liugang
 *
 */
@Table(name = "bank_account_contract")
public class BankAccountContract {
    /**
     * 内部合同号
     */
    @Id
    @Column(name = "CONTRACT_ID")
    private String contractId;

    /**
     * 银行码
     */
    @Column(name = "BANK_KEY")
    private String bankKey;

    /**
     * 账户
     */
    @Column(name = "ACCOUNT_NO")
    private String accountNo;

    /**
     * 账户名称
     */
    @Column(name = "ACCOUNT_NAME")
    private String accountName;

    /**
     * 操作员
     */
    @Column(name = "OPERATOR")
    private String operator;

    @Column(name = "STATUS")
    private String status;
    
    /**
     * 用户柜员
     */
    @Column(name = "CREATE_TELLER")
    private String createTeller;

    /**
     * 获取内部合同号
     *
     * @return CONTRACT_ID - 内部合同号
     */
    public String getContractId() {
        return contractId;
    }

    /**
     * 设置内部合同号
     *
     * @param contractId 内部合同号
     */
    public void setContractId(String contractId) {
        this.contractId = contractId == null ? null : contractId.trim();
    }

    /**
     * 获取银行码
     *
     * @return BANK_KEY - 银行码
     */
    public String getBankKey() {
        return bankKey;
    }

    /**
     * 设置银行码
     *
     * @param bankKey 银行码
     */
    public void setBankKey(String bankKey) {
        this.bankKey = bankKey == null ? null : bankKey.trim();
    }

    /**
     * 获取账户
     *
     * @return ACCOUNT_NO - 账户
     */
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * 设置账户
     *
     * @param accountNo 账户
     */
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo == null ? null : accountNo.trim();
    }

    /**
     * 获取账户名称
     *
     * @return ACCOUNT_NAME - 账户名称
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * 设置账户名称
     *
     * @param accountName 账户名称
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    /**
     * @return OPERATOR
     */
    public String getOperator() {
        return operator;
    }

    /**
     * @param operator
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * @return STATUS
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * @return CREATE_TELLER
     */
    public String getCreateTeller() {
        return createTeller;
    }

    /**
     * @param createTeller
     */
    public void setCreateTeller(String createTeller) {
        this.createTeller = createTeller == null ? null : createTeller.trim();
    }
}