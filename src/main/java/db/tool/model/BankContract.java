package db.tool.model;

import java.util.Date;
import javax.persistence.*;

/**
 * 合同主表
 * @author liugang
 *
 */
@Table(name = "bank_contract")
public class BankContract {
	/**
	 * 内部合同号
	 */
    @Id
    @Column(name = "CONTRACT_ID")
    private String contractId;

    /**
     * 币种
     */
    @Column(name = "CURRENCY")
    private String currency;

    /**
     * 机构编码、开立机构
     */
    @Column(name = "ORGANIZATION")
    private String organization;

    /**
     * 机构编码 账务机构
     */
    @Column(name = "ORGANIZATION_ACCOUNTING")
    private String organizationAccounting;

    /**
     * 客户号
     */
    @Column(name = "CUSTOMER_NO")
    private String customerNo;

    /**
     * 生效日期
     */
    @Column(name = "VALID_FROM_DATE")
    private Date validFromDate;

    /**
     * 结束日期
     */
    @Column(name = "VALID_TO_DATE")
    private Date validToDate;

    /**
     * 产品编号
     */
    @Column(name = "PRODUCT_INT")
    private String productInt;

    /**
     * 产品版本
     */
    @Column(name = "PRODUCT_VERSION")
    private String productVersion;

    /**
     * 产品大类
     */
    @Column(name = "PRODUCT_TYPE")
    private String productType;

    /**
     * 日历
     */
    @Column(name = "CALENDAR")
    private String calendar;

    /**
     * 状态 1-活动的；2-不活动的
     */
    @Column(name = "STATUS")
    private String status;

    /**
     * 合同特征位图
     */
    @Column(name = "BIT_MAP_CONTRACT")
    private String bitMapContract;

    /**
     * 执行人 操作人员用户名
     */
    @Column(name = "OPERATOR")
    private String operator;

    @Column(name = "CREATE_TELLER")
    private String createTeller;

    /**
     * 发布状态
     */
    @Column(name = "RELEASE_STATUS")
    private String releaseStatus;

    @Column(name = "BANK_KEY")
    private String bankKey;

    @Column(name = "CREATE_TIMESTAMP")
    private Date createTimestamp;

    @Column(name = "BINDING_ACCOUNT_NO")
    private String bindingAccountNo;

    @Column(name = "BINDING_ACCOUNT_NAME")
    private String bindingAccountName;

    @Column(name = "ID_TYPE")
    private String idType;

    @Column(name = "ID_number")
    private String idNumber;

    @Column(name = "BINDING_OPEN_BANK_NO")
    private String bindingOpenBankNo;

    @Column(name = "BINDING_OPEN_BANK_NAME")
    private String bindingOpenBankName;

    /**
     * 账户等级
     */
    @Column(name = "ACCOUNT_LEVEL")
    private String accountLevel;

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
     * @return ORGANIZATION_ACCOUNTING
     */
    public String getOrganizationAccounting() {
        return organizationAccounting;
    }

    /**
     * @param organizationAccounting
     */
    public void setOrganizationAccounting(String organizationAccounting) {
        this.organizationAccounting = organizationAccounting == null ? null : organizationAccounting.trim();
    }

    /**
     * @return CUSTOMER_NO
     */
    public String getCustomerNo() {
        return customerNo;
    }

    /**
     * @param customerNo
     */
    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo == null ? null : customerNo.trim();
    }

    /**
     * @return VALID_FROM_DATE
     */
    public Date getValidFromDate() {
        return validFromDate;
    }

    /**
     * @param validFromDate
     */
    public void setValidFromDate(Date validFromDate) {
        this.validFromDate = validFromDate;
    }

    /**
     * @return VALID_TO_DATE
     */
    public Date getValidToDate() {
        return validToDate;
    }

    /**
     * @param validToDate
     */
    public void setValidToDate(Date validToDate) {
        this.validToDate = validToDate;
    }

    /**
     * @return PRODUCT_INT
     */
    public String getProductInt() {
        return productInt;
    }

    /**
     * @param productInt
     */
    public void setProductInt(String productInt) {
        this.productInt = productInt == null ? null : productInt.trim();
    }

    /**
     * @return PRODUCT_VERSION
     */
    public String getProductVersion() {
        return productVersion;
    }

    /**
     * @param productVersion
     */
    public void setProductVersion(String productVersion) {
        this.productVersion = productVersion == null ? null : productVersion.trim();
    }

    /**
     * @return PRODUCT_TYPE
     */
    public String getProductType() {
        return productType;
    }

    /**
     * @param productType
     */
    public void setProductType(String productType) {
        this.productType = productType == null ? null : productType.trim();
    }

    /**
     * @return CALENDAR
     */
    public String getCalendar() {
        return calendar;
    }

    /**
     * @param calendar
     */
    public void setCalendar(String calendar) {
        this.calendar = calendar == null ? null : calendar.trim();
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
     * @return BIT_MAP_CONTRACT
     */
    public String getBitMapContract() {
        return bitMapContract;
    }

    /**
     * @param bitMapContract
     */
    public void setBitMapContract(String bitMapContract) {
        this.bitMapContract = bitMapContract == null ? null : bitMapContract.trim();
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

    /**
     * @return RELEASE_STATUS
     */
    public String getReleaseStatus() {
        return releaseStatus;
    }

    /**
     * @param releaseStatus
     */
    public void setReleaseStatus(String releaseStatus) {
        this.releaseStatus = releaseStatus == null ? null : releaseStatus.trim();
    }

    /**
     * @return BANK_KEY
     */
    public String getBankKey() {
        return bankKey;
    }

    /**
     * @param bankKey
     */
    public void setBankKey(String bankKey) {
        this.bankKey = bankKey == null ? null : bankKey.trim();
    }

    /**
     * @return CREATE_TIMESTAMP
     */
    public Date getCreateTimestamp() {
        return createTimestamp;
    }

    /**
     * @param createTimestamp
     */
    public void setCreateTimestamp(Date createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    /**
     * @return BINDING_ACCOUNT_NO
     */
    public String getBindingAccountNo() {
        return bindingAccountNo;
    }

    /**
     * @param bindingAccountNo
     */
    public void setBindingAccountNo(String bindingAccountNo) {
        this.bindingAccountNo = bindingAccountNo == null ? null : bindingAccountNo.trim();
    }

    /**
     * @return BINDING_ACCOUNT_NAME
     */
    public String getBindingAccountName() {
        return bindingAccountName;
    }

    /**
     * @param bindingAccountName
     */
    public void setBindingAccountName(String bindingAccountName) {
        this.bindingAccountName = bindingAccountName == null ? null : bindingAccountName.trim();
    }

    /**
     * @return ID_TYPE
     */
    public String getIdType() {
        return idType;
    }

    /**
     * @param idType
     */
    public void setIdType(String idType) {
        this.idType = idType == null ? null : idType.trim();
    }

    /**
     * @return ID_decimal
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * @param idDecimal
     */
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    /**
     * @return BINDING_OPEN_BANK_NO
     */
    public String getBindingOpenBankNo() {
        return bindingOpenBankNo;
    }

    /**
     * @param bindingOpenBankNo
     */
    public void setBindingOpenBankNo(String bindingOpenBankNo) {
        this.bindingOpenBankNo = bindingOpenBankNo == null ? null : bindingOpenBankNo.trim();
    }

    /**
     * @return BINDING_OPEN_BANK_NAME
     */
    public String getBindingOpenBankName() {
        return bindingOpenBankName;
    }

    /**
     * @param bindingOpenBankName
     */
    public void setBindingOpenBankName(String bindingOpenBankName) {
        this.bindingOpenBankName = bindingOpenBankName == null ? null : bindingOpenBankName.trim();
    }

    /**
     * @return ACCOUNT_LEVEL
     */
    public String getAccountLevel() {
        return accountLevel;
    }

    /**
     * @param accountLevel
     */
    public void setAccountLevel(String accountLevel) {
        this.accountLevel = accountLevel == null ? null : accountLevel.trim();
    }
}