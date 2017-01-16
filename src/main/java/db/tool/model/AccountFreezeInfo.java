package db.tool.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

/**
 * 账户冻结信息表
 * @author liugang
 *
 */
@Table(name = "account_freeze_info")
public class AccountFreezeInfo {
    @Id
    @Column(name = "LOCK_NUM")
    private String lockNum;

    @Column(name = "EVENT_TYPE")
    private String eventType;

    @Column(name = "LOCK_STATUS")
    private String lockStatus;

    @Column(name = "LOCK_CATEGORY")
    private String lockCategory;

    @Column(name = "DOC_NUM")
    private String docNum;

    @Column(name = "CONTRACT_ID")
    private String contractId;

    @Column(name = "LOCK_AMOUNT")
    private BigDecimal lockAmount;

    @Column(name = "CURRENCY")
    private String currency;

    @Column(name = "VALID_FROM_DATE")
    private Date validFromDate;

    @Column(name = "VALID_TO_DATE")
    private Date validToDate;

    @Column(name = "TEXT1")
    private String text1;

    @Column(name = "TEXT2")
    private String text2;

    @Column(name = "CREATOR")
    private String creator;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "CREATE_MEDIUM")
    private String createMedium;

    @Column(name = "CREATE_ORG")
    private String createOrg;

    @Column(name = "UPDATOR")
    private String updator;

    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    @Column(name = "UPDATE_MEDIUM")
    private String updateMedium;

    @Column(name = "UPDATE_ORG")
    private String updateOrg;

    @Column(name = "CREATE_TELLER")
    private String createTeller;

    @Column(name = "UPDATE_TELLER")
    private String updateTeller;

    /**
     * @return LOCK_NUM
     */
    public String getLockNum() {
        return lockNum;
    }

    /**
     * @param lockNum
     */
    public void setLockNum(String lockNum) {
        this.lockNum = lockNum == null ? null : lockNum.trim();
    }

    /**
     * @return EVENT_TYPE
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * @param eventType
     */
    public void setEventType(String eventType) {
        this.eventType = eventType == null ? null : eventType.trim();
    }

    /**
     * @return LOCK_STATUS
     */
    public String getLockStatus() {
        return lockStatus;
    }

    /**
     * @param lockStatus
     */
    public void setLockStatus(String lockStatus) {
        this.lockStatus = lockStatus == null ? null : lockStatus.trim();
    }

    /**
     * @return LOCK_CATEGORY
     */
    public String getLockCategory() {
        return lockCategory;
    }

    /**
     * @param lockCategory
     */
    public void setLockCategory(String lockCategory) {
        this.lockCategory = lockCategory == null ? null : lockCategory.trim();
    }

    /**
     * @return DOC_NUM
     */
    public String getDocNum() {
        return docNum;
    }

    /**
     * @param docNum
     */
    public void setDocNum(String docNum) {
        this.docNum = docNum == null ? null : docNum.trim();
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
     * @return LOCK_AMOUNT
     */
    public BigDecimal getLockAmount() {
        return lockAmount;
    }

    /**
     * @param lockAmount
     */
    public void setLockAmount(BigDecimal lockAmount) {
        this.lockAmount = lockAmount;
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
     * @return TEXT1
     */
    public String getText1() {
        return text1;
    }

    /**
     * @param text1
     */
    public void setText1(String text1) {
        this.text1 = text1 == null ? null : text1.trim();
    }

    /**
     * @return TEXT2
     */
    public String getText2() {
        return text2;
    }

    /**
     * @param text2
     */
    public void setText2(String text2) {
        this.text2 = text2 == null ? null : text2.trim();
    }

    /**
     * @return CREATOR
     */
    public String getCreator() {
        return creator;
    }

    /**
     * @param creator
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * @return CREATE_TIME
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return CREATE_MEDIUM
     */
    public String getCreateMedium() {
        return createMedium;
    }

    /**
     * @param createMedium
     */
    public void setCreateMedium(String createMedium) {
        this.createMedium = createMedium == null ? null : createMedium.trim();
    }

    /**
     * @return CREATE_ORG
     */
    public String getCreateOrg() {
        return createOrg;
    }

    /**
     * @param createOrg
     */
    public void setCreateOrg(String createOrg) {
        this.createOrg = createOrg == null ? null : createOrg.trim();
    }

    /**
     * @return UPDATOR
     */
    public String getUpdator() {
        return updator;
    }

    /**
     * @param updator
     */
    public void setUpdator(String updator) {
        this.updator = updator == null ? null : updator.trim();
    }

    /**
     * @return UPDATE_TIME
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return UPDATE_MEDIUM
     */
    public String getUpdateMedium() {
        return updateMedium;
    }

    /**
     * @param updateMedium
     */
    public void setUpdateMedium(String updateMedium) {
        this.updateMedium = updateMedium == null ? null : updateMedium.trim();
    }

    /**
     * @return UPDATE_ORG
     */
    public String getUpdateOrg() {
        return updateOrg;
    }

    /**
     * @param updateOrg
     */
    public void setUpdateOrg(String updateOrg) {
        this.updateOrg = updateOrg == null ? null : updateOrg.trim();
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
     * @return UPDATE_TELLER
     */
    public String getUpdateTeller() {
        return updateTeller;
    }

    /**
     * @param updateTeller
     */
    public void setUpdateTeller(String updateTeller) {
        this.updateTeller = updateTeller == null ? null : updateTeller.trim();
    }
}