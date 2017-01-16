package db.tool.model;

import javax.persistence.*;

@Table(name = "condition_type")
public class ConditionType {
    @Id
    @Column(name = "CONDITION_TYPE")
    private String conditionType;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "CONDITION_CATEGORY")
    private String conditionCategory;

    @Column(name = "POSTING_SIGN")
    private String postingSign;

    @Column(name = "POSTING_SIGN_ADJC")
    private String postingSignAdjc;

    @Column(name = "POSTING_SIGN_ADJD")
    private String postingSignAdjd;

    @Column(name = "CALENDAR")
    private String calendar;

    @Column(name = "SETTLEMENT_POSTING_TYPE")
    private String settlementPostingType;

    @Column(name = "CALCULATION_BASIS")
    private String calculationBasis;

    @Column(name = "AGGREGATE_CALCULATE")
    private String aggregateCalculate;

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
     * @return DESCRIPTION
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * @return CONDITION_CATEGORY
     */
    public String getConditionCategory() {
        return conditionCategory;
    }

    /**
     * @param conditionCategory
     */
    public void setConditionCategory(String conditionCategory) {
        this.conditionCategory = conditionCategory == null ? null : conditionCategory.trim();
    }

    /**
     * @return POSTING_SIGN
     */
    public String getPostingSign() {
        return postingSign;
    }

    /**
     * @param postingSign
     */
    public void setPostingSign(String postingSign) {
        this.postingSign = postingSign == null ? null : postingSign.trim();
    }

    /**
     * @return POSTING_SIGN_ADJC
     */
    public String getPostingSignAdjc() {
        return postingSignAdjc;
    }

    /**
     * @param postingSignAdjc
     */
    public void setPostingSignAdjc(String postingSignAdjc) {
        this.postingSignAdjc = postingSignAdjc == null ? null : postingSignAdjc.trim();
    }

    /**
     * @return POSTING_SIGN_ADJD
     */
    public String getPostingSignAdjd() {
        return postingSignAdjd;
    }

    /**
     * @param postingSignAdjd
     */
    public void setPostingSignAdjd(String postingSignAdjd) {
        this.postingSignAdjd = postingSignAdjd == null ? null : postingSignAdjd.trim();
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
     * @return SETTLEMENT_POSTING_TYPE
     */
    public String getSettlementPostingType() {
        return settlementPostingType;
    }

    /**
     * @param settlementPostingType
     */
    public void setSettlementPostingType(String settlementPostingType) {
        this.settlementPostingType = settlementPostingType == null ? null : settlementPostingType.trim();
    }

    /**
     * @return CALCULATION_BASIS
     */
    public String getCalculationBasis() {
        return calculationBasis;
    }

    /**
     * @param calculationBasis
     */
    public void setCalculationBasis(String calculationBasis) {
        this.calculationBasis = calculationBasis == null ? null : calculationBasis.trim();
    }

    /**
     * @return AGGREGATE_CALCULATE
     */
    public String getAggregateCalculate() {
        return aggregateCalculate;
    }

    /**
     * @param aggregateCalculate
     */
    public void setAggregateCalculate(String aggregateCalculate) {
        this.aggregateCalculate = aggregateCalculate == null ? null : aggregateCalculate.trim();
    }
}