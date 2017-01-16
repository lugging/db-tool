package db.tool.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_bath_in_acc_inf_add")
public class TBathInAccInfAdd {
    @Column(name = "BANK_CODE")
    private String bankCode;

    @Column(name = "HOST_BATCH_CODE")
    private String hostBatchCode;

    @Column(name = "CUSTOMER_ACC")
    private String customerAcc;

    @Column(name = "JOB_SEQ")
    private BigDecimal jobSeq;

    @Column(name = "MASTER_NUM")
    private String masterNum;

    @Column(name = "SHOULD_DEDU_POJ")
    private String shouldDeduPoj;

    @Column(name = "REMARK2")
    private String remark2;

    @Column(name = "DATE_TIME_STAMP")
    private Date dateTimeStamp;

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
     * @return JOB_SEQ
     */
    public BigDecimal getJobSeq() {
        return jobSeq;
    }

    /**
     * @param jobSeq
     */
    public void setJobSeq(BigDecimal jobSeq) {
        this.jobSeq = jobSeq;
    }

    /**
     * @return MASTER_NUM
     */
    public String getMasterNum() {
        return masterNum;
    }

    /**
     * @param masterNum
     */
    public void setMasterNum(String masterNum) {
        this.masterNum = masterNum == null ? null : masterNum.trim();
    }

    /**
     * @return SHOULD_DEDU_POJ
     */
    public String getShouldDeduPoj() {
        return shouldDeduPoj;
    }

    /**
     * @param shouldDeduPoj
     */
    public void setShouldDeduPoj(String shouldDeduPoj) {
        this.shouldDeduPoj = shouldDeduPoj == null ? null : shouldDeduPoj.trim();
    }

    /**
     * @return REMARK2
     */
    public String getRemark2() {
        return remark2;
    }

    /**
     * @param remark2
     */
    public void setRemark2(String remark2) {
        this.remark2 = remark2 == null ? null : remark2.trim();
    }

    /**
     * @return DATE_TIME_STAMP
     */
    public Date getDateTimeStamp() {
        return dateTimeStamp;
    }

    /**
     * @param dateTimeStamp
     */
    public void setDateTimeStamp(Date dateTimeStamp) {
        this.dateTimeStamp = dateTimeStamp;
    }
}