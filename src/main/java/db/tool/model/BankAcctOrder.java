package db.tool.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "bank_acct_order")
public class BankAcctOrder {
    @Id
    @Column(name = "CONTRACT_ID")
    private String contractId;

    @Id
    @Column(name = "ORDER_ID")
    private String orderId;

    @Column(name = "SERIAL_decimal")
    private String serialDecimal;

    @Column(name = "ORDER_TYPE")
    private String orderType;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "POSTING_DATE")
    private Date postingDate;

    @Column(name = "DUE_DATE")
    private Date dueDate;

    @Column(name = "TIMESTAMP")
    private Date timestamp;

    @Column(name = "PAY_ITEM_ID")
    private String payItemId;

    @Column(name = "UPDATOR")
    private String updator;

    @Column(name = "SETTLE_PERIOD")
    private String settlePeriod;

    @Column(name = "SETTLE_COUNT")
    private String settleCount;

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
     * @return ORDER_ID
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param orderId
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * @return SERIAL_decimal
     */
    public String getSerialDecimal() {
        return serialDecimal;
    }

    /**
     * @param serialDecimal
     */
    public void setSerialDecimal(String serialDecimal) {
        this.serialDecimal = serialDecimal == null ? null : serialDecimal.trim();
    }

    /**
     * @return ORDER_TYPE
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * @param orderType
     */
    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
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
     * @return DUE_DATE
     */
    public Date getDueDate() {
        return dueDate;
    }

    /**
     * @param dueDate
     */
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * @return TIMESTAMP
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * @param timestamp
     */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * @return PAY_ITEM_ID
     */
    public String getPayItemId() {
        return payItemId;
    }

    /**
     * @param payItemId
     */
    public void setPayItemId(String payItemId) {
        this.payItemId = payItemId == null ? null : payItemId.trim();
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
     * @return SETTLE_PERIOD
     */
    public String getSettlePeriod() {
        return settlePeriod;
    }

    /**
     * @param settlePeriod
     */
    public void setSettlePeriod(String settlePeriod) {
        this.settlePeriod = settlePeriod == null ? null : settlePeriod.trim();
    }

    /**
     * @return SETTLE_COUNT
     */
    public String getSettleCount() {
        return settleCount;
    }

    /**
     * @param settleCount
     */
    public void setSettleCount(String settleCount) {
        this.settleCount = settleCount == null ? null : settleCount.trim();
    }
}