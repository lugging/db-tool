package db.tool.model;

import java.util.Date;
import javax.persistence.*;

/**
 * 1.1	账户层结息日期表-特征
 * @author liugang
 *
 */
@Table(name = "bank_parsed_account_day")
public class BankParsedAccountDay {
    @Id
    @Column(name = "CONTRACT_ID")
    private String contractId;

    @Id
    @Column(name = "TIMESTAMP")
    private Date timestamp;

    @Column(name = "ACCOUNT_NO")
    private String accountNo;
    
    /**
     * 过账区间
     */
    @Column(name = "POSTING_AREA")
    private String postingArea;

    /**
     * 
     */
    @Column(name = "PRODUCT_INTER_ID")
    private String productInterId;

    /**
     * 下次结息日期
     */
    @Column(name = "NEXT_SETTLEMENT_DATE")
    private Date nextSettlementDate;
    
    /**
     * 上次结息日期
     */
    @Column(name = "LAST_SETTLEMENT_DATE")
    private Date lastSettlementDate;

    /**
     * 执行人 操作人员用户名
     */
    @Column(name = "OPERATOR")
    private String operator;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "CREATE_TELLER")
    private String createTeller;

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
     * @return ACCOUNT_NO
     */
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * @param accountNo
     */
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo == null ? null : accountNo.trim();
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

    /**
     * @return PRODUCT_INTER_ID
     */
    public String getProductInterId() {
        return productInterId;
    }

    /**
     * @param productInterId
     */
    public void setProductInterId(String productInterId) {
        this.productInterId = productInterId == null ? null : productInterId.trim();
    }

    /**
     * @return NEXT_SETTLEMENT_DATE
     */
    public Date getNextSettlementDate() {
        return nextSettlementDate;
    }

    /**
     * @param nextSettlementDate
     */
    public void setNextSettlementDate(Date nextSettlementDate) {
        this.nextSettlementDate = nextSettlementDate;
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
     * @return CREATE_TELLER
     */
    public String getCreateTeller() {
        return createTeller;
    }

    /**
     * @param createTeller
     */
    public void setCreateTeller(String createTeller) {
        this.createTeller = createTeller == null ? null : createTeller.trim();
    }
}