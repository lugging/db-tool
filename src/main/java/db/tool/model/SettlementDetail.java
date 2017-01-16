package db.tool.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "settlement_detail")
public class SettlementDetail {
    @Id
    @Column(name = "CONTRACT_ID")
    private String contractId;

    @Id
    @Column(name = "SETTLEMENT_TYPE")
    private String settlementType;

    @Id
    @Column(name = "SETTLE_PERIOD")
    private String settlePeriod;

    @Id
    @Column(name = "SEQ_decimal")
    private Integer seqDecimal;

    @Column(name = "POSTING_TYPE")
    private String postingType;

    @Column(name = "COND_TYPE")
    private String condType;

    @Column(name = "CALCULATE_START_TIMESTAMP")
    private Date calculateStartTimestamp;

    @Column(name = "BASE_CURRENCY")
    private String baseCurrency;

    @Column(name = "BASE_AMOUNT")
    private BigDecimal baseAmount;

    @Column(name = "CALCULATE_END_TIMESTAMP")
    private Date calculateEndTimestamp;

    @Column(name = "SETTLE_DAYS")
    private Integer settleDays;

    @Column(name = "BASE_DATE")
    private Date baseDate;

    @Column(name = "INTEREST_RATE")
    private BigDecimal interestRate;

    @Column(name = "CURRENCY")
    private String currency;

    @Column(name = "SETTLE_AMOUNT")
    private BigDecimal settleAmount;

    @Column(name = "INTEREST_MODE")
    private String interestMode;

    @Column(name = "VALID_FROM_DATE")
    private Date validFromDate;

    @Column(name = "VALID_TO_DATE")
    private Date validToDate;

    @Column(name = "DUE_DATE")
    private Date dueDate;

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
     * @return SEQ_decimal
     */
    public Integer getSeqDecimal() {
        return seqDecimal;
    }

    /**
     * @param seqDecimal
     */
    public void setSeqDecimal(Integer seqDecimal) {
        this.seqDecimal = seqDecimal;
    }

    /**
     * @return POSTING_TYPE
     */
    public String getPostingType() {
        return postingType;
    }

    /**
     * @param postingType
     */
    public void setPostingType(String postingType) {
        this.postingType = postingType == null ? null : postingType.trim();
    }

    /**
     * @return COND_TYPE
     */
    public String getCondType() {
        return condType;
    }

    /**
     * @param condType
     */
    public void setCondType(String condType) {
        this.condType = condType == null ? null : condType.trim();
    }

    /**
     * @return CALCULATE_START_TIMESTAMP
     */
    public Date getCalculateStartTimestamp() {
        return calculateStartTimestamp;
    }

    /**
     * @param calculateStartTimestamp
     */
    public void setCalculateStartTimestamp(Date calculateStartTimestamp) {
        this.calculateStartTimestamp = calculateStartTimestamp;
    }

    /**
     * @return BASE_CURRENCY
     */
    public String getBaseCurrency() {
        return baseCurrency;
    }

    /**
     * @param baseCurrency
     */
    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency == null ? null : baseCurrency.trim();
    }

    /**
     * @return BASE_AMOUNT
     */
    public BigDecimal getBaseAmount() {
        return baseAmount;
    }

    /**
     * @param baseAmount
     */
    public void setBaseAmount(BigDecimal baseAmount) {
        this.baseAmount = baseAmount;
    }

    /**
     * @return CALCULATE_END_TIMESTAMP
     */
    public Date getCalculateEndTimestamp() {
        return calculateEndTimestamp;
    }

    /**
     * @param calculateEndTimestamp
     */
    public void setCalculateEndTimestamp(Date calculateEndTimestamp) {
        this.calculateEndTimestamp = calculateEndTimestamp;
    }

    /**
     * @return SETTLE_DAYS
     */
    public Integer getSettleDays() {
        return settleDays;
    }

    /**
     * @param settleDays
     */
    public void setSettleDays(Integer settleDays) {
        this.settleDays = settleDays;
    }

    /**
     * @return BASE_DATE
     */
    public Date getBaseDate() {
        return baseDate;
    }

    /**
     * @param baseDate
     */
    public void setBaseDate(Date baseDate) {
        this.baseDate = baseDate;
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
     * @return SETTLE_AMOUNT
     */
    public BigDecimal getSettleAmount() {
        return settleAmount;
    }

    /**
     * @param settleAmount
     */
    public void setSettleAmount(BigDecimal settleAmount) {
        this.settleAmount = settleAmount;
    }

    /**
     * @return INTEREST_MODE
     */
    public String getInterestMode() {
        return interestMode;
    }

    /**
     * @param interestMode
     */
    public void setInterestMode(String interestMode) {
        this.interestMode = interestMode == null ? null : interestMode.trim();
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
}