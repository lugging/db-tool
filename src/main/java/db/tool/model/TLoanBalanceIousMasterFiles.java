package db.tool.model;

import javax.persistence.*;

@Table(name = "t_loan_balance_ious_master_files")
public class TLoanBalanceIousMasterFiles {
    @Column(name = "ID")
    private Long id;

    @Column(name = "BANK_CODE")
    private String bankCode;

    @Column(name = "AGREEMENT")
    private String agreement;

    @Column(name = "RECEIPT_SEQ")
    private String receiptSeq;

    @Column(name = "BALD_TYPE")
    private String baldType;

    @Column(name = "BALD_LASTDAY")
    private String baldLastday;

    @Column(name = "BALD_TODAY")
    private String baldToday;

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
     * @return BALD_TYPE
     */
    public String getBaldType() {
        return baldType;
    }

    /**
     * @param baldType
     */
    public void setBaldType(String baldType) {
        this.baldType = baldType == null ? null : baldType.trim();
    }

    /**
     * @return BALD_LASTDAY
     */
    public String getBaldLastday() {
        return baldLastday;
    }

    /**
     * @param baldLastday
     */
    public void setBaldLastday(String baldLastday) {
        this.baldLastday = baldLastday == null ? null : baldLastday.trim();
    }

    /**
     * @return BALD_TODAY
     */
    public String getBaldToday() {
        return baldToday;
    }

    /**
     * @param baldToday
     */
    public void setBaldToday(String baldToday) {
        this.baldToday = baldToday == null ? null : baldToday.trim();
    }
}