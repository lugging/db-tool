package db.tool.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "condition_cust")
public class ConditionCust {
    @Id
    @Column(name = "CONTRACT_ID")
    private String contractId;

    @Id
    @Column(name = "SEQ_decimal")
    private Integer seqDecimal;

    @Id
    @Column(name = "CURRENCY")
    private String currency;

    @Id
    @Column(name = "VALID_FROM_DATE")
    private Date validFromDate;

    @Id
    @Column(name = "CONDITION_TYPE")
    private String conditionType;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "VALID_TO_DATE")
    private Date validToDate;

    @Column(name = "CONDITION_FORM")
    private String conditionForm;

    @Column(name = "INTEREST_MODE")
    private String interestMode;

    @Column(name = "CALENDAR")
    private String calendar;

    @Column(name = "ROUNDING_CATEGORY")
    private String roundingCategory;

    @Column(name = "ROUNDING_UNIT")
    private String roundingUnit;

    @Column(name = "INTERVAL_CALCULATION")
    private String intervalCalculation;

    @Column(name = "DATE_CATEGORY")
    private String dateCategory;

    @Column(name = "REPETI_PERIOD")
    private String repetiPeriod;

    @Column(name = "REPETI_PERIOD_UNIT")
    private String repetiPeriodUnit;

    @Column(name = "KEY_DATE")
    private String keyDate;

    @Column(name = "FIRST_CALC_DATE")
    private Date firstCalcDate;

    @Column(name = "REF_DATE_CATEGORY")
    private String refDateCategory;

    @Column(name = "FREQUENCY_CATEGORY")
    private String frequencyCategory;

    @Column(name = "DIFF_CATEGORY1")
    private String diffCategory1;

    @Column(name = "DIFF_VALUE1")
    private String diffValue1;

    @Column(name = "DIFF_CATEGORY2")
    private String diffCategory2;

    @Column(name = "DIFF_VALUE2")
    private String diffValue2;

    @Column(name = "DIFF_CATEGORY3")
    private String diffCategory3;

    @Column(name = "DIFF_VALUE3")
    private String diffValue3;

    @Column(name = "DIFF_CATEGORY4")
    private String diffCategory4;

    @Column(name = "DIFF_VALUE4")
    private String diffValue4;

    @Column(name = "DIFF_CATEGORY5")
    private String diffCategory5;

    @Column(name = "DIFF_VALUE5")
    private String diffValue5;

    @Column(name = "TEL_ID")
    private String telId;

    @Column(name = "UPDATOR")
    private String updator;

    @Column(name = "UPDATE_TIME")
    private Date updateTime;

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
     * @return CONDITION_FORM
     */
    public String getConditionForm() {
        return conditionForm;
    }

    /**
     * @param conditionForm
     */
    public void setConditionForm(String conditionForm) {
        this.conditionForm = conditionForm == null ? null : conditionForm.trim();
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
     * @return ROUNDING_CATEGORY
     */
    public String getRoundingCategory() {
        return roundingCategory;
    }

    /**
     * @param roundingCategory
     */
    public void setRoundingCategory(String roundingCategory) {
        this.roundingCategory = roundingCategory == null ? null : roundingCategory.trim();
    }

    /**
     * @return ROUNDING_UNIT
     */
    public String getRoundingUnit() {
        return roundingUnit;
    }

    /**
     * @param roundingUnit
     */
    public void setRoundingUnit(String roundingUnit) {
        this.roundingUnit = roundingUnit == null ? null : roundingUnit.trim();
    }

    /**
     * @return INTERVAL_CALCULATION
     */
    public String getIntervalCalculation() {
        return intervalCalculation;
    }

    /**
     * @param intervalCalculation
     */
    public void setIntervalCalculation(String intervalCalculation) {
        this.intervalCalculation = intervalCalculation == null ? null : intervalCalculation.trim();
    }

    /**
     * @return DATE_CATEGORY
     */
    public String getDateCategory() {
        return dateCategory;
    }

    /**
     * @param dateCategory
     */
    public void setDateCategory(String dateCategory) {
        this.dateCategory = dateCategory == null ? null : dateCategory.trim();
    }

    /**
     * @return REPETI_PERIOD
     */
    public String getRepetiPeriod() {
        return repetiPeriod;
    }

    /**
     * @param repetiPeriod
     */
    public void setRepetiPeriod(String repetiPeriod) {
        this.repetiPeriod = repetiPeriod == null ? null : repetiPeriod.trim();
    }

    /**
     * @return REPETI_PERIOD_UNIT
     */
    public String getRepetiPeriodUnit() {
        return repetiPeriodUnit;
    }

    /**
     * @param repetiPeriodUnit
     */
    public void setRepetiPeriodUnit(String repetiPeriodUnit) {
        this.repetiPeriodUnit = repetiPeriodUnit == null ? null : repetiPeriodUnit.trim();
    }

    /**
     * @return KEY_DATE
     */
    public String getKeyDate() {
        return keyDate;
    }

    /**
     * @param keyDate
     */
    public void setKeyDate(String keyDate) {
        this.keyDate = keyDate == null ? null : keyDate.trim();
    }

    /**
     * @return FIRST_CALC_DATE
     */
    public Date getFirstCalcDate() {
        return firstCalcDate;
    }

    /**
     * @param firstCalcDate
     */
    public void setFirstCalcDate(Date firstCalcDate) {
        this.firstCalcDate = firstCalcDate;
    }

    /**
     * @return REF_DATE_CATEGORY
     */
    public String getRefDateCategory() {
        return refDateCategory;
    }

    /**
     * @param refDateCategory
     */
    public void setRefDateCategory(String refDateCategory) {
        this.refDateCategory = refDateCategory == null ? null : refDateCategory.trim();
    }

    /**
     * @return FREQUENCY_CATEGORY
     */
    public String getFrequencyCategory() {
        return frequencyCategory;
    }

    /**
     * @param frequencyCategory
     */
    public void setFrequencyCategory(String frequencyCategory) {
        this.frequencyCategory = frequencyCategory == null ? null : frequencyCategory.trim();
    }

    /**
     * @return DIFF_CATEGORY1
     */
    public String getDiffCategory1() {
        return diffCategory1;
    }

    /**
     * @param diffCategory1
     */
    public void setDiffCategory1(String diffCategory1) {
        this.diffCategory1 = diffCategory1 == null ? null : diffCategory1.trim();
    }

    /**
     * @return DIFF_VALUE1
     */
    public String getDiffValue1() {
        return diffValue1;
    }

    /**
     * @param diffValue1
     */
    public void setDiffValue1(String diffValue1) {
        this.diffValue1 = diffValue1 == null ? null : diffValue1.trim();
    }

    /**
     * @return DIFF_CATEGORY2
     */
    public String getDiffCategory2() {
        return diffCategory2;
    }

    /**
     * @param diffCategory2
     */
    public void setDiffCategory2(String diffCategory2) {
        this.diffCategory2 = diffCategory2 == null ? null : diffCategory2.trim();
    }

    /**
     * @return DIFF_VALUE2
     */
    public String getDiffValue2() {
        return diffValue2;
    }

    /**
     * @param diffValue2
     */
    public void setDiffValue2(String diffValue2) {
        this.diffValue2 = diffValue2 == null ? null : diffValue2.trim();
    }

    /**
     * @return DIFF_CATEGORY3
     */
    public String getDiffCategory3() {
        return diffCategory3;
    }

    /**
     * @param diffCategory3
     */
    public void setDiffCategory3(String diffCategory3) {
        this.diffCategory3 = diffCategory3 == null ? null : diffCategory3.trim();
    }

    /**
     * @return DIFF_VALUE3
     */
    public String getDiffValue3() {
        return diffValue3;
    }

    /**
     * @param diffValue3
     */
    public void setDiffValue3(String diffValue3) {
        this.diffValue3 = diffValue3 == null ? null : diffValue3.trim();
    }

    /**
     * @return DIFF_CATEGORY4
     */
    public String getDiffCategory4() {
        return diffCategory4;
    }

    /**
     * @param diffCategory4
     */
    public void setDiffCategory4(String diffCategory4) {
        this.diffCategory4 = diffCategory4 == null ? null : diffCategory4.trim();
    }

    /**
     * @return DIFF_VALUE4
     */
    public String getDiffValue4() {
        return diffValue4;
    }

    /**
     * @param diffValue4
     */
    public void setDiffValue4(String diffValue4) {
        this.diffValue4 = diffValue4 == null ? null : diffValue4.trim();
    }

    /**
     * @return DIFF_CATEGORY5
     */
    public String getDiffCategory5() {
        return diffCategory5;
    }

    /**
     * @param diffCategory5
     */
    public void setDiffCategory5(String diffCategory5) {
        this.diffCategory5 = diffCategory5 == null ? null : diffCategory5.trim();
    }

    /**
     * @return DIFF_VALUE5
     */
    public String getDiffValue5() {
        return diffValue5;
    }

    /**
     * @param diffValue5
     */
    public void setDiffValue5(String diffValue5) {
        this.diffValue5 = diffValue5 == null ? null : diffValue5.trim();
    }

    /**
     * @return TEL_ID
     */
    public String getTelId() {
        return telId;
    }

    /**
     * @param telId
     */
    public void setTelId(String telId) {
        this.telId = telId == null ? null : telId.trim();
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