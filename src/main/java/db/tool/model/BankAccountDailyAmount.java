package db.tool.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

/**
 * 每日发生额
 * @author liugang
 *
 */
@Table(name = "bank_account_daily_amount")
public class BankAccountDailyAmount {
	/**
	 * 内部合同号
	 */
    @Id
    @Column(name = "CONTRACT_ID")
    private String contractId;
    
    /**
     * 过账日期
     */
    @Id
    @Column(name = "POSTING_DATE")
    private Date postingDate;

    /**
     * 结算类型
     */
    @Id
    @Column(name = "BALANCE_TYPE")
    private String balanceType;
    
    /**
     * 币种
     */
    @Id
    @Column(name = "CURRENCY")
    private String currency;

    /**
     * 
     */
    @Id
    @Column(name = "VALUE_PER")
    private String valuePer;

    @Id
    @Column(name = "SHIFT_VALUE_DATE")
    private String shiftValueDate;

    @Id
    @Column(name = "CLOSE_NRADD")
    private String closeNradd;

    @Column(name = "DEBIT_AMOUNT_M3")
    private BigDecimal debitAmountM3;

    @Column(name = "CREDIT_AMOUNT_M3")
    private BigDecimal creditAmountM3;

    @Column(name = "DEBIT_AMOUNT_M2")
    private BigDecimal debitAmountM2;

    @Column(name = "CREDIT_AMOUNT_M2")
    private BigDecimal creditAmountM2;

    @Column(name = "DEBIT_AMOUNT_M1")
    private BigDecimal debitAmountM1;

    @Column(name = "CREDIT_AMOUNT_M1")
    private BigDecimal creditAmountM1;

    @Column(name = "DEBIT_AMOUNT")
    private BigDecimal debitAmount;

    @Column(name = "CREDIT_AMOUNT")
    private BigDecimal creditAmount;

    @Column(name = "DEBIT_AMOUNT_P1")
    private BigDecimal debitAmountP1;

    @Column(name = "CREDIT_AMOUNT_P1")
    private BigDecimal creditAmountP1;

    @Column(name = "DEBIT_AMOUNT_P2")
    private BigDecimal debitAmountP2;

    @Column(name = "CREDIT_AMOUNT_P2")
    private BigDecimal creditAmountP2;

    @Column(name = "DEBIT_AMOUNT_P3")
    private BigDecimal debitAmountP3;

    @Column(name = "CREDIT_AMOUNT_P3")
    private BigDecimal creditAmountP3;

    @Column(name = "ARCHIVE_STATUS")
    private String archiveStatus;

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
     * @return POSTING_DATE
     */
    public Date getPostingDate() {
        return postingDate;
    }

    /**
     * @param postingDate
     */
    public void setPostingDate(Date postingDate) {
        this.postingDate = postingDate;
    }

    /**
     * @return BALANCE_TYPE
     */
    public String getBalanceType() {
        return balanceType;
    }

    /**
     * @param balanceType
     */
    public void setBalanceType(String balanceType) {
        this.balanceType = balanceType == null ? null : balanceType.trim();
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
     * @return VALUE_PER
     */
    public String getValuePer() {
        return valuePer;
    }

    /**
     * @param valuePer
     */
    public void setValuePer(String valuePer) {
        this.valuePer = valuePer == null ? null : valuePer.trim();
    }

    /**
     * @return SHIFT_VALUE_DATE
     */
    public String getShiftValueDate() {
        return shiftValueDate;
    }

    /**
     * @param shiftValueDate
     */
    public void setShiftValueDate(String shiftValueDate) {
        this.shiftValueDate = shiftValueDate == null ? null : shiftValueDate.trim();
    }

    /**
     * @return CLOSE_NRADD
     */
    public String getCloseNradd() {
        return closeNradd;
    }

    /**
     * @param closeNradd
     */
    public void setCloseNradd(String closeNradd) {
        this.closeNradd = closeNradd == null ? null : closeNradd.trim();
    }

    /**
     * @return DEBIT_AMOUNT_M3
     */
    public BigDecimal getDebitAmountM3() {
        return debitAmountM3;
    }

    /**
     * @param debitAmountM3
     */
    public void setDebitAmountM3(BigDecimal debitAmountM3) {
        this.debitAmountM3 = debitAmountM3;
    }

    /**
     * @return CREDIT_AMOUNT_M3
     */
    public BigDecimal getCreditAmountM3() {
        return creditAmountM3;
    }

    /**
     * @param creditAmountM3
     */
    public void setCreditAmountM3(BigDecimal creditAmountM3) {
        this.creditAmountM3 = creditAmountM3;
    }

    /**
     * @return DEBIT_AMOUNT_M2
     */
    public BigDecimal getDebitAmountM2() {
        return debitAmountM2;
    }

    /**
     * @param debitAmountM2
     */
    public void setDebitAmountM2(BigDecimal debitAmountM2) {
        this.debitAmountM2 = debitAmountM2;
    }

    /**
     * @return CREDIT_AMOUNT_M2
     */
    public BigDecimal getCreditAmountM2() {
        return creditAmountM2;
    }

    /**
     * @param creditAmountM2
     */
    public void setCreditAmountM2(BigDecimal creditAmountM2) {
        this.creditAmountM2 = creditAmountM2;
    }

    /**
     * @return DEBIT_AMOUNT_M1
     */
    public BigDecimal getDebitAmountM1() {
        return debitAmountM1;
    }

    /**
     * @param debitAmountM1
     */
    public void setDebitAmountM1(BigDecimal debitAmountM1) {
        this.debitAmountM1 = debitAmountM1;
    }

    /**
     * @return CREDIT_AMOUNT_M1
     */
    public BigDecimal getCreditAmountM1() {
        return creditAmountM1;
    }

    /**
     * @param creditAmountM1
     */
    public void setCreditAmountM1(BigDecimal creditAmountM1) {
        this.creditAmountM1 = creditAmountM1;
    }

    /**
     * @return DEBIT_AMOUNT
     */
    public BigDecimal getDebitAmount() {
        return debitAmount;
    }

    /**
     * @param debitAmount
     */
    public void setDebitAmount(BigDecimal debitAmount) {
        this.debitAmount = debitAmount;
    }

    /**
     * @return CREDIT_AMOUNT
     */
    public BigDecimal getCreditAmount() {
        return creditAmount;
    }

    /**
     * @param creditAmount
     */
    public void setCreditAmount(BigDecimal creditAmount) {
        this.creditAmount = creditAmount;
    }

    /**
     * @return DEBIT_AMOUNT_P1
     */
    public BigDecimal getDebitAmountP1() {
        return debitAmountP1;
    }

    /**
     * @param debitAmountP1
     */
    public void setDebitAmountP1(BigDecimal debitAmountP1) {
        this.debitAmountP1 = debitAmountP1;
    }

    /**
     * @return CREDIT_AMOUNT_P1
     */
    public BigDecimal getCreditAmountP1() {
        return creditAmountP1;
    }

    /**
     * @param creditAmountP1
     */
    public void setCreditAmountP1(BigDecimal creditAmountP1) {
        this.creditAmountP1 = creditAmountP1;
    }

    /**
     * @return DEBIT_AMOUNT_P2
     */
    public BigDecimal getDebitAmountP2() {
        return debitAmountP2;
    }

    /**
     * @param debitAmountP2
     */
    public void setDebitAmountP2(BigDecimal debitAmountP2) {
        this.debitAmountP2 = debitAmountP2;
    }

    /**
     * @return CREDIT_AMOUNT_P2
     */
    public BigDecimal getCreditAmountP2() {
        return creditAmountP2;
    }

    /**
     * @param creditAmountP2
     */
    public void setCreditAmountP2(BigDecimal creditAmountP2) {
        this.creditAmountP2 = creditAmountP2;
    }

    /**
     * @return DEBIT_AMOUNT_P3
     */
    public BigDecimal getDebitAmountP3() {
        return debitAmountP3;
    }

    /**
     * @param debitAmountP3
     */
    public void setDebitAmountP3(BigDecimal debitAmountP3) {
        this.debitAmountP3 = debitAmountP3;
    }

    /**
     * @return CREDIT_AMOUNT_P3
     */
    public BigDecimal getCreditAmountP3() {
        return creditAmountP3;
    }

    /**
     * @param creditAmountP3
     */
    public void setCreditAmountP3(BigDecimal creditAmountP3) {
        this.creditAmountP3 = creditAmountP3;
    }

    /**
     * @return ARCHIVE_STATUS
     */
    public String getArchiveStatus() {
        return archiveStatus;
    }

    /**
     * @param archiveStatus
     */
    public void setArchiveStatus(String archiveStatus) {
        this.archiveStatus = archiveStatus == null ? null : archiveStatus.trim();
    }
}