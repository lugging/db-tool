package db.tool.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "ref_interest_rate")
public class RefInterestRate {
    @Id
    @Column(name = "REFINTEREST_RATE_TYPE")
    private String refinterestRateType;

    @Id
    @Column(name = "VALID_FROM_DATE")
    private Date validFromDate;

    @Id
    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "ORGANIZATION")
    private String organization;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "CURRENCY")
    private String currency;

    @Column(name = "INTEREST_RATE")
    private BigDecimal interestRate;

    @Column(name = "UPDATOR")
    private String updator;

    /**
     * @return REFINTEREST_RATE_TYPE
     */
    public String getRefinterestRateType() {
        return refinterestRateType;
    }

    /**
     * @param refinterestRateType
     */
    public void setRefinterestRateType(String refinterestRateType) {
        this.refinterestRateType = refinterestRateType == null ? null : refinterestRateType.trim();
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
     * @return INTEREST_RATE
     */
    public BigDecimal getInterestRate() {
        return interestRate;
    }

    /**
     * @param interestRate
     */
    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
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