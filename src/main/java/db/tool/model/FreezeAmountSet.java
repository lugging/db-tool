package db.tool.model;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "freeze_amount_set")
public class FreezeAmountSet {
    @Id
    @Column(name = "EVENT_TYPE")
    private String eventType;

    @Column(name = "LOCK_AMOUNT_TO")
    private BigDecimal lockAmountTo;

    @Column(name = "LOCK_AMOUNT_FROM")
    private BigDecimal lockAmountFrom;

    @Column(name = "FIX_AMOUNT")
    private BigDecimal fixAmount;

    @Column(name = "CURRENCY")
    private String currency;

    /**
     * @return EVENT_TYPE
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * @param eventType
     */
    public void setEventType(String eventType) {
        this.eventType = eventType == null ? null : eventType.trim();
    }

    /**
     * @return LOCK_AMOUNT_TO
     */
    public BigDecimal getLockAmountTo() {
        return lockAmountTo;
    }

    /**
     * @param lockAmountTo
     */
    public void setLockAmountTo(BigDecimal lockAmountTo) {
        this.lockAmountTo = lockAmountTo;
    }

    /**
     * @return LOCK_AMOUNT_FROM
     */
    public BigDecimal getLockAmountFrom() {
        return lockAmountFrom;
    }

    /**
     * @param lockAmountFrom
     */
    public void setLockAmountFrom(BigDecimal lockAmountFrom) {
        this.lockAmountFrom = lockAmountFrom;
    }

    /**
     * @return FIX_AMOUNT
     */
    public BigDecimal getFixAmount() {
        return fixAmount;
    }

    /**
     * @param fixAmount
     */
    public void setFixAmount(BigDecimal fixAmount) {
        this.fixAmount = fixAmount;
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
}