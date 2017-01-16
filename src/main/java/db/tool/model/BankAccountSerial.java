package db.tool.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

/**
 * 账户流水表
 * @author liugang
 *
 */
@Table(name = "bank_account_serial")
public class BankAccountSerial {
	/**
	 * 支付项编号
	 */
    @Id
    @Column(name = "PAYMENT_ITEM_ID")
    private String paymentItemId;
    
    /**
     * 合同编号
     */
    @Column(name = "CONTRACT_ID")
    private String contractId;
    
    /**
     * 指令编号
     */
    @Column(name = "ORDER_ID")
    private String orderId;
    
    /**
     * 流水号
     */
    @Column(name = "SERIAL_decimal")
    private String serialDecimal;
    
    /**
     * 交易类型
     */
    @Column(name = "TRANS_TYPE")
    private String transType;
    
    /**
     * 借贷标志  D- 借方   C-借方
     */
    @Column(name = "CD_FLAG")
    private String cdFlag;

    /**
     * 银行码
     */
    @Column(name = "BANK_KEY")
    private String bankKey;

    /**
     * 账号
     */
    @Column(name = "ACCOUNT_NO")
    private String accountNo;
    
    /**
     * 币种
     */
    @Column(name = "CURRENCY")
    private String currency;
    
    /**
     * 交易金额
     */
    @Column(name = "TRANS_AMOUNT")
    private BigDecimal transAmount;

    /**
     * 交易日期
     */
    @Column(name = "POSTING_DATE")
    private Date postingDate;

    /**
     * 起息日期
     */
    @Column(name = "VALUE_DATE")
    private Date valueDate;

    /**
     * 渠道编码
     */
    @Column(name = "MEDIUM")
    private String medium;

    /**
     * 机构编码
     */
    @Column(name = "ORGANIZATION")
    private String organization;
    
    /**
     * 
     */
    @Column(name = "SUMMARY")
    private String summary;

    @Column(name = "TIMESTAMP")
    private Date timestamp;
    
    /**
     * 冲正标识Y:冲正    N：否
     */
    @Column(name = "REVERSE_FLAG")
    private String reverseFlag;
    
    /**
     * 冲正对手流水号
     */
    @Column(name = "REVERSE_ITEM_ID")
    private String reverseItemId;

    /**
     * 终端号
     */
    @Column(name = "TERMINAL_ID")
    private String terminalId;

    /**
     * 备注   客户附言
     */
    @Column(name = "REMARK")
    private String remark;

    /**
     * 现转标识
		1-本行现金
		2-本行转账
		3-他行转账
     */
    @Column(name = "CASH_TRANS_FLAG")
    private String cashTransFlag;

    /**
     * 对方帐号
     */
    @Column(name = "OPPOSITE_ACCT_NO")
    private String oppositeAcctNo;
    
    /**
     * 对方户名
     */
    @Column(name = "OPPOSITE_ACCT_NAME")
    private String oppositeAcctName;
    
    
    @Column(name = "OPPOSITE_DOC_NO")
    private String oppositeDocNo;

    @Column(name = "OPPOSITE_DOC_TYPE")
    private String oppositeDocType;

    @Column(name = "OPPOSITE_BANK_NAME")
    private String oppositeBankName;

    @Column(name = "OPPOSITE_BANK_NO")
    private String oppositeBankNo;

    @Column(name = "OPPOSITE_CUST_01")
    private String oppositeCust01;

    @Column(name = "OPPOSITE_CUST_02")
    private String oppositeCust02;

    @Column(name = "OPERATOR")
    private String operator;

    @Column(name = "SYS_INDICATOR")
    private String sysIndicator;

    @Column(name = "SERVICE_CODE")
    private String serviceCode;

    @Column(name = "BUPR_CODE")
    private String buprCode;

    @Column(name = "PAYM_PATH")
    private String paymPath;

    @Column(name = "CUST_01")
    private String cust01;

    @Column(name = "CUST_02")
    private String cust02;

    @Column(name = "CUST_03")
    private String cust03;

    @Column(name = "CUST_04")
    private String cust04;

    @Column(name = "CUST_05")
    private String cust05;

    @Column(name = "CUST_06")
    private String cust06;

    @Column(name = "CUST_07")
    private String cust07;
    
    /**
     * 迁移标识Y-已迁移  N-未迁移
     */
    @Column(name = "MIGRATION_FLAG")
    private String migrationFlag;

    @Column(name = "ARCHIVE_FLAG")
    private String archiveFlag;

    @Column(name = "POSTING_TEXT")
    private String postingText;

    /**
     * @return PAYMENT_ITEM_ID
     */
    public String getPaymentItemId() {
        return paymentItemId;
    }

    /**
     * @param paymentItemId
     */
    public void setPaymentItemId(String paymentItemId) {
        this.paymentItemId = paymentItemId == null ? null : paymentItemId.trim();
    }

    /**
     * @return CONTRACT_ID
     */
    public String getContractId() {
        return contractId;
    }

    /**
     * @param contractId
     */
    public void setContractId(String contractId) {
        this.contractId = contractId == null ? null : contractId.trim();
    }

    /**
     * @return ORDER_ID
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param orderId
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * @return SERIAL_decimal
     */
    public String getSerialDecimal() {
        return serialDecimal;
    }

    /**
     * @param serialDecimal
     */
    public void setSerialDecimal(String serialDecimal) {
        this.serialDecimal = serialDecimal == null ? null : serialDecimal.trim();
    }

    /**
     * @return TRANS_TYPE
     */
    public String getTransType() {
        return transType;
    }

    /**
     * @param transType
     */
    public void setTransType(String transType) {
        this.transType = transType == null ? null : transType.trim();
    }

    /**
     * @return CD_FLAG
     */
    public String getCdFlag() {
        return cdFlag;
    }

    /**
     * @param cdFlag
     */
    public void setCdFlag(String cdFlag) {
        this.cdFlag = cdFlag == null ? null : cdFlag.trim();
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
     * 获取账号
     *
     * @return ACCOUNT_NO - 账号
     */
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * 设置账号
     *
     * @param accountNo 账号
     */
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo == null ? null : accountNo.trim();
    }

    /**
     * @return CURRENCY
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * @param currency
     */
    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    /**
     * @return TRANS_AMOUNT
     */
    public BigDecimal getTransAmount() {
        return transAmount;
    }

    /**
     * @param transAmount
     */
    public void setTransAmount(BigDecimal transAmount) {
        this.transAmount = transAmount;
    }

    /**
     * @return POSTING_DATE
     */
    public Date getPostingDate() {
        return postingDate;
    }

    /**
     * @param postingDate
     */
    public void setPostingDate(Date postingDate) {
        this.postingDate = postingDate;
    }

    /**
     * @return VALUE_DATE
     */
    public Date getValueDate() {
        return valueDate;
    }

    /**
     * @param valueDate
     */
    public void setValueDate(Date valueDate) {
        this.valueDate = valueDate;
    }

    /**
     * @return MEDIUM
     */
    public String getMedium() {
        return medium;
    }

    /**
     * @param medium
     */
    public void setMedium(String medium) {
        this.medium = medium == null ? null : medium.trim();
    }

    /**
     * @return ORGANIZATION
     */
    public String getOrganization() {
        return organization;
    }

    /**
     * @param organization
     */
    public void setOrganization(String organization) {
        this.organization = organization == null ? null : organization.trim();
    }

    /**
     * @return SUMMARY
     */
    public String getSummary() {
        return summary;
    }

    /**
     * @param summary
     */
    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    /**
     * @return TIMESTAMP
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * @param timestamp
     */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * @return REVERSE_FLAG
     */
    public String getReverseFlag() {
        return reverseFlag;
    }

    /**
     * @param reverseFlag
     */
    public void setReverseFlag(String reverseFlag) {
        this.reverseFlag = reverseFlag == null ? null : reverseFlag.trim();
    }

    /**
     * @return REVERSE_ITEM_ID
     */
    public String getReverseItemId() {
        return reverseItemId;
    }

    /**
     * @param reverseItemId
     */
    public void setReverseItemId(String reverseItemId) {
        this.reverseItemId = reverseItemId == null ? null : reverseItemId.trim();
    }

    /**
     * @return TERMINAL_ID
     */
    public String getTerminalId() {
        return terminalId;
    }

    /**
     * @param terminalId
     */
    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId == null ? null : terminalId.trim();
    }

    /**
     * @return REMARK
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * @return CASH_TRANS_FLAG
     */
    public String getCashTransFlag() {
        return cashTransFlag;
    }

    /**
     * @param cashTransFlag
     */
    public void setCashTransFlag(String cashTransFlag) {
        this.cashTransFlag = cashTransFlag == null ? null : cashTransFlag.trim();
    }

    /**
     * @return OPPOSITE_ACCT_NO
     */
    public String getOppositeAcctNo() {
        return oppositeAcctNo;
    }

    /**
     * @param oppositeAcctNo
     */
    public void setOppositeAcctNo(String oppositeAcctNo) {
        this.oppositeAcctNo = oppositeAcctNo == null ? null : oppositeAcctNo.trim();
    }

    /**
     * @return OPPOSITE_ACCT_NAME
     */
    public String getOppositeAcctName() {
        return oppositeAcctName;
    }

    /**
     * @param oppositeAcctName
     */
    public void setOppositeAcctName(String oppositeAcctName) {
        this.oppositeAcctName = oppositeAcctName == null ? null : oppositeAcctName.trim();
    }

    /**
     * @return OPPOSITE_DOC_NO
     */
    public String getOppositeDocNo() {
        return oppositeDocNo;
    }

    /**
     * @param oppositeDocNo
     */
    public void setOppositeDocNo(String oppositeDocNo) {
        this.oppositeDocNo = oppositeDocNo == null ? null : oppositeDocNo.trim();
    }

    /**
     * @return OPPOSITE_DOC_TYPE
     */
    public String getOppositeDocType() {
        return oppositeDocType;
    }

    /**
     * @param oppositeDocType
     */
    public void setOppositeDocType(String oppositeDocType) {
        this.oppositeDocType = oppositeDocType == null ? null : oppositeDocType.trim();
    }

    /**
     * @return OPPOSITE_BANK_NAME
     */
    public String getOppositeBankName() {
        return oppositeBankName;
    }

    /**
     * @param oppositeBankName
     */
    public void setOppositeBankName(String oppositeBankName) {
        this.oppositeBankName = oppositeBankName == null ? null : oppositeBankName.trim();
    }

    /**
     * @return OPPOSITE_BANK_NO
     */
    public String getOppositeBankNo() {
        return oppositeBankNo;
    }

    /**
     * @param oppositeBankNo
     */
    public void setOppositeBankNo(String oppositeBankNo) {
        this.oppositeBankNo = oppositeBankNo == null ? null : oppositeBankNo.trim();
    }

    /**
     * @return OPPOSITE_CUST_01
     */
    public String getOppositeCust01() {
        return oppositeCust01;
    }

    /**
     * @param oppositeCust01
     */
    public void setOppositeCust01(String oppositeCust01) {
        this.oppositeCust01 = oppositeCust01 == null ? null : oppositeCust01.trim();
    }

    /**
     * @return OPPOSITE_CUST_02
     */
    public String getOppositeCust02() {
        return oppositeCust02;
    }

    /**
     * @param oppositeCust02
     */
    public void setOppositeCust02(String oppositeCust02) {
        this.oppositeCust02 = oppositeCust02 == null ? null : oppositeCust02.trim();
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
     * @return SYS_INDICATOR
     */
    public String getSysIndicator() {
        return sysIndicator;
    }

    /**
     * @param sysIndicator
     */
    public void setSysIndicator(String sysIndicator) {
        this.sysIndicator = sysIndicator == null ? null : sysIndicator.trim();
    }

    /**
     * @return SERVICE_CODE
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode == null ? null : serviceCode.trim();
    }

    /**
     * @return BUPR_CODE
     */
    public String getBuprCode() {
        return buprCode;
    }

    /**
     * @param buprCode
     */
    public void setBuprCode(String buprCode) {
        this.buprCode = buprCode == null ? null : buprCode.trim();
    }

    /**
     * @return PAYM_PATH
     */
    public String getPaymPath() {
        return paymPath;
    }

    /**
     * @param paymPath
     */
    public void setPaymPath(String paymPath) {
        this.paymPath = paymPath == null ? null : paymPath.trim();
    }

    /**
     * @return CUST_01
     */
    public String getCust01() {
        return cust01;
    }

    /**
     * @param cust01
     */
    public void setCust01(String cust01) {
        this.cust01 = cust01 == null ? null : cust01.trim();
    }

    /**
     * @return CUST_02
     */
    public String getCust02() {
        return cust02;
    }

    /**
     * @param cust02
     */
    public void setCust02(String cust02) {
        this.cust02 = cust02 == null ? null : cust02.trim();
    }

    /**
     * @return CUST_03
     */
    public String getCust03() {
        return cust03;
    }

    /**
     * @param cust03
     */
    public void setCust03(String cust03) {
        this.cust03 = cust03 == null ? null : cust03.trim();
    }

    /**
     * @return CUST_04
     */
    public String getCust04() {
        return cust04;
    }

    /**
     * @param cust04
     */
    public void setCust04(String cust04) {
        this.cust04 = cust04 == null ? null : cust04.trim();
    }

    /**
     * @return CUST_05
     */
    public String getCust05() {
        return cust05;
    }

    /**
     * @param cust05
     */
    public void setCust05(String cust05) {
        this.cust05 = cust05 == null ? null : cust05.trim();
    }

    /**
     * @return CUST_06
     */
    public String getCust06() {
        return cust06;
    }

    /**
     * @param cust06
     */
    public void setCust06(String cust06) {
        this.cust06 = cust06 == null ? null : cust06.trim();
    }

    /**
     * @return CUST_07
     */
    public String getCust07() {
        return cust07;
    }

    /**
     * @param cust07
     */
    public void setCust07(String cust07) {
        this.cust07 = cust07 == null ? null : cust07.trim();
    }

    /**
     * @return MIGRATION_FLAG
     */
    public String getMigrationFlag() {
        return migrationFlag;
    }

    /**
     * @param migrationFlag
     */
    public void setMigrationFlag(String migrationFlag) {
        this.migrationFlag = migrationFlag == null ? null : migrationFlag.trim();
    }

    /**
     * @return ARCHIVE_FLAG
     */
    public String getArchiveFlag() {
        return archiveFlag;
    }

    /**
     * @param archiveFlag
     */
    public void setArchiveFlag(String archiveFlag) {
        this.archiveFlag = archiveFlag == null ? null : archiveFlag.trim();
    }

    /**
     * @return POSTING_TEXT
     */
    public String getPostingText() {
        return postingText;
    }

    /**
     * @param postingText
     */
    public void setPostingText(String postingText) {
        this.postingText = postingText == null ? null : postingText.trim();
    }
}