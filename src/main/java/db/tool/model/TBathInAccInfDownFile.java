package db.tool.model;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "t_bath_in_acc_inf_down_file")
public class TBathInAccInfDownFile {
    @Column(name = "HOST_BATCH_CODE")
    private String hostBatchCode;

    @Column(name = "CUSTOMER_ACC")
    private String customerAcc;

    @Column(name = "PERSONAL_ACCOUNT_NO")
    private String personalAccountNo;

    @Column(name = "ACC_NAME")
    private String accName;

    @Column(name = "CCY")
    private String ccy;

    @Column(name = "BANK_REMIT_ID")
    private String bankRemitId;

    @Column(name = "TS_AMT")
    private BigDecimal tsAmt;

    @Column(name = "COUNT_AMT")
    private BigDecimal countAmt;

    @Column(name = "SHOU_AMT")
    private BigDecimal shouAmt;

    @Column(name = "DEDUCTION_TYPE")
    private String deductionType;

    @Column(name = "DEDUCTION_ACC")
    private String deductionAcc;

    @Column(name = "BATCH_STATUS")
    private String batchStatus;

    @Column(name = "INFORMATION_CODE")
    private String informationCode;

    @Column(name = "PROMPT_INFO")
    private String promptInfo;

    @Column(name = "TRANSACTION_DATE")
    private String transactionDate;

    @Column(name = "TRANSACTION_LOG_NO")
    private String transactionLogNo;

    /**
     * @return HOST_BATCH_CODE
     */
    public String getHostBatchCode() {
        return hostBatchCode;
    }

    /**
     * @param hostBatchCode
     */
    public void setHostBatchCode(String hostBatchCode) {
        this.hostBatchCode = hostBatchCode == null ? null : hostBatchCode.trim();
    }

    /**
     * @return CUSTOMER_ACC
     */
    public String getCustomerAcc() {
        return customerAcc;
    }

    /**
     * @param customerAcc
     */
    public void setCustomerAcc(String customerAcc) {
        this.customerAcc = customerAcc == null ? null : customerAcc.trim();
    }

    /**
     * @return PERSONAL_ACCOUNT_NO
     */
    public String getPersonalAccountNo() {
        return personalAccountNo;
    }

    /**
     * @param personalAccountNo
     */
    public void setPersonalAccountNo(String personalAccountNo) {
        this.personalAccountNo = personalAccountNo == null ? null : personalAccountNo.trim();
    }

    /**
     * @return ACC_NAME
     */
    public String getAccName() {
        return accName;
    }

    /**
     * @param accName
     */
    public void setAccName(String accName) {
        this.accName = accName == null ? null : accName.trim();
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
     * @return BANK_REMIT_ID
     */
    public String getBankRemitId() {
        return bankRemitId;
    }

    /**
     * @param bankRemitId
     */
    public void setBankRemitId(String bankRemitId) {
        this.bankRemitId = bankRemitId == null ? null : bankRemitId.trim();
    }

    /**
     * @return TS_AMT
     */
    public BigDecimal getTsAmt() {
        return tsAmt;
    }

    /**
     * @param tsAmt
     */
    public void setTsAmt(BigDecimal tsAmt) {
        this.tsAmt = tsAmt;
    }

    /**
     * @return COUNT_AMT
     */
    public BigDecimal getCountAmt() {
        return countAmt;
    }

    /**
     * @param countAmt
     */
    public void setCountAmt(BigDecimal countAmt) {
        this.countAmt = countAmt;
    }

    /**
     * @return SHOU_AMT
     */
    public BigDecimal getShouAmt() {
        return shouAmt;
    }

    /**
     * @param shouAmt
     */
    public void setShouAmt(BigDecimal shouAmt) {
        this.shouAmt = shouAmt;
    }

    /**
     * @return DEDUCTION_TYPE
     */
    public String getDeductionType() {
        return deductionType;
    }

    /**
     * @param deductionType
     */
    public void setDeductionType(String deductionType) {
        this.deductionType = deductionType == null ? null : deductionType.trim();
    }

    /**
     * @return DEDUCTION_ACC
     */
    public String getDeductionAcc() {
        return deductionAcc;
    }

    /**
     * @param deductionAcc
     */
    public void setDeductionAcc(String deductionAcc) {
        this.deductionAcc = deductionAcc == null ? null : deductionAcc.trim();
    }

    /**
     * @return BATCH_STATUS
     */
    public String getBatchStatus() {
        return batchStatus;
    }

    /**
     * @param batchStatus
     */
    public void setBatchStatus(String batchStatus) {
        this.batchStatus = batchStatus == null ? null : batchStatus.trim();
    }

    /**
     * @return INFORMATION_CODE
     */
    public String getInformationCode() {
        return informationCode;
    }

    /**
     * @param informationCode
     */
    public void setInformationCode(String informationCode) {
        this.informationCode = informationCode == null ? null : informationCode.trim();
    }

    /**
     * @return PROMPT_INFO
     */
    public String getPromptInfo() {
        return promptInfo;
    }

    /**
     * @param promptInfo
     */
    public void setPromptInfo(String promptInfo) {
        this.promptInfo = promptInfo == null ? null : promptInfo.trim();
    }

    /**
     * @return TRANSACTION_DATE
     */
    public String getTransactionDate() {
        return transactionDate;
    }

    /**
     * @param transactionDate
     */
    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate == null ? null : transactionDate.trim();
    }

    /**
     * @return TRANSACTION_LOG_NO
     */
    public String getTransactionLogNo() {
        return transactionLogNo;
    }

    /**
     * @param transactionLogNo
     */
    public void setTransactionLogNo(String transactionLogNo) {
        this.transactionLogNo = transactionLogNo == null ? null : transactionLogNo.trim();
    }
}