package db.tool.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "counter_limit_info")
public class CounterLimitInfo {
    @Id
    @Column(name = "CONTRACT_ID")
    private String contractId;

    @Id
    @Column(name = "ALCTYPE")
    private String alctype;

    @Id
    @Column(name = "PERIOD")
    private Integer period;

    @Id
    @Column(name = "P_UNIT")
    private String pUnit;

    @Column(name = "P_CNTR_LIMIT")
    private Integer pCntrLimit;

    @Column(name = "VALID_FROM")
    private Date validFrom;

    @Column(name = "VALID_TO")
    private Date validTo;

    @Column(name = "VALID_TO_REAL")
    private Date validToReal;

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
     * @return ALCTYPE
     */
    public String getAlctype() {
        return alctype;
    }

    /**
     * @param alctype
     */
    public void setAlctype(String alctype) {
        this.alctype = alctype == null ? null : alctype.trim();
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
     * @return P_CNTR_LIMIT
     */
    public Integer getpCntrLimit() {
        return pCntrLimit;
    }

    /**
     * @param pCntrLimit
     */
    public void setpCntrLimit(Integer pCntrLimit) {
        this.pCntrLimit = pCntrLimit;
    }

    /**
     * @return VALID_FROM
     */
    public Date getValidFrom() {
        return validFrom;
    }

    /**
     * @param validFrom
     */
    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }

    /**
     * @return VALID_TO
     */
    public Date getValidTo() {
        return validTo;
    }

    /**
     * @param validTo
     */
    public void setValidTo(Date validTo) {
        this.validTo = validTo;
    }

    /**
     * @return VALID_TO_REAL
     */
    public Date getValidToReal() {
        return validToReal;
    }

    /**
     * @param validToReal
     */
    public void setValidToReal(Date validToReal) {
        this.validToReal = validToReal;
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