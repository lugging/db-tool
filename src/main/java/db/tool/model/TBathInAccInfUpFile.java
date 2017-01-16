package db.tool.model;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "t_bath_in_acc_inf_up_file")
public class TBathInAccInfUpFile {
    @Column(name = "CUSTOMER_ACC")
    private String customerAcc;

    @Column(name = "ACC_NAME")
    private String accName;

    @Column(name = "CCY")
    private String ccy;

    @Column(name = "BANK_REMIT_ID")
    private String bankRemitId;

    @Column(name = "TS_AMT")
    private BigDecimal tsAmt;

    @Column(name = "REMARK")
    private String remark;

    @Column(name = "MASTER_NUM")
    private String masterNum;

    @Column(name = "SHOULD_DEDU_POJ")
    private String shouldDeduPoj;

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
     * @return REMARK
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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
}