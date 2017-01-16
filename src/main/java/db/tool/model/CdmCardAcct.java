package db.tool.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cdm_card_acct")
public class CdmCardAcct {
    @Id
    @Column(name = "CARD_ACCT_ID")
    private String cardAcctId;

    @Column(name = "CARD_ID")
    private String cardId;

    @Column(name = "CURRENCY")
    private String currency;

    @Column(name = "CASH_TRANS")
    private String cashTrans;

    @Column(name = "PERIOD_FLAG")
    private String periodFlag;

    @Column(name = "SETTLEMENT")
    private String settlement;

    @Column(name = "BANK_KEY")
    private String bankKey;

    @Column(name = "ACCT_NO")
    private String acctNo;

    @Column(name = "CONTRACT_ID")
    private String contractId;

    @Column(name = "MASTER_ACCT")
    private String masterAcct;

    @Column(name = "HOME_BRANCH")
    private String homeBranch;

    @Column(name = "ACCT_PROD")
    private String acctProd;

    @Column(name = "ACCT_DATE")
    private Date acctDate;

    @Column(name = "MIGRATION")
    private String migration;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "CREATE_DATE")
    private Date createDate;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "CREATE_TELLER")
    private String createTeller;

    @Column(name = "CREATE_MEDIUM")
    private String createMedium;

    @Column(name = "CREATE_ORG")
    private String createOrg;

    @Column(name = "LAST_CHG_DATE")
    private Date lastChgDate;

    @Column(name = "LAST_CHG_TIME")
    private Date lastChgTime;

    @Column(name = "LAST_CHG_TELLER")
    private String lastChgTeller;

    @Column(name = "LAST_CHG_MEDIUM")
    private String lastChgMedium;

    @Column(name = "LAST_CHG_ORG")
    private String lastChgOrg;

    /**
     * @return CARD_ACCT_ID
     */
    public String getCardAcctId() {
        return cardAcctId;
    }

    /**
     * @param cardAcctId
     */
    public void setCardAcctId(String cardAcctId) {
        this.cardAcctId = cardAcctId == null ? null : cardAcctId.trim();
    }

    /**
     * @return CARD_ID
     */
    public String getCardId() {
        return cardId;
    }

    /**
     * @param cardId
     */
    public void setCardId(String cardId) {
        this.cardId = cardId == null ? null : cardId.trim();
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
     * @return CASH_TRANS
     */
    public String getCashTrans() {
        return cashTrans;
    }

    /**
     * @param cashTrans
     */
    public void setCashTrans(String cashTrans) {
        this.cashTrans = cashTrans == null ? null : cashTrans.trim();
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
     * @return SETTLEMENT
     */
    public String getSettlement() {
        return settlement;
    }

    /**
     * @param settlement
     */
    public void setSettlement(String settlement) {
        this.settlement = settlement == null ? null : settlement.trim();
    }

    /**
     * @return BANK_KEY
     */
    public String getBankKey() {
        return bankKey;
    }

    /**
     * @param bankKey
     */
    public void setBankKey(String bankKey) {
        this.bankKey = bankKey == null ? null : bankKey.trim();
    }

    /**
     * @return ACCT_NO
     */
    public String getAcctNo() {
        return acctNo;
    }

    /**
     * @param acctNo
     */
    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo == null ? null : acctNo.trim();
    }

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
     * @return HOME_BRANCH
     */
    public String getHomeBranch() {
        return homeBranch;
    }

    /**
     * @param homeBranch
     */
    public void setHomeBranch(String homeBranch) {
        this.homeBranch = homeBranch == null ? null : homeBranch.trim();
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
     * @return ACCT_DATE
     */
    public Date getAcctDate() {
        return acctDate;
    }

    /**
     * @param acctDate
     */
    public void setAcctDate(Date acctDate) {
        this.acctDate = acctDate;
    }

    /**
     * @return MIGRATION
     */
    public String getMigration() {
        return migration;
    }

    /**
     * @param migration
     */
    public void setMigration(String migration) {
        this.migration = migration == null ? null : migration.trim();
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
     * @return CREATE_DATE
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * @return CREATE_TIME
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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

    /**
     * @return CREATE_MEDIUM
     */
    public String getCreateMedium() {
        return createMedium;
    }

    /**
     * @param createMedium
     */
    public void setCreateMedium(String createMedium) {
        this.createMedium = createMedium == null ? null : createMedium.trim();
    }

    /**
     * @return CREATE_ORG
     */
    public String getCreateOrg() {
        return createOrg;
    }

    /**
     * @param createOrg
     */
    public void setCreateOrg(String createOrg) {
        this.createOrg = createOrg == null ? null : createOrg.trim();
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

    /**
     * @return LAST_CHG_MEDIUM
     */
    public String getLastChgMedium() {
        return lastChgMedium;
    }

    /**
     * @param lastChgMedium
     */
    public void setLastChgMedium(String lastChgMedium) {
        this.lastChgMedium = lastChgMedium == null ? null : lastChgMedium.trim();
    }

    /**
     * @return LAST_CHG_ORG
     */
    public String getLastChgOrg() {
        return lastChgOrg;
    }

    /**
     * @param lastChgOrg
     */
    public void setLastChgOrg(String lastChgOrg) {
        this.lastChgOrg = lastChgOrg == null ? null : lastChgOrg.trim();
    }
}