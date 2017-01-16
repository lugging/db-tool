package db.tool.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "accrule_sim")
public class AccruleSim {
    @Id
    @Column(name = "CONTRACT_ID")
    private String contractId;

    @Id
    @Column(name = "SETTLEMENT_TYPE")
    private String settlementType;

    @Id
    @Column(name = "SETTLE_PERIOD")
    private String settlePeriod;

    @Column(name = "ACCRULE_AMOUNT")
    private BigDecimal accruleAmount;

    @Column(name = "CURRENCY")
    private String currency;

    @Column(name = "VALID_FROM_DATE")
    private Date validFromDate;

    @Column(name = "VALID_TO_DATE")
    private Date validToDate;

    @Column(name = "DUE_DATE")
    private Date dueDate;

    @Column(name = "SETTLE_TIMESTAMP")
    private Date settleTimestamp;

    @Column(name = "UPDATOR")
    private String updator;

    @Column(name = "POSTING_AREA")
    private String postingArea;

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
     * @return SETTLEMENT_TYPE
     */
    public String getSettlementType() {
        return settlementType;
    }

    /**
     * @param settlementType
     */
    public void setSettlementType(String settlementType) {
        this.settlementType = settlementType == null ? null : settlementType.trim();
    }

    /**
     * @return SETTLE_PERIOD
     */
    public String getSettlePeriod() {
        return settlePeriod;
    }

    /**
     * @param settlePeriod
     */
    public void setSettlePeriod(String settlePeriod) {
        this.settlePeriod = settlePeriod == null ? null : settlePeriod.trim();
    }

    /**
     * @return ACCRULE_AMOUNT
     */
    public BigDecimal getAccruleAmount() {
        return accruleAmount;
    }

    /**
     * @param accruleAmount
     */
    public void setAccruleAmount(BigDecimal accruleAmount) {
        this.accruleAmount = accruleAmount;
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
     * @return DUE_DATE
     */
    public Date getDueDate() {
        return dueDate;
    }

    /**
     * @param dueDate
     */
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * @return SETTLE_TIMESTAMP
     */
    public Date getSettleTimestamp() {
        return settleTimestamp;
    }

    /**
     * @param settleTimestamp
     */
    public void setSettleTimestamp(Date settleTimestamp) {
        this.settleTimestamp = settleTimestamp;
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
     * @return POSTING_AREA
     */
    public String getPostingArea() {
        return postingArea;
    }

    /**
     * @param postingArea
     */
    public void setPostingArea(String postingArea) {
        this.postingArea = postingArea == null ? null : postingArea.trim();
    }
}