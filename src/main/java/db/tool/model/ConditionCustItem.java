package db.tool.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "condition_cust_item")
public class ConditionCustItem {
    @Id
    @Column(name = "CONTRACT_ID")
    private String contractId;

    @Id
    @Column(name = "SEQ_decimal")
    private Integer seqDecimal;

    @Column(name = "CURRENCY")
    private String currency;

    @Column(name = "VALID_FROM_DATE")
    private Date validFromDate;

    @Column(name = "CONDITION_TYPE")
    private String conditionType;

    @Column(name = "MIN_AMOUNT")
    private BigDecimal minAmount;

    @Column(name = "MAX_AMOUNT")
    private BigDecimal maxAmount;

    @Column(name = "INTEREST_RATE_FORMULA")
    private String interestRateFormula;

    @Column(name = "REFINTEREST_RATE_TYPE1")
    private String refinterestRateType1;

    @Column(name = "PERCENTAGE_RATE1")
    private BigDecimal percentageRate1;

    @Column(name = "REFINTEREST_RATE_TYPE2")
    private String refinterestRateType2;

    @Column(name = "PERCENTAGE_RATE2")
    private BigDecimal percentageRate2;

    @Column(name = "REFINTEREST_RATE_TYPE3")
    private String refinterestRateType3;

    @Column(name = "PERCENTAGE_RATE3")
    private BigDecimal percentageRate3;

    @Column(name = "REFINTEREST_RATE_TYPE4")
    private String refinterestRateType4;

    @Column(name = "PERCENTAGE_RATE4")
    private BigDecimal percentageRate4;

    @Column(name = "PERCENTAGE_RATE")
    private BigDecimal percentageRate;

    @Column(name = "MIN_INTEREST_RATE")
    private BigDecimal minInterestRate;

    @Column(name = "MAX_INTEREST_RATE")
    private BigDecimal maxInterestRate;

    @Column(name = "STATUS")
    private String status;

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
     * @return CONDITION_TYPE
     */
    public String getConditionType() {
        return conditionType;
    }

    /**
     * @param conditionType
     */
    public void setConditionType(String conditionType) {
        this.conditionType = conditionType == null ? null : conditionType.trim();
    }

    /**
     * @return MIN_AMOUNT
     */
    public BigDecimal getMinAmount() {
        return minAmount;
    }

    /**
     * @param minAmount
     */
    public void setMinAmount(BigDecimal minAmount) {
        this.minAmount = minAmount;
    }

    /**
     * @return MAX_AMOUNT
     */
    public BigDecimal getMaxAmount() {
        return maxAmount;
    }

    /**
     * @param maxAmount
     */
    public void setMaxAmount(BigDecimal maxAmount) {
        this.maxAmount = maxAmount;
    }

    /**
     * @return INTEREST_RATE_FORMULA
     */
    public String getInterestRateFormula() {
        return interestRateFormula;
    }

    /**
     * @param interestRateFormula
     */
    public void setInterestRateFormula(String interestRateFormula) {
        this.interestRateFormula = interestRateFormula == null ? null : interestRateFormula.trim();
    }

    /**
     * @return REFINTEREST_RATE_TYPE1
     */
    public String getRefinterestRateType1() {
        return refinterestRateType1;
    }

    /**
     * @param refinterestRateType1
     */
    public void setRefinterestRateType1(String refinterestRateType1) {
        this.refinterestRateType1 = refinterestRateType1 == null ? null : refinterestRateType1.trim();
    }

    /**
     * @return PERCENTAGE_RATE1
     */
    public BigDecimal getPercentageRate1() {
        return percentageRate1;
    }

    /**
     * @param percentageRate1
     */
    public void setPercentageRate1(BigDecimal percentageRate1) {
        this.percentageRate1 = percentageRate1;
    }

    /**
     * @return REFINTEREST_RATE_TYPE2
     */
    public String getRefinterestRateType2() {
        return refinterestRateType2;
    }

    /**
     * @param refinterestRateType2
     */
    public void setRefinterestRateType2(String refinterestRateType2) {
        this.refinterestRateType2 = refinterestRateType2 == null ? null : refinterestRateType2.trim();
    }

    /**
     * @return PERCENTAGE_RATE2
     */
    public BigDecimal getPercentageRate2() {
        return percentageRate2;
    }

    /**
     * @param percentageRate2
     */
    public void setPercentageRate2(BigDecimal percentageRate2) {
        this.percentageRate2 = percentageRate2;
    }

    /**
     * @return REFINTEREST_RATE_TYPE3
     */
    public String getRefinterestRateType3() {
        return refinterestRateType3;
    }

    /**
     * @param refinterestRateType3
     */
    public void setRefinterestRateType3(String refinterestRateType3) {
        this.refinterestRateType3 = refinterestRateType3 == null ? null : refinterestRateType3.trim();
    }

    /**
     * @return PERCENTAGE_RATE3
     */
    public BigDecimal getPercentageRate3() {
        return percentageRate3;
    }

    /**
     * @param percentageRate3
     */
    public void setPercentageRate3(BigDecimal percentageRate3) {
        this.percentageRate3 = percentageRate3;
    }

    /**
     * @return REFINTEREST_RATE_TYPE4
     */
    public String getRefinterestRateType4() {
        return refinterestRateType4;
    }

    /**
     * @param refinterestRateType4
     */
    public void setRefinterestRateType4(String refinterestRateType4) {
        this.refinterestRateType4 = refinterestRateType4 == null ? null : refinterestRateType4.trim();
    }

    /**
     * @return PERCENTAGE_RATE4
     */
    public BigDecimal getPercentageRate4() {
        return percentageRate4;
    }

    /**
     * @param percentageRate4
     */
    public void setPercentageRate4(BigDecimal percentageRate4) {
        this.percentageRate4 = percentageRate4;
    }

    /**
     * @return PERCENTAGE_RATE
     */
    public BigDecimal getPercentageRate() {
        return percentageRate;
    }

    /**
     * @param percentageRate
     */
    public void setPercentageRate(BigDecimal percentageRate) {
        this.percentageRate = percentageRate;
    }

    /**
     * @return MIN_INTEREST_RATE
     */
    public BigDecimal getMinInterestRate() {
        return minInterestRate;
    }

    /**
     * @param minInterestRate
     */
    public void setMinInterestRate(BigDecimal minInterestRate) {
        this.minInterestRate = minInterestRate;
    }

    /**
     * @return MAX_INTEREST_RATE
     */
    public BigDecimal getMaxInterestRate() {
        return maxInterestRate;
    }

    /**
     * @param maxInterestRate
     */
    public void setMaxInterestRate(BigDecimal maxInterestRate) {
        this.maxInterestRate = maxInterestRate;
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
}