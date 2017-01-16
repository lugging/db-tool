package db.tool.model;

import javax.persistence.*;

@Table(name = "t_loan_ious_master_files")
public class TLoanIousMasterFiles {
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

    @Column(name = "PROD_CODE")
    private String prodCode;

    @Column(name = "CUSTOM_ID")
    private String customId;

    @Column(name = "CCY")
    private String ccy;

    @Column(name = "LOAN_AMT")
    private String loanAmt;

    @Column(name = "DATE_BEG")
    private String dateBeg;

    @Column(name = "DATE_END")
    private String dateEnd;

    @Column(name = "INTEREST_TATE")
    private String interestTate;

    @Column(name = "PENALTY_INTEREST_RATE")
    private String penaltyInterestRate;

    @Column(name = "AMOUNT_OF_TIME_LIMIT")
    private String amountOfTimeLimit;

    @Column(name = "LAST_SOLUTION_DAY")
    private String lastSolutionDay;

    @Column(name = "LOAN_CATEGORIES")
    private String loanCategories;

    @Column(name = "A_STATE")
    private String aState;

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
     * @return PROD_CODE
     */
    public String getProdCode() {
        return prodCode;
    }

    /**
     * @param prodCode
     */
    public void setProdCode(String prodCode) {
        this.prodCode = prodCode == null ? null : prodCode.trim();
    }

    /**
     * @return CUSTOM_ID
     */
    public String getCustomId() {
        return customId;
    }

    /**
     * @param customId
     */
    public void setCustomId(String customId) {
        this.customId = customId == null ? null : customId.trim();
    }

    /**
     * @return CCY
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * @param ccy
     */
    public void setCcy(String ccy) {
        this.ccy = ccy == null ? null : ccy.trim();
    }

    /**
     * @return LOAN_AMT
     */
    public String getLoanAmt() {
        return loanAmt;
    }

    /**
     * @param loanAmt
     */
    public void setLoanAmt(String loanAmt) {
        this.loanAmt = loanAmt == null ? null : loanAmt.trim();
    }

    /**
     * @return DATE_BEG
     */
    public String getDateBeg() {
        return dateBeg;
    }

    /**
     * @param dateBeg
     */
    public void setDateBeg(String dateBeg) {
        this.dateBeg = dateBeg == null ? null : dateBeg.trim();
    }

    /**
     * @return DATE_END
     */
    public String getDateEnd() {
        return dateEnd;
    }

    /**
     * @param dateEnd
     */
    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd == null ? null : dateEnd.trim();
    }

    /**
     * @return INTEREST_TATE
     */
    public String getInterestTate() {
        return interestTate;
    }

    /**
     * @param interestTate
     */
    public void setInterestTate(String interestTate) {
        this.interestTate = interestTate == null ? null : interestTate.trim();
    }

    /**
     * @return PENALTY_INTEREST_RATE
     */
    public String getPenaltyInterestRate() {
        return penaltyInterestRate;
    }

    /**
     * @param penaltyInterestRate
     */
    public void setPenaltyInterestRate(String penaltyInterestRate) {
        this.penaltyInterestRate = penaltyInterestRate == null ? null : penaltyInterestRate.trim();
    }

    /**
     * @return AMOUNT_OF_TIME_LIMIT
     */
    public String getAmountOfTimeLimit() {
        return amountOfTimeLimit;
    }

    /**
     * @param amountOfTimeLimit
     */
    public void setAmountOfTimeLimit(String amountOfTimeLimit) {
        this.amountOfTimeLimit = amountOfTimeLimit == null ? null : amountOfTimeLimit.trim();
    }

    /**
     * @return LAST_SOLUTION_DAY
     */
    public String getLastSolutionDay() {
        return lastSolutionDay;
    }

    /**
     * @param lastSolutionDay
     */
    public void setLastSolutionDay(String lastSolutionDay) {
        this.lastSolutionDay = lastSolutionDay == null ? null : lastSolutionDay.trim();
    }

    /**
     * @return LOAN_CATEGORIES
     */
    public String getLoanCategories() {
        return loanCategories;
    }

    /**
     * @param loanCategories
     */
    public void setLoanCategories(String loanCategories) {
        this.loanCategories = loanCategories == null ? null : loanCategories.trim();
    }

    /**
     * @return A_STATE
     */
    public String getaState() {
        return aState;
    }

    /**
     * @param aState
     */
    public void setaState(String aState) {
        this.aState = aState == null ? null : aState.trim();
    }
}