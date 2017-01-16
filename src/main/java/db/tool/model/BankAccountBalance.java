package db.tool.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

/**
 * 账户余额表
 * @author liugang
 *
 */
@Table(name = "bank_account_balance")
public class BankAccountBalance {
    /**
     * 内部合同号
     */
    @Id
    @Column(name = "CONTRACT_ID")
    private String contractId;

    /**
     * 余额类型
     */
    @Id
    @Column(name = "BALANCE_TYPE")
    private String balanceType;

    /**
     * 金额
     */
    @Column(name = "AMOUNT")
    private BigDecimal amount;

    /**
     * 币种
     */
    @Column(name = "CURRENCY")
    private String currency;

    @Column(name = "LAST_SETTLEMENT_DATE")
    private Date lastSettlementDate;

    @Column(name = "LAST_CHANGE_TIMESTAMP")
    private Date lastChangeTimestamp;

    @Column(name = "LAST_CHANGE_TIMESTAMP_C")
    private Date lastChangeTimestampC;

    /**
     * 获取内部合同号
     *
     * @return CONTRACT_ID - 内部合同号
     */
    public String getContractId() {
        return contractId;
    }

    /**
     * 设置内部合同号
     *
     * @param contractId 内部合同号
     */
    public void setContractId(String contractId) {
        this.contractId = contractId == null ? null : contractId.trim();
    }

    /**
     * 获取余额类型
     *
     * @return BALANCE_TYPE - 余额类型
     */
    public String getBalanceType() {
        return balanceType;
    }

    /**
     * 设置余额类型
     *
     * @param balanceType 余额类型
     */
    public void setBalanceType(String balanceType) {
        this.balanceType = balanceType == null ? null : balanceType.trim();
    }

    /**
     * 获取金额
     *
     * @return AMOUNT - 金额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置金额
     *
     * @param amount 金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 获取币种
     *
     * @return CURRENCY - 币种
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * 设置币种
     *
     * @param currency 币种
     */
    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    /**
     * @return LAST_SETTLEMENT_DATE
     */
    public Date getLastSettlementDate() {
        return lastSettlementDate;
    }

    /**
     * @param lastSettlementDate
     */
    public void setLastSettlementDate(Date lastSettlementDate) {
        this.lastSettlementDate = lastSettlementDate;
    }

    /**
     * @return LAST_CHANGE_TIMESTAMP
     */
    public Date getLastChangeTimestamp() {
        return lastChangeTimestamp;
    }

    /**
     * @param lastChangeTimestamp
     */
    public void setLastChangeTimestamp(Date lastChangeTimestamp) {
        this.lastChangeTimestamp = lastChangeTimestamp;
    }

    /**
     * @return LAST_CHANGE_TIMESTAMP_C
     */
    public Date getLastChangeTimestampC() {
        return lastChangeTimestampC;
    }

    /**
     * @param lastChangeTimestampC
     */
    public void setLastChangeTimestampC(Date lastChangeTimestampC) {
        this.lastChangeTimestampC = lastChangeTimestampC;
    }
}