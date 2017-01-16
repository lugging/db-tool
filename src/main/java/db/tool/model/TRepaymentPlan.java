package db.tool.model;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "t_repayment_plan")
public class TRepaymentPlan {
    @Column(name = "ID")
    private Long id;

    @Column(name = "BANK_CODE")
    private String bankCode;

    @Column(name = "BRAN_CODE")
    private String branCode;

    @Column(name = "AGREEMENT")
    private String agreement;

    @Column(name = "RECEIPT_SEQ")
    private String receiptSeq;

    @Column(name = "NPER")
    private BigDecimal nper;

    @Column(name = "TURN_OVERDUE_DATE")
    private String turnOverdueDate;

    @Column(name = "PAYOUT_DATE")
    private String payoutDate;

    @Column(name = "PLAN_DATE")
    private String planDate;

    @Column(name = "DATE_INTEREST_SETTLEMENT")
    private String dateInterestSettlement;

    @Column(name = "PLAN_THE_PRINCIPAL")
    private BigDecimal planThePrincipal;

    @Column(name = "PLAN_THE_INTEREST")
    private BigDecimal planTheInterest;

    @Column(name = "SHOULD_BE_THE_PRINCIPAL")
    private BigDecimal shouldBeThePrincipal;

    @Column(name = "SHOULD_BE_ALSO_OF_INTEREST")
    private BigDecimal shouldBeAlsoOfInterest;

    @Column(name = "REPAYMENT_PLAN")
    private String repaymentPlan;

    @Column(name = "IOUS_BALANCE")
    private BigDecimal iousBalance;

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
     * @return BRAN_CODE
     */
    public String getBranCode() {
        return branCode;
    }

    /**
     * @param branCode
     */
    public void setBranCode(String branCode) {
        this.branCode = branCode == null ? null : branCode.trim();
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
     * @return NPER
     */
    public BigDecimal getNper() {
        return nper;
    }

    /**
     * @param nper
     */
    public void setNper(BigDecimal nper) {
        this.nper = nper;
    }

    /**
     * @return TURN_OVERDUE_DATE
     */
    public String getTurnOverdueDate() {
        return turnOverdueDate;
    }

    /**
     * @param turnOverdueDate
     */
    public void setTurnOverdueDate(String turnOverdueDate) {
        this.turnOverdueDate = turnOverdueDate == null ? null : turnOverdueDate.trim();
    }

    /**
     * @return PAYOUT_DATE
     */
    public String getPayoutDate() {
        return payoutDate;
    }

    /**
     * @param payoutDate
     */
    public void setPayoutDate(String payoutDate) {
        this.payoutDate = payoutDate == null ? null : payoutDate.trim();
    }

    /**
     * @return PLAN_DATE
     */
    public String getPlanDate() {
        return planDate;
    }

    /**
     * @param planDate
     */
    public void setPlanDate(String planDate) {
        this.planDate = planDate == null ? null : planDate.trim();
    }

    /**
     * @return DATE_INTEREST_SETTLEMENT
     */
    public String getDateInterestSettlement() {
        return dateInterestSettlement;
    }

    /**
     * @param dateInterestSettlement
     */
    public void setDateInterestSettlement(String dateInterestSettlement) {
        this.dateInterestSettlement = dateInterestSettlement == null ? null : dateInterestSettlement.trim();
    }

    /**
     * @return PLAN_THE_PRINCIPAL
     */
    public BigDecimal getPlanThePrincipal() {
        return planThePrincipal;
    }

    /**
     * @param planThePrincipal
     */
    public void setPlanThePrincipal(BigDecimal planThePrincipal) {
        this.planThePrincipal = planThePrincipal;
    }

    /**
     * @return PLAN_THE_INTEREST
     */
    public BigDecimal getPlanTheInterest() {
        return planTheInterest;
    }

    /**
     * @param planTheInterest
     */
    public void setPlanTheInterest(BigDecimal planTheInterest) {
        this.planTheInterest = planTheInterest;
    }

    /**
     * @return SHOULD_BE_THE_PRINCIPAL
     */
    public BigDecimal getShouldBeThePrincipal() {
        return shouldBeThePrincipal;
    }

    /**
     * @param shouldBeThePrincipal
     */
    public void setShouldBeThePrincipal(BigDecimal shouldBeThePrincipal) {
        this.shouldBeThePrincipal = shouldBeThePrincipal;
    }

    /**
     * @return SHOULD_BE_ALSO_OF_INTEREST
     */
    public BigDecimal getShouldBeAlsoOfInterest() {
        return shouldBeAlsoOfInterest;
    }

    /**
     * @param shouldBeAlsoOfInterest
     */
    public void setShouldBeAlsoOfInterest(BigDecimal shouldBeAlsoOfInterest) {
        this.shouldBeAlsoOfInterest = shouldBeAlsoOfInterest;
    }

    /**
     * @return REPAYMENT_PLAN
     */
    public String getRepaymentPlan() {
        return repaymentPlan;
    }

    /**
     * @param repaymentPlan
     */
    public void setRepaymentPlan(String repaymentPlan) {
        this.repaymentPlan = repaymentPlan == null ? null : repaymentPlan.trim();
    }

    /**
     * @return IOUS_BALANCE
     */
    public BigDecimal getIousBalance() {
        return iousBalance;
    }

    /**
     * @param iousBalance
     */
    public void setIousBalance(BigDecimal iousBalance) {
        this.iousBalance = iousBalance;
    }
}