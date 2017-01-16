package db.tool.model;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "t_loan_interest_rate_base_information")
public class TLoanInterestRateBaseInformation {
    @Column(name = "ID")
    private Long id;

    @Column(name = "BANK_CODE")
    private String bankCode;

    @Column(name = "AGREEMENT")
    private String agreement;

    @Column(name = "RECEIPT_SEQ")
    private String receiptSeq;

    @Column(name = "VAL_DATE")
    private String valDate;

    @Column(name = "LOAN_INTEREST_RATE_MODEL")
    private String loanInterestRateModel;

    @Column(name = "BENCHMARK_NTEREST_RATE_CATEGORY")
    private String benchmarkNterestRateCategory;

    @Column(name = "INTEREST_RATE_SCHEDULE")
    private String interestRateSchedule;

    @Column(name = "INTEREST_RATE_FLOATING_METHOD")
    private String interestRateFloatingMethod;

    @Column(name = "INTEREST_TATE")
    private BigDecimal interestTate;

    @Column(name = "REPRICING_FREQUENCY")
    private String repricingFrequency;

    @Column(name = "PENALTY_NTEREST_RATE_PRICING")
    private String penaltyNterestRatePricing;

    @Column(name = "PENALTY_INTEREST_RATE_FLOATING_WAY")
    private String penaltyInterestRateFloatingWay;

    @Column(name = "PENALTY_INTEREST_RATE")
    private BigDecimal penaltyInterestRate;

    @Column(name = "INTEREST_RATE_PRICING_STATU")
    private String interestRatePricingStatu;

    /**
     * @return ID
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return BANK_CODE
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * @param bankCode
     */
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }

    /**
     * @return AGREEMENT
     */
    public String getAgreement() {
        return agreement;
    }

    /**
     * @param agreement
     */
    public void setAgreement(String agreement) {
        this.agreement = agreement == null ? null : agreement.trim();
    }

    /**
     * @return RECEIPT_SEQ
     */
    public String getReceiptSeq() {
        return receiptSeq;
    }

    /**
     * @param receiptSeq
     */
    public void setReceiptSeq(String receiptSeq) {
        this.receiptSeq = receiptSeq == null ? null : receiptSeq.trim();
    }

    /**
     * @return VAL_DATE
     */
    public String getValDate() {
        return valDate;
    }

    /**
     * @param valDate
     */
    public void setValDate(String valDate) {
        this.valDate = valDate == null ? null : valDate.trim();
    }

    /**
     * @return LOAN_INTEREST_RATE_MODEL
     */
    public String getLoanInterestRateModel() {
        return loanInterestRateModel;
    }

    /**
     * @param loanInterestRateModel
     */
    public void setLoanInterestRateModel(String loanInterestRateModel) {
        this.loanInterestRateModel = loanInterestRateModel == null ? null : loanInterestRateModel.trim();
    }

    /**
     * @return BENCHMARK_NTEREST_RATE_CATEGORY
     */
    public String getBenchmarkNterestRateCategory() {
        return benchmarkNterestRateCategory;
    }

    /**
     * @param benchmarkNterestRateCategory
     */
    public void setBenchmarkNterestRateCategory(String benchmarkNterestRateCategory) {
        this.benchmarkNterestRateCategory = benchmarkNterestRateCategory == null ? null : benchmarkNterestRateCategory.trim();
    }

    /**
     * @return INTEREST_RATE_SCHEDULE
     */
    public String getInterestRateSchedule() {
        return interestRateSchedule;
    }

    /**
     * @param interestRateSchedule
     */
    public void setInterestRateSchedule(String interestRateSchedule) {
        this.interestRateSchedule = interestRateSchedule == null ? null : interestRateSchedule.trim();
    }

    /**
     * @return INTEREST_RATE_FLOATING_METHOD
     */
    public String getInterestRateFloatingMethod() {
        return interestRateFloatingMethod;
    }

    /**
     * @param interestRateFloatingMethod
     */
    public void setInterestRateFloatingMethod(String interestRateFloatingMethod) {
        this.interestRateFloatingMethod = interestRateFloatingMethod == null ? null : interestRateFloatingMethod.trim();
    }

    /**
     * @return INTEREST_TATE
     */
    public BigDecimal getInterestTate() {
        return interestTate;
    }

    /**
     * @param interestTate
     */
    public void setInterestTate(BigDecimal interestTate) {
        this.interestTate = interestTate;
    }

    /**
     * @return REPRICING_FREQUENCY
     */
    public String getRepricingFrequency() {
        return repricingFrequency;
    }

    /**
     * @param repricingFrequency
     */
    public void setRepricingFrequency(String repricingFrequency) {
        this.repricingFrequency = repricingFrequency == null ? null : repricingFrequency.trim();
    }

    /**
     * @return PENALTY_NTEREST_RATE_PRICING
     */
    public String getPenaltyNterestRatePricing() {
        return penaltyNterestRatePricing;
    }

    /**
     * @param penaltyNterestRatePricing
     */
    public void setPenaltyNterestRatePricing(String penaltyNterestRatePricing) {
        this.penaltyNterestRatePricing = penaltyNterestRatePricing == null ? null : penaltyNterestRatePricing.trim();
    }

    /**
     * @return PENALTY_INTEREST_RATE_FLOATING_WAY
     */
    public String getPenaltyInterestRateFloatingWay() {
        return penaltyInterestRateFloatingWay;
    }

    /**
     * @param penaltyInterestRateFloatingWay
     */
    public void setPenaltyInterestRateFloatingWay(String penaltyInterestRateFloatingWay) {
        this.penaltyInterestRateFloatingWay = penaltyInterestRateFloatingWay == null ? null : penaltyInterestRateFloatingWay.trim();
    }

    /**
     * @return PENALTY_INTEREST_RATE
     */
    public BigDecimal getPenaltyInterestRate() {
        return penaltyInterestRate;
    }

    /**
     * @param penaltyInterestRate
     */
    public void setPenaltyInterestRate(BigDecimal penaltyInterestRate) {
        this.penaltyInterestRate = penaltyInterestRate;
    }

    /**
     * @return INTEREST_RATE_PRICING_STATU
     */
    public String getInterestRatePricingStatu() {
        return interestRatePricingStatu;
    }

    /**
     * @param interestRatePricingStatu
     */
    public void setInterestRatePricingStatu(String interestRatePricingStatu) {
        this.interestRatePricingStatu = interestRatePricingStatu == null ? null : interestRatePricingStatu.trim();
    }
}