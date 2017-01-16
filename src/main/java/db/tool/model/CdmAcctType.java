package db.tool.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cdm_acct_type")
public class CdmAcctType {
    @Id
    @Column(name = "CATEGORY")
    private String category;

    @Id
    @Column(name = "ACCT_PROD")
    private String acctProd;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "CUST_FLAG")
    private String custFlag;

    @Column(name = "CURR_FLAG")
    private String currFlag;

    @Column(name = "SETTLEMENT_FLAG")
    private String settlementFlag;

    @Column(name = "PERIOD_FLAG")
    private String periodFlag;

    @Column(name = "MASTER_ACCT")
    private String masterAcct;

    @Column(name = "ASSO_CARDS")
    private Integer assoCards;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "LAST_CHG_DATE")
    private Date lastChgDate;

    @Column(name = "LAST_CHG_TIME")
    private Date lastChgTime;

    @Column(name = "LAST_CHG_TELLER")
    private String lastChgTeller;

    /**
     * @return CATEGORY
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category
     */
    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    /**
     * @return ACCT_PROD
     */
    public String getAcctProd() {
        return acctProd;
    }

    /**
     * @param acctProd
     */
    public void setAcctProd(String acctProd) {
        this.acctProd = acctProd == null ? null : acctProd.trim();
    }

    /**
     * @return DESCRIPTION
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * @return CUST_FLAG
     */
    public String getCustFlag() {
        return custFlag;
    }

    /**
     * @param custFlag
     */
    public void setCustFlag(String custFlag) {
        this.custFlag = custFlag == null ? null : custFlag.trim();
    }

    /**
     * @return CURR_FLAG
     */
    public String getCurrFlag() {
        return currFlag;
    }

    /**
     * @param currFlag
     */
    public void setCurrFlag(String currFlag) {
        this.currFlag = currFlag == null ? null : currFlag.trim();
    }

    /**
     * @return SETTLEMENT_FLAG
     */
    public String getSettlementFlag() {
        return settlementFlag;
    }

    /**
     * @param settlementFlag
     */
    public void setSettlementFlag(String settlementFlag) {
        this.settlementFlag = settlementFlag == null ? null : settlementFlag.trim();
    }

    /**
     * @return PERIOD_FLAG
     */
    public String getPeriodFlag() {
        return periodFlag;
    }

    /**
     * @param periodFlag
     */
    public void setPeriodFlag(String periodFlag) {
        this.periodFlag = periodFlag == null ? null : periodFlag.trim();
    }

    /**
     * @return MASTER_ACCT
     */
    public String getMasterAcct() {
        return masterAcct;
    }

    /**
     * @param masterAcct
     */
    public void setMasterAcct(String masterAcct) {
        this.masterAcct = masterAcct == null ? null : masterAcct.trim();
    }

    /**
     * @return ASSO_CARDS
     */
    public Integer getAssoCards() {
        return assoCards;
    }

    /**
     * @param assoCards
     */
    public void setAssoCards(Integer assoCards) {
        this.assoCards = assoCards;
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
     * @return LAST_CHG_DATE
     */
    public Date getLastChgDate() {
        return lastChgDate;
    }

    /**
     * @param lastChgDate
     */
    public void setLastChgDate(Date lastChgDate) {
        this.lastChgDate = lastChgDate;
    }

    /**
     * @return LAST_CHG_TIME
     */
    public Date getLastChgTime() {
        return lastChgTime;
    }

    /**
     * @param lastChgTime
     */
    public void setLastChgTime(Date lastChgTime) {
        this.lastChgTime = lastChgTime;
    }

    /**
     * @return LAST_CHG_TELLER
     */
    public String getLastChgTeller() {
        return lastChgTeller;
    }

    /**
     * @param lastChgTeller
     */
    public void setLastChgTeller(String lastChgTeller) {
        this.lastChgTeller = lastChgTeller == null ? null : lastChgTeller.trim();
    }
}