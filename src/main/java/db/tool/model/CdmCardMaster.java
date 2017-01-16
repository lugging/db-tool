package db.tool.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cdm_card_master")
public class CdmCardMaster {
    @Id
    @Column(name = "CARD_NO")
    private String cardNo;

    @Id
    @Column(name = "BANK_KEY")
    private String bankKey;

    @Column(name = "CARD_ID")
    private String cardId;

    @Column(name = "CURR_CARD")
    private String currCard;

    @Column(name = "ORGANIZATION")
    private String organization;

    @Column(name = "BIN")
    private String bin;

    @Column(name = "JOINT_TYPE")
    private String jointType;

    @Column(name = "CATEGORY")
    private String category;

    @Column(name = "CURRENCY")
    private String currency;

    @Column(name = "ISSUE_BRANCH")
    private String issueBranch;

    @Column(name = "CUSTOMER_NO")
    private String customerNo;

    @Column(name = "ISSUE_DATE")
    private Date issueDate;

    @Column(name = "VALID_DATE")
    private Date validDate;

    @Column(name = "ADDCARD_FLAG")
    private String addcardFlag;

    @Column(name = "DRAW_MODE")
    private String drawMode;

    @Column(name = "DRAW_BRANCH")
    private String drawBranch;

    @Column(name = "CARD_STATE")
    private String cardState;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "CARD_VER")
    private Integer cardVer;

    @Column(name = "OVERSEAS_TR")
    private String overseasTr;

    @Column(name = "OVERSEAS_HV")
    private String overseasHv;

    @Column(name = "OVERSEAS_TO")
    private Date overseasTo;

    @Column(name = "CURR_PAGE")
    private Integer currPage;

    @Column(name = "CURR_LINE")
    private Integer currLine;

    @Column(name = "CVV_BRANCH")
    private String cvvBranch;

    @Column(name = "MIGRATION")
    private String migration;

    @Column(name = "CHARGE_START")
    private Date chargeStart;

    @Column(name = "MATERIAL_CODE")
    private String materialCode;

    @Column(name = "VOUCHER_NO")
    private String voucherNo;

    @Column(name = "CREATE_DATE")
    private Date createDate;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "CREATE_TELLER")
    private String createTeller;

    @Column(name = "CREATE_MEDIUM")
    private String createMedium;

    @Column(name = "LAST_CHG_DATE")
    private Date lastChgDate;

    @Column(name = "LAST_CHG_TIME")
    private Date lastChgTime;

    @Column(name = "LAST_CHG_TELLER")
    private String lastChgTeller;

    @Column(name = "LAST_CHG_CHANNEL")
    private String lastChgChannel;

    @Column(name = "LAST_CHG_ORG")
    private String lastChgOrg;

    @Column(name = "CUST_01")
    private String cust01;

    @Column(name = "CUST_02")
    private String cust02;

    /**
     * @return CARD_NO
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * @param cardNo
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
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
     * @return CURR_CARD
     */
    public String getCurrCard() {
        return currCard;
    }

    /**
     * @param currCard
     */
    public void setCurrCard(String currCard) {
        this.currCard = currCard == null ? null : currCard.trim();
    }

    /**
     * @return ORGANIZATION
     */
    public String getOrganization() {
        return organization;
    }

    /**
     * @param organization
     */
    public void setOrganization(String organization) {
        this.organization = organization == null ? null : organization.trim();
    }

    /**
     * @return BIN
     */
    public String getBin() {
        return bin;
    }

    /**
     * @param bin
     */
    public void setBin(String bin) {
        this.bin = bin == null ? null : bin.trim();
    }

    /**
     * @return JOINT_TYPE
     */
    public String getJointType() {
        return jointType;
    }

    /**
     * @param jointType
     */
    public void setJointType(String jointType) {
        this.jointType = jointType == null ? null : jointType.trim();
    }

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
     * @return ISSUE_BRANCH
     */
    public String getIssueBranch() {
        return issueBranch;
    }

    /**
     * @param issueBranch
     */
    public void setIssueBranch(String issueBranch) {
        this.issueBranch = issueBranch == null ? null : issueBranch.trim();
    }

    /**
     * @return CUSTOMER_NO
     */
    public String getCustomerNo() {
        return customerNo;
    }

    /**
     * @param customerNo
     */
    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo == null ? null : customerNo.trim();
    }

    /**
     * @return ISSUE_DATE
     */
    public Date getIssueDate() {
        return issueDate;
    }

    /**
     * @param issueDate
     */
    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    /**
     * @return VALID_DATE
     */
    public Date getValidDate() {
        return validDate;
    }

    /**
     * @param validDate
     */
    public void setValidDate(Date validDate) {
        this.validDate = validDate;
    }

    /**
     * @return ADDCARD_FLAG
     */
    public String getAddcardFlag() {
        return addcardFlag;
    }

    /**
     * @param addcardFlag
     */
    public void setAddcardFlag(String addcardFlag) {
        this.addcardFlag = addcardFlag == null ? null : addcardFlag.trim();
    }

    /**
     * @return DRAW_MODE
     */
    public String getDrawMode() {
        return drawMode;
    }

    /**
     * @param drawMode
     */
    public void setDrawMode(String drawMode) {
        this.drawMode = drawMode == null ? null : drawMode.trim();
    }

    /**
     * @return DRAW_BRANCH
     */
    public String getDrawBranch() {
        return drawBranch;
    }

    /**
     * @param drawBranch
     */
    public void setDrawBranch(String drawBranch) {
        this.drawBranch = drawBranch == null ? null : drawBranch.trim();
    }

    /**
     * @return CARD_STATE
     */
    public String getCardState() {
        return cardState;
    }

    /**
     * @param cardState
     */
    public void setCardState(String cardState) {
        this.cardState = cardState == null ? null : cardState.trim();
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
     * @return CARD_VER
     */
    public Integer getCardVer() {
        return cardVer;
    }

    /**
     * @param cardVer
     */
    public void setCardVer(Integer cardVer) {
        this.cardVer = cardVer;
    }

    /**
     * @return OVERSEAS_TR
     */
    public String getOverseasTr() {
        return overseasTr;
    }

    /**
     * @param overseasTr
     */
    public void setOverseasTr(String overseasTr) {
        this.overseasTr = overseasTr == null ? null : overseasTr.trim();
    }

    /**
     * @return OVERSEAS_HV
     */
    public String getOverseasHv() {
        return overseasHv;
    }

    /**
     * @param overseasHv
     */
    public void setOverseasHv(String overseasHv) {
        this.overseasHv = overseasHv == null ? null : overseasHv.trim();
    }

    /**
     * @return OVERSEAS_TO
     */
    public Date getOverseasTo() {
        return overseasTo;
    }

    /**
     * @param overseasTo
     */
    public void setOverseasTo(Date overseasTo) {
        this.overseasTo = overseasTo;
    }

    /**
     * @return CURR_PAGE
     */
    public Integer getCurrPage() {
        return currPage;
    }

    /**
     * @param currPage
     */
    public void setCurrPage(Integer currPage) {
        this.currPage = currPage;
    }

    /**
     * @return CURR_LINE
     */
    public Integer getCurrLine() {
        return currLine;
    }

    /**
     * @param currLine
     */
    public void setCurrLine(Integer currLine) {
        this.currLine = currLine;
    }

    /**
     * @return CVV_BRANCH
     */
    public String getCvvBranch() {
        return cvvBranch;
    }

    /**
     * @param cvvBranch
     */
    public void setCvvBranch(String cvvBranch) {
        this.cvvBranch = cvvBranch == null ? null : cvvBranch.trim();
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
     * @return CHARGE_START
     */
    public Date getChargeStart() {
        return chargeStart;
    }

    /**
     * @param chargeStart
     */
    public void setChargeStart(Date chargeStart) {
        this.chargeStart = chargeStart;
    }

    /**
     * @return MATERIAL_CODE
     */
    public String getMaterialCode() {
        return materialCode;
    }

    /**
     * @param materialCode
     */
    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode == null ? null : materialCode.trim();
    }

    /**
     * @return VOUCHER_NO
     */
    public String getVoucherNo() {
        return voucherNo;
    }

    /**
     * @param voucherNo
     */
    public void setVoucherNo(String voucherNo) {
        this.voucherNo = voucherNo == null ? null : voucherNo.trim();
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
     * @return LAST_CHG_CHANNEL
     */
    public String getLastChgChannel() {
        return lastChgChannel;
    }

    /**
     * @param lastChgChannel
     */
    public void setLastChgChannel(String lastChgChannel) {
        this.lastChgChannel = lastChgChannel == null ? null : lastChgChannel.trim();
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

    /**
     * @return CUST_01
     */
    public String getCust01() {
        return cust01;
    }

    /**
     * @param cust01
     */
    public void setCust01(String cust01) {
        this.cust01 = cust01 == null ? null : cust01.trim();
    }

    /**
     * @return CUST_02
     */
    public String getCust02() {
        return cust02;
    }

    /**
     * @param cust02
     */
    public void setCust02(String cust02) {
        this.cust02 = cust02 == null ? null : cust02.trim();
    }
}