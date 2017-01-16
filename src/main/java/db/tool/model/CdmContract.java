package db.tool.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cdm_contract")
public class CdmContract {
    @Id
    @Column(name = "CONTRACT_ID")
    private String contractId;

    @Column(name = "CURRENCY")
    private String currency;

    @Column(name = "ORGANIZATION")
    private String organization;

    @Column(name = "ORGANIZATION_ACCOUNTING")
    private String organizationAccounting;

    @Column(name = "CUSTOMER_NO")
    private String customerNo;

    @Column(name = "VALID_FROM_DATE")
    private Date validFromDate;

    @Column(name = "VALID_TO_DATE")
    private Date validToDate;

    @Column(name = "PRODUCT_INT")
    private String productInt;

    @Column(name = "PRODUCT_VERSION")
    private String productVersion;

    @Column(name = "PRODUCT_TYPE")
    private String productType;

    @Column(name = "CALENDAR")
    private String calendar;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "BIT_MAP_CONTRACT")
    private String bitMapContract;

    @Column(name = "OPERATOR")
    private String operator;

    @Column(name = "CREATE_TELLER")
    private String createTeller;

    @Column(name = "RELEASE_STATUS")
    private String releaseStatus;

    @Column(name = "BANK_KEY")
    private String bankKey;

    @Column(name = "CREATE_TIMESTAMP")
    private Date createTimestamp;

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
}