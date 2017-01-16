package db.tool.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "notification_rule")
public class NotificationRule {
    @Id
    @Column(name = "NOTIFICAT_ID")
    private String notificatId;

    @Column(name = "CONTRACT_ID")
    private String contractId;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "PRODUCT_ID")
    private String productId;

    @Column(name = "CURRENCY")
    private String currency;

    @Column(name = "VALID_FROM_DATE")
    private Date validFromDate;

    @Column(name = "VALID_TO_DATE")
    private Date validToDate;

    @Column(name = "MIN_AMOUNT_01")
    private BigDecimal minAmount01;

    @Column(name = "OPTION_AMOUNT_01")
    private String optionAmount01;

    @Column(name = "MAX_AMOUNT_01")
    private BigDecimal maxAmount01;

    @Column(name = "MIN_AMOUNT_02")
    private BigDecimal minAmount02;

    @Column(name = "OPTION_AMOUNT_02")
    private String optionAmount02;

    @Column(name = "MAX_AMOUNT_02")
    private BigDecimal maxAmount02;

    @Column(name = "TRNSTYPE_GRP")
    private String trnstypeGrp;

    @Column(name = "CREATE_MEDIUM")
    private String createMedium;

    @Column(name = "CREATOR")
    private String creator;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "UPDATE_MEDIUM")
    private String updateMedium;

    @Column(name = "UPDATOR")
    private String updator;

    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    @Column(name = "ARCHIVE_STATUS")
    private String archiveStatus;

    /**
     * @return NOTIFICAT_ID
     */
    public String getNotificatId() {
        return notificatId;
    }

    /**
     * @param notificatId
     */
    public void setNotificatId(String notificatId) {
        this.notificatId = notificatId == null ? null : notificatId.trim();
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
     * @return PRODUCT_ID
     */
    public String getProductId() {
        return productId;
    }

    /**
     * @param productId
     */
    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
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
     * @return MIN_AMOUNT_01
     */
    public BigDecimal getMinAmount01() {
        return minAmount01;
    }

    /**
     * @param minAmount01
     */
    public void setMinAmount01(BigDecimal minAmount01) {
        this.minAmount01 = minAmount01;
    }

    /**
     * @return OPTION_AMOUNT_01
     */
    public String getOptionAmount01() {
        return optionAmount01;
    }

    /**
     * @param optionAmount01
     */
    public void setOptionAmount01(String optionAmount01) {
        this.optionAmount01 = optionAmount01 == null ? null : optionAmount01.trim();
    }

    /**
     * @return MAX_AMOUNT_01
     */
    public BigDecimal getMaxAmount01() {
        return maxAmount01;
    }

    /**
     * @param maxAmount01
     */
    public void setMaxAmount01(BigDecimal maxAmount01) {
        this.maxAmount01 = maxAmount01;
    }

    /**
     * @return MIN_AMOUNT_02
     */
    public BigDecimal getMinAmount02() {
        return minAmount02;
    }

    /**
     * @param minAmount02
     */
    public void setMinAmount02(BigDecimal minAmount02) {
        this.minAmount02 = minAmount02;
    }

    /**
     * @return OPTION_AMOUNT_02
     */
    public String getOptionAmount02() {
        return optionAmount02;
    }

    /**
     * @param optionAmount02
     */
    public void setOptionAmount02(String optionAmount02) {
        this.optionAmount02 = optionAmount02 == null ? null : optionAmount02.trim();
    }

    /**
     * @return MAX_AMOUNT_02
     */
    public BigDecimal getMaxAmount02() {
        return maxAmount02;
    }

    /**
     * @param maxAmount02
     */
    public void setMaxAmount02(BigDecimal maxAmount02) {
        this.maxAmount02 = maxAmount02;
    }

    /**
     * @return TRNSTYPE_GRP
     */
    public String getTrnstypeGrp() {
        return trnstypeGrp;
    }

    /**
     * @param trnstypeGrp
     */
    public void setTrnstypeGrp(String trnstypeGrp) {
        this.trnstypeGrp = trnstypeGrp == null ? null : trnstypeGrp.trim();
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
     * @return ARCHIVE_STATUS
     */
    public String getArchiveStatus() {
        return archiveStatus;
    }

    /**
     * @param archiveStatus
     */
    public void setArchiveStatus(String archiveStatus) {
        this.archiveStatus = archiveStatus == null ? null : archiveStatus.trim();
    }
}