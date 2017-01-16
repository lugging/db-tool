package db.tool.model;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "t_loan_agreement_basic_info")
public class TLoanAgreementBasicInfo {
    @Column(name = "ID")
    private Long id;

    @Column(name = "BANK_CODE")
    private String bankCode;

    @Column(name = "BRAN_CODE")
    private String branCode;

    @Column(name = "AGREEMENT")
    private String agreement;

    @Column(name = "LOAN_AGREEMENT_STATUS")
    private String loanAgreementStatus;

    @Column(name = "LOAN_MAKE_STATUS")
    private String loanMakeStatus;

    @Column(name = "CUSTOM_ID")
    private String customId;

    @Column(name = "PROD_CODE")
    private String prodCode;

    @Column(name = "LOAN_CATEGORIES")
    private String loanCategories;

    @Column(name = "CCY")
    private String ccy;

    @Column(name = "AGREEMENT_AMOUNT")
    private BigDecimal agreementAmount;

    @Column(name = "DATE_BEG")
    private String dateBeg;

    @Column(name = "DATE_END")
    private String dateEnd;

    @Column(name = "LOAN_MANAGEMENT_TYPE")
    private String loanManagementType;

    @Column(name = "INT_DAY_TYPE")
    private String intDayType;

    @Column(name = "BASE_RATE")
    private String baseRate;

    @Column(name = "CLIENT_CUSTOMER_NUMBER")
    private String clientCustomerNumber;

    @Column(name = "REPAYMENT_TYPE")
    private String repaymentType;

    @Column(name = "FIRST_REPAYMENT_DATE")
    private String firstRepaymentDate;

    @Column(name = "REPAYMENT_PERIOD")
    private String repaymentPeriod;

    @Column(name = "AUTOMATIC_DEBIT_TYPE")
    private String automaticDebitType;

    @Column(name = "LOAN_ACCOUNT")
    private String loanAccount;

    @Column(name = "REPAYMENT_ACCOUNT")
    private String repaymentAccount;

    @Column(name = "COMMISSION_SETTLEMENT_ACCOUNT")
    private String commissionSettlementAccount;

    @Column(name = "COMMISSION_DEPOSIT_ACCOUNT")
    private String commissionDepositAccount;

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
     * @return LOAN_AGREEMENT_STATUS
     */
    public String getLoanAgreementStatus() {
        return loanAgreementStatus;
    }

    /**
     * @param loanAgreementStatus
     */
    public void setLoanAgreementStatus(String loanAgreementStatus) {
        this.loanAgreementStatus = loanAgreementStatus == null ? null : loanAgreementStatus.trim();
    }

    /**
     * @return LOAN_MAKE_STATUS
     */
    public String getLoanMakeStatus() {
        return loanMakeStatus;
    }

    /**
     * @param loanMakeStatus
     */
    public void setLoanMakeStatus(String loanMakeStatus) {
        this.loanMakeStatus = loanMakeStatus == null ? null : loanMakeStatus.trim();
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
     * @return AGREEMENT_AMOUNT
     */
    public BigDecimal getAgreementAmount() {
        return agreementAmount;
    }

    /**
     * @param agreementAmount
     */
    public void setAgreementAmount(BigDecimal agreementAmount) {
        this.agreementAmount = agreementAmount;
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
     * @return LOAN_MANAGEMENT_TYPE
     */
    public String getLoanManagementType() {
        return loanManagementType;
    }

    /**
     * @param loanManagementType
     */
    public void setLoanManagementType(String loanManagementType) {
        this.loanManagementType = loanManagementType == null ? null : loanManagementType.trim();
    }

    /**
     * @return INT_DAY_TYPE
     */
    public String getIntDayType() {
        return intDayType;
    }

    /**
     * @param intDayType
     */
    public void setIntDayType(String intDayType) {
        this.intDayType = intDayType == null ? null : intDayType.trim();
    }

    /**
     * @return BASE_RATE
     */
    public String getBaseRate() {
        return baseRate;
    }

    /**
     * @param baseRate
     */
    public void setBaseRate(String baseRate) {
        this.baseRate = baseRate == null ? null : baseRate.trim();
    }

    /**
     * @return CLIENT_CUSTOMER_NUMBER
     */
    public String getClientCustomerNumber() {
        return clientCustomerNumber;
    }

    /**
     * @param clientCustomerNumber
     */
    public void setClientCustomerNumber(String clientCustomerNumber) {
        this.clientCustomerNumber = clientCustomerNumber == null ? null : clientCustomerNumber.trim();
    }

    /**
     * @return REPAYMENT_TYPE
     */
    public String getRepaymentType() {
        return repaymentType;
    }

    /**
     * @param repaymentType
     */
    public void setRepaymentType(String repaymentType) {
        this.repaymentType = repaymentType == null ? null : repaymentType.trim();
    }

    /**
     * @return FIRST_REPAYMENT_DATE
     */
    public String getFirstRepaymentDate() {
        return firstRepaymentDate;
    }

    /**
     * @param firstRepaymentDate
     */
    public void setFirstRepaymentDate(String firstRepaymentDate) {
        this.firstRepaymentDate = firstRepaymentDate == null ? null : firstRepaymentDate.trim();
    }

    /**
     * @return REPAYMENT_PERIOD
     */
    public String getRepaymentPeriod() {
        return repaymentPeriod;
    }

    /**
     * @param repaymentPeriod
     */
    public void setRepaymentPeriod(String repaymentPeriod) {
        this.repaymentPeriod = repaymentPeriod == null ? null : repaymentPeriod.trim();
    }

    /**
     * @return AUTOMATIC_DEBIT_TYPE
     */
    public String getAutomaticDebitType() {
        return automaticDebitType;
    }

    /**
     * @param automaticDebitType
     */
    public void setAutomaticDebitType(String automaticDebitType) {
        this.automaticDebitType = automaticDebitType == null ? null : automaticDebitType.trim();
    }

    /**
     * @return LOAN_ACCOUNT
     */
    public String getLoanAccount() {
        return loanAccount;
    }

    /**
     * @param loanAccount
     */
    public void setLoanAccount(String loanAccount) {
        this.loanAccount = loanAccount == null ? null : loanAccount.trim();
    }

    /**
     * @return REPAYMENT_ACCOUNT
     */
    public String getRepaymentAccount() {
        return repaymentAccount;
    }

    /**
     * @param repaymentAccount
     */
    public void setRepaymentAccount(String repaymentAccount) {
        this.repaymentAccount = repaymentAccount == null ? null : repaymentAccount.trim();
    }

    /**
     * @return COMMISSION_SETTLEMENT_ACCOUNT
     */
    public String getCommissionSettlementAccount() {
        return commissionSettlementAccount;
    }

    /**
     * @param commissionSettlementAccount
     */
    public void setCommissionSettlementAccount(String commissionSettlementAccount) {
        this.commissionSettlementAccount = commissionSettlementAccount == null ? null : commissionSettlementAccount.trim();
    }

    /**
     * @return COMMISSION_DEPOSIT_ACCOUNT
     */
    public String getCommissionDepositAccount() {
        return commissionDepositAccount;
    }

    /**
     * @param commissionDepositAccount
     */
    public void setCommissionDepositAccount(String commissionDepositAccount) {
        this.commissionDepositAccount = commissionDepositAccount == null ? null : commissionDepositAccount.trim();
    }
}