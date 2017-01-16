package db.tool.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "pltype_limit_info")
public class PltypeLimitInfo {
    @Id
    @Column(name = "CONTRACT_ID")
    private String contractId;

    @Id
    @Column(name = "PLTYPE")
    private String pltype;

    @Id
    @Column(name = "PERIOD")
    private Integer period;

    @Id
    @Column(name = "P_UNIT")
    private String pUnit;

    @Column(name = "AMOUNT")
    private BigDecimal amount;

    @Column(name = "CURRENCY")
    private String currency;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "CREATOR")
    private String creator;

    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    @Column(name = "UPDATOR")
    private String updator;

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
     * @return PLTYPE
     */
    public String getPltype() {
        return pltype;
    }

    /**
     * @param pltype
     */
    public void setPltype(String pltype) {
        this.pltype = pltype == null ? null : pltype.trim();
    }

    /**
     * @return PERIOD
     */
    public Integer getPeriod() {
        return period;
    }

    /**
     * @param period
     */
    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     * @return P_UNIT
     */
    public String getpUnit() {
        return pUnit;
    }

    /**
     * @param pUnit
     */
    public void setpUnit(String pUnit) {
        this.pUnit = pUnit == null ? null : pUnit.trim();
    }

    /**
     * @return AMOUNT
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * @param amount
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
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
}