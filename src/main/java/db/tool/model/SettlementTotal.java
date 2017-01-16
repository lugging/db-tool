package db.tool.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "settlement_total")
public class SettlementTotal {
    @Id
    @Column(name = "CONTRACT_ID")
    private String contractId;

    @Id
    @Column(name = "SETTLEMENT_TYPE")
    private String settlementType;

    @Id
    @Column(name = "SETTLE_PERIOD")
    private String settlePeriod;

    @Id
    @Column(name = "SETTLE_COUNT")
    private String settleCount;

    @Column(name = "SETTLE_REVERSE_FLAG")
    private String settleReverseFlag;

    @Column(name = "REVERSE_TIMESTAMP")
    private Date reverseTimestamp;

    @Column(name = "CURRENCY")
    private String currency;

    @Column(name = "START_TIMESTAMP")
    private Date startTimestamp;

    @Column(name = "END_TIMESTAMP")
    private Date endTimestamp;

    @Column(name = "SETTLE_TIMESTAMP")
    private Date settleTimestamp;

    @Column(name = "POST_FLAG")
    private String postFlag;

    @Column(name = "PAY_ITEM_ID")
    private String payItemId;

    @Column(name = "OPERATOR")
    private String operator;

    @Column(name = "POSTING_AREA")
    private String postingArea;

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
     * @return SETTLEMENT_TYPE
     */
    public String getSettlementType() {
        return settlementType;
    }

    /**
     * @param settlementType
     */
    public void setSettlementType(String settlementType) {
        this.settlementType = settlementType == null ? null : settlementType.trim();
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

    /**
     * @return SETTLE_REVERSE_FLAG
     */
    public String getSettleReverseFlag() {
        return settleReverseFlag;
    }

    /**
     * @param settleReverseFlag
     */
    public void setSettleReverseFlag(String settleReverseFlag) {
        this.settleReverseFlag = settleReverseFlag == null ? null : settleReverseFlag.trim();
    }

    /**
     * @return REVERSE_TIMESTAMP
     */
    public Date getReverseTimestamp() {
        return reverseTimestamp;
    }

    /**
     * @param reverseTimestamp
     */
    public void setReverseTimestamp(Date reverseTimestamp) {
        this.reverseTimestamp = reverseTimestamp;
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
     * @return START_TIMESTAMP
     */
    public Date getStartTimestamp() {
        return startTimestamp;
    }

    /**
     * @param startTimestamp
     */
    public void setStartTimestamp(Date startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    /**
     * @return END_TIMESTAMP
     */
    public Date getEndTimestamp() {
        return endTimestamp;
    }

    /**
     * @param endTimestamp
     */
    public void setEndTimestamp(Date endTimestamp) {
        this.endTimestamp = endTimestamp;
    }

    /**
     * @return SETTLE_TIMESTAMP
     */
    public Date getSettleTimestamp() {
        return settleTimestamp;
    }

    /**
     * @param settleTimestamp
     */
    public void setSettleTimestamp(Date settleTimestamp) {
        this.settleTimestamp = settleTimestamp;
    }

    /**
     * @return POST_FLAG
     */
    public String getPostFlag() {
        return postFlag;
    }

    /**
     * @param postFlag
     */
    public void setPostFlag(String postFlag) {
        this.postFlag = postFlag == null ? null : postFlag.trim();
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
     * @return OPERATOR
     */
    public String getOperator() {
        return operator;
    }

    /**
     * @param operator
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * @return POSTING_AREA
     */
    public String getPostingArea() {
        return postingArea;
    }

    /**
     * @param postingArea
     */
    public void setPostingArea(String postingArea) {
        this.postingArea = postingArea == null ? null : postingArea.trim();
    }
}