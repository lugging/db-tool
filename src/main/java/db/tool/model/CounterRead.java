package db.tool.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "counter_read")
public class CounterRead {
    @Id
    @Column(name = "CONTRACT_ID")
    private String contractId;

    @Id
    @Column(name = "COUNTER_TYPE")
    private String counterType;

    @Id
    @Column(name = "COUNT_TIMESTMP")
    private Date countTimestmp;

    @Id
    @Column(name = "COUNTER")
    private String counter;

    @Id
    @Column(name = "CURRENCY")
    private String currency;

    @Column(name = "COUNTERREADING")
    private Integer counterreading;

    @Column(name = "AMOUNT")
    private BigDecimal amount;

    @Column(name = "CHANGE_TIMESTAMP")
    private Date changeTimestamp;

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
     * @return COUNTER_TYPE
     */
    public String getCounterType() {
        return counterType;
    }

    /**
     * @param counterType
     */
    public void setCounterType(String counterType) {
        this.counterType = counterType == null ? null : counterType.trim();
    }

    /**
     * @return COUNT_TIMESTMP
     */
    public Date getCountTimestmp() {
        return countTimestmp;
    }

    /**
     * @param countTimestmp
     */
    public void setCountTimestmp(Date countTimestmp) {
        this.countTimestmp = countTimestmp;
    }

    /**
     * @return COUNTER
     */
    public String getCounter() {
        return counter;
    }

    /**
     * @param counter
     */
    public void setCounter(String counter) {
        this.counter = counter == null ? null : counter.trim();
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
     * @return COUNTERREADING
     */
    public Integer getCounterreading() {
        return counterreading;
    }

    /**
     * @param counterreading
     */
    public void setCounterreading(Integer counterreading) {
        this.counterreading = counterreading;
    }

    /**
     * @return AMOUNT
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * @param amount
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * @return CHANGE_TIMESTAMP
     */
    public Date getChangeTimestamp() {
        return changeTimestamp;
    }

    /**
     * @param changeTimestamp
     */
    public void setChangeTimestamp(Date changeTimestamp) {
        this.changeTimestamp = changeTimestamp;
    }
}