package db.tool.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "pi_lock_relation")
public class PiLockRelation {
    @Id
    @Column(name = "CONTRACT_ID")
    private String contractId;

    @Id
    @Column(name = "PAYMENT_ITEM_ID")
    private String paymentItemId;

    @Column(name = "LOCK_NUM")
    private String lockNum;

    @Column(name = "LOCK_AMOUNT")
    private BigDecimal lockAmount;

    @Column(name = "TRANS_AMOUNT")
    private BigDecimal transAmount;

    @Column(name = "CURRENCY")
    private String currency;

    @Column(name = "POSTING_DATE")
    private Date postingDate;

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
     * @return PAYMENT_ITEM_ID
     */
    public String getPaymentItemId() {
        return paymentItemId;
    }

    /**
     * @param paymentItemId
     */
    public void setPaymentItemId(String paymentItemId) {
        this.paymentItemId = paymentItemId == null ? null : paymentItemId.trim();
    }

    /**
     * @return LOCK_NUM
     */
    public String getLockNum() {
        return lockNum;
    }

    /**
     * @param lockNum
     */
    public void setLockNum(String lockNum) {
        this.lockNum = lockNum == null ? null : lockNum.trim();
    }

    /**
     * @return LOCK_AMOUNT
     */
    public BigDecimal getLockAmount() {
        return lockAmount;
    }

    /**
     * @param lockAmount
     */
    public void setLockAmount(BigDecimal lockAmount) {
        this.lockAmount = lockAmount;
    }

    /**
     * @return TRANS_AMOUNT
     */
    public BigDecimal getTransAmount() {
        return transAmount;
    }

    /**
     * @param transAmount
     */
    public void setTransAmount(BigDecimal transAmount) {
        this.transAmount = transAmount;
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
}