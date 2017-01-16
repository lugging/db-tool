package db.tool.model;

import java.util.Date;
import javax.persistence.*;

/**
 * 账户基本信息表
 * @author liugang
 *
 */
@Table(name = "bank_account_attribute")
public class BankAccountAttribute {
    /**
     * 内部合同号
     */
    @Id
    @Column(name = "CONTRACT_ID")
    private String contractId;

    @Id
    @Column(name = "TIMESTAMP")
    private Date timestamp;

    /**
     * 账号
     */
    @Column(name = "ACCOUNT_NO")
    private String accountNo;

    /**
     * 钞汇标记
     */
    @Column(name = "FLG_CASH_TRAN")
    private String flgCashTran;

    /**
     * 储蓄/结算标识
     */
    @Column(name = "FLG_SAV_SET")
    private String flgSavSet;

    /**
     * 通存通兑
     */
    @Column(name = "FLG_INT_BRAN")
    private String flgIntBran;

    /**
     * 年检标识
     */
    @Column(name = "FLG_ANN_CHK")
    private String flgAnnChk;

    /**
     * 年检宽限期
     */
    @Column(name = "PRD_ANN_CHK")
    private String prdAnnChk;

    /**
     * 对账标识
     */
    @Column(name = "FLG_BAL_CONF")
    private String flgBalConf;

    /**
     * 对账宽限期
     */
    @Column(name = "PRD_BAL_CONF")
    private String prdBalConf;

    /**
     * 外汇账户性质码
     */
    @Column(name = "PRO_CD_FR_CURR")
    private String proCdFrCurr;

    /**
     * 开户、变更核准件编号
     */
    @Column(name = "APP_CD_FR_CURR")
    private String appCdFrCurr;

    /**
     * 是否报送外汇账户信息
     */
    @Column(name = "FLG_SEND_SAFE")
    private String flgSendSafe;

    /**
     * 请与开户行接洽标识
     */
    @Column(name = "FLG_REMINDER")
    private String flgReminder;

    /**
     * 不能在他行销记户标识
     */
    @Column(name = "FLG_VALIDATION")
    private String flgValidation;

    /**
     * 开户行
     */
    @Column(name = "HOME_BRANCH")
    private String homeBranch;

    /**
     * 事业部机构
     */
    @Column(name = "BUS_LINE_CODE")
    private String busLineCode;

    /**
     * 定期账号类型
     */
    @Column(name = "FLG_OFFL_RECT")
    private String flgOfflRect;

    /**
     * 贵金属标识
     */
    @Column(name = "FLG_IT_CUR_CAP")
    private String flgItCurCap;

    /**
     * 联系人
     */
    @Column(name = "CONTACT_NO")
    private String contactNo;

    /**
     * 联系地址
     */
    @Column(name = "ADDRESS")
    private String address;

    /**
     * 同业存款账户标识
     */
    @Column(name = "FLG_INTER_BANK")
    private String flgInterBank;

    /**
     * 客户经理号工号
     */
    @Column(name = "CMID")
    private String cmid;

    /**
     * 产品经理员工号
     */
    @Column(name = "PMID")
    private String pmid;

    /**
     * 基本账户标识
     */
    @Column(name = "ACCT_IDENT")
    private String acctIdent;

    /**
     * 特殊账户类型
     */
    @Column(name = "SPEC_ACCT_TYPE")
    private String specAcctType;

    /**
     * 备注信息
     */
    @Column(name = "MEMO")
    private String memo;

    /**
     * 联系人信息
     */
    @Column(name = "CONTACTINFO")
    private String contactinfo;

    /**
     * 账户用途标识
     */
    @Column(name = "USEACCOUNT")
    private String useaccount;

    /**
     * 报备信息
     */
    @Column(name = "REPORTEDINFO")
    private String reportedinfo;

    /**
     * 预留字段1
     */
    @Column(name = "DUMMY1")
    private String dummy1;

    /**
     * 预留字段2
     */
    @Column(name = "DUMMY2")
    private String dummy2;

    /**
     * 预留字段3
     */
    @Column(name = "DUMMY3")
    private String dummy3;

    /**
     * 预留字段4
     */
    @Column(name = "DUMMY4")
    private String dummy4;

    /**
     * 预留字段5
     */
    @Column(name = "DUMMY5")
    private String dummy5;

    /**
     * 预留字段6
     */
    @Column(name = "DUMMY6")
    private String dummy6;

    /**
     * 预留字段7
     */
    @Column(name = "DUMMY7")
    private String dummy7;

    /**
     * 预留字段8
     */
    @Column(name = "DUMMY8")
    private String dummy8;

    /**
     * 预留字段9
     */
    @Column(name = "DUMMY9")
    private String dummy9;

    /**
     * 预留字段10
     */
    @Column(name = "DUMMY10")
    private String dummy10;

    /**
     * 预留字段11
     */
    @Column(name = "DUMMY11")
    private String dummy11;

    /**
     * 预留字段12
     */
    @Column(name = "DUMMY12")
    private String dummy12;

    /**
     * 预留字段13
     */
    @Column(name = "DUMMY13")
    private String dummy13;

    @Column(name = "OPERATOR")
    private String operator;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "CREATE_TELLER")
    private String createTeller;

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
     * 获取账号
     *
     * @return ACCOUNT_NO - 账号
     */
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * 设置账号
     *
     * @param accountNo 账号
     */
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo == null ? null : accountNo.trim();
    }

    /**
     * 获取钞汇标记
     *
     * @return FLG_CASH_TRAN - 钞汇标记
     */
    public String getFlgCashTran() {
        return flgCashTran;
    }

    /**
     * 设置钞汇标记
     *
     * @param flgCashTran 钞汇标记
     */
    public void setFlgCashTran(String flgCashTran) {
        this.flgCashTran = flgCashTran == null ? null : flgCashTran.trim();
    }

    /**
     * 获取储蓄/结算标识
     *
     * @return FLG_SAV_SET - 储蓄/结算标识
     */
    public String getFlgSavSet() {
        return flgSavSet;
    }

    /**
     * 设置储蓄/结算标识
     *
     * @param flgSavSet 储蓄/结算标识
     */
    public void setFlgSavSet(String flgSavSet) {
        this.flgSavSet = flgSavSet == null ? null : flgSavSet.trim();
    }

    /**
     * 获取通存通兑
     *
     * @return FLG_INT_BRAN - 通存通兑
     */
    public String getFlgIntBran() {
        return flgIntBran;
    }

    /**
     * 设置通存通兑
     *
     * @param flgIntBran 通存通兑
     */
    public void setFlgIntBran(String flgIntBran) {
        this.flgIntBran = flgIntBran == null ? null : flgIntBran.trim();
    }

    /**
     * 获取年检标识
     *
     * @return FLG_ANN_CHK - 年检标识
     */
    public String getFlgAnnChk() {
        return flgAnnChk;
    }

    /**
     * 设置年检标识
     *
     * @param flgAnnChk 年检标识
     */
    public void setFlgAnnChk(String flgAnnChk) {
        this.flgAnnChk = flgAnnChk == null ? null : flgAnnChk.trim();
    }

    /**
     * 获取年检宽限期
     *
     * @return PRD_ANN_CHK - 年检宽限期
     */
    public String getPrdAnnChk() {
        return prdAnnChk;
    }

    /**
     * 设置年检宽限期
     *
     * @param prdAnnChk 年检宽限期
     */
    public void setPrdAnnChk(String prdAnnChk) {
        this.prdAnnChk = prdAnnChk == null ? null : prdAnnChk.trim();
    }

    /**
     * 获取对账标识
     *
     * @return FLG_BAL_CONF - 对账标识
     */
    public String getFlgBalConf() {
        return flgBalConf;
    }

    /**
     * 设置对账标识
     *
     * @param flgBalConf 对账标识
     */
    public void setFlgBalConf(String flgBalConf) {
        this.flgBalConf = flgBalConf == null ? null : flgBalConf.trim();
    }

    /**
     * 获取对账宽限期
     *
     * @return PRD_BAL_CONF - 对账宽限期
     */
    public String getPrdBalConf() {
        return prdBalConf;
    }

    /**
     * 设置对账宽限期
     *
     * @param prdBalConf 对账宽限期
     */
    public void setPrdBalConf(String prdBalConf) {
        this.prdBalConf = prdBalConf == null ? null : prdBalConf.trim();
    }

    /**
     * 获取外汇账户性质码
     *
     * @return PRO_CD_FR_CURR - 外汇账户性质码
     */
    public String getProCdFrCurr() {
        return proCdFrCurr;
    }

    /**
     * 设置外汇账户性质码
     *
     * @param proCdFrCurr 外汇账户性质码
     */
    public void setProCdFrCurr(String proCdFrCurr) {
        this.proCdFrCurr = proCdFrCurr == null ? null : proCdFrCurr.trim();
    }

    /**
     * 获取开户、变更核准件编号
     *
     * @return APP_CD_FR_CURR - 开户、变更核准件编号
     */
    public String getAppCdFrCurr() {
        return appCdFrCurr;
    }

    /**
     * 设置开户、变更核准件编号
     *
     * @param appCdFrCurr 开户、变更核准件编号
     */
    public void setAppCdFrCurr(String appCdFrCurr) {
        this.appCdFrCurr = appCdFrCurr == null ? null : appCdFrCurr.trim();
    }

    /**
     * 获取是否报送外汇账户信息
     *
     * @return FLG_SEND_SAFE - 是否报送外汇账户信息
     */
    public String getFlgSendSafe() {
        return flgSendSafe;
    }

    /**
     * 设置是否报送外汇账户信息
     *
     * @param flgSendSafe 是否报送外汇账户信息
     */
    public void setFlgSendSafe(String flgSendSafe) {
        this.flgSendSafe = flgSendSafe == null ? null : flgSendSafe.trim();
    }

    /**
     * 获取请与开户行接洽标识
     *
     * @return FLG_REMINDER - 请与开户行接洽标识
     */
    public String getFlgReminder() {
        return flgReminder;
    }

    /**
     * 设置请与开户行接洽标识
     *
     * @param flgReminder 请与开户行接洽标识
     */
    public void setFlgReminder(String flgReminder) {
        this.flgReminder = flgReminder == null ? null : flgReminder.trim();
    }

    /**
     * 获取不能在他行销记户标识
     *
     * @return FLG_VALIDATION - 不能在他行销记户标识
     */
    public String getFlgValidation() {
        return flgValidation;
    }

    /**
     * 设置不能在他行销记户标识
     *
     * @param flgValidation 不能在他行销记户标识
     */
    public void setFlgValidation(String flgValidation) {
        this.flgValidation = flgValidation == null ? null : flgValidation.trim();
    }

    /**
     * 获取开户行
     *
     * @return HOME_BRANCH - 开户行
     */
    public String getHomeBranch() {
        return homeBranch;
    }

    /**
     * 设置开户行
     *
     * @param homeBranch 开户行
     */
    public void setHomeBranch(String homeBranch) {
        this.homeBranch = homeBranch == null ? null : homeBranch.trim();
    }

    /**
     * 获取事业部机构
     *
     * @return BUS_LINE_CODE - 事业部机构
     */
    public String getBusLineCode() {
        return busLineCode;
    }

    /**
     * 设置事业部机构
     *
     * @param busLineCode 事业部机构
     */
    public void setBusLineCode(String busLineCode) {
        this.busLineCode = busLineCode == null ? null : busLineCode.trim();
    }

    /**
     * 获取定期账号类型
     *
     * @return FLG_OFFL_RECT - 定期账号类型
     */
    public String getFlgOfflRect() {
        return flgOfflRect;
    }

    /**
     * 设置定期账号类型
     *
     * @param flgOfflRect 定期账号类型
     */
    public void setFlgOfflRect(String flgOfflRect) {
        this.flgOfflRect = flgOfflRect == null ? null : flgOfflRect.trim();
    }

    /**
     * 获取贵金属标识
     *
     * @return FLG_IT_CUR_CAP - 贵金属标识
     */
    public String getFlgItCurCap() {
        return flgItCurCap;
    }

    /**
     * 设置贵金属标识
     *
     * @param flgItCurCap 贵金属标识
     */
    public void setFlgItCurCap(String flgItCurCap) {
        this.flgItCurCap = flgItCurCap == null ? null : flgItCurCap.trim();
    }

    /**
     * 获取联系人
     *
     * @return CONTACT_NO - 联系人
     */
    public String getContactNo() {
        return contactNo;
    }

    /**
     * 设置联系人
     *
     * @param contactNo 联系人
     */
    public void setContactNo(String contactNo) {
        this.contactNo = contactNo == null ? null : contactNo.trim();
    }

    /**
     * 获取联系地址
     *
     * @return ADDRESS - 联系地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置联系地址
     *
     * @param address 联系地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 获取同业存款账户标识
     *
     * @return FLG_INTER_BANK - 同业存款账户标识
     */
    public String getFlgInterBank() {
        return flgInterBank;
    }

    /**
     * 设置同业存款账户标识
     *
     * @param flgInterBank 同业存款账户标识
     */
    public void setFlgInterBank(String flgInterBank) {
        this.flgInterBank = flgInterBank == null ? null : flgInterBank.trim();
    }

    /**
     * 获取客户经理号工号
     *
     * @return CMID - 客户经理号工号
     */
    public String getCmid() {
        return cmid;
    }

    /**
     * 设置客户经理号工号
     *
     * @param cmid 客户经理号工号
     */
    public void setCmid(String cmid) {
        this.cmid = cmid == null ? null : cmid.trim();
    }

    /**
     * 获取产品经理员工号
     *
     * @return PMID - 产品经理员工号
     */
    public String getPmid() {
        return pmid;
    }

    /**
     * 设置产品经理员工号
     *
     * @param pmid 产品经理员工号
     */
    public void setPmid(String pmid) {
        this.pmid = pmid == null ? null : pmid.trim();
    }

    /**
     * 获取基本账户标识
     *
     * @return ACCT_IDENT - 基本账户标识
     */
    public String getAcctIdent() {
        return acctIdent;
    }

    /**
     * 设置基本账户标识
     *
     * @param acctIdent 基本账户标识
     */
    public void setAcctIdent(String acctIdent) {
        this.acctIdent = acctIdent == null ? null : acctIdent.trim();
    }

    /**
     * 获取特殊账户类型
     *
     * @return SPEC_ACCT_TYPE - 特殊账户类型
     */
    public String getSpecAcctType() {
        return specAcctType;
    }

    /**
     * 设置特殊账户类型
     *
     * @param specAcctType 特殊账户类型
     */
    public void setSpecAcctType(String specAcctType) {
        this.specAcctType = specAcctType == null ? null : specAcctType.trim();
    }

    /**
     * 获取备注信息
     *
     * @return MEMO - 备注信息
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 设置备注信息
     *
     * @param memo 备注信息
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * 获取联系人信息
     *
     * @return CONTACTINFO - 联系人信息
     */
    public String getContactinfo() {
        return contactinfo;
    }

    /**
     * 设置联系人信息
     *
     * @param contactinfo 联系人信息
     */
    public void setContactinfo(String contactinfo) {
        this.contactinfo = contactinfo == null ? null : contactinfo.trim();
    }

    /**
     * 获取账户用途标识
     *
     * @return USEACCOUNT - 账户用途标识
     */
    public String getUseaccount() {
        return useaccount;
    }

    /**
     * 设置账户用途标识
     *
     * @param useaccount 账户用途标识
     */
    public void setUseaccount(String useaccount) {
        this.useaccount = useaccount == null ? null : useaccount.trim();
    }

    /**
     * 获取报备信息
     *
     * @return REPORTEDINFO - 报备信息
     */
    public String getReportedinfo() {
        return reportedinfo;
    }

    /**
     * 设置报备信息
     *
     * @param reportedinfo 报备信息
     */
    public void setReportedinfo(String reportedinfo) {
        this.reportedinfo = reportedinfo == null ? null : reportedinfo.trim();
    }

    /**
     * 获取预留字段1
     *
     * @return DUMMY1 - 预留字段1
     */
    public String getDummy1() {
        return dummy1;
    }

    /**
     * 设置预留字段1
     *
     * @param dummy1 预留字段1
     */
    public void setDummy1(String dummy1) {
        this.dummy1 = dummy1 == null ? null : dummy1.trim();
    }

    /**
     * 获取预留字段2
     *
     * @return DUMMY2 - 预留字段2
     */
    public String getDummy2() {
        return dummy2;
    }

    /**
     * 设置预留字段2
     *
     * @param dummy2 预留字段2
     */
    public void setDummy2(String dummy2) {
        this.dummy2 = dummy2 == null ? null : dummy2.trim();
    }

    /**
     * 获取预留字段3
     *
     * @return DUMMY3 - 预留字段3
     */
    public String getDummy3() {
        return dummy3;
    }

    /**
     * 设置预留字段3
     *
     * @param dummy3 预留字段3
     */
    public void setDummy3(String dummy3) {
        this.dummy3 = dummy3 == null ? null : dummy3.trim();
    }

    /**
     * 获取预留字段4
     *
     * @return DUMMY4 - 预留字段4
     */
    public String getDummy4() {
        return dummy4;
    }

    /**
     * 设置预留字段4
     *
     * @param dummy4 预留字段4
     */
    public void setDummy4(String dummy4) {
        this.dummy4 = dummy4 == null ? null : dummy4.trim();
    }

    /**
     * 获取预留字段5
     *
     * @return DUMMY5 - 预留字段5
     */
    public String getDummy5() {
        return dummy5;
    }

    /**
     * 设置预留字段5
     *
     * @param dummy5 预留字段5
     */
    public void setDummy5(String dummy5) {
        this.dummy5 = dummy5 == null ? null : dummy5.trim();
    }

    /**
     * 获取预留字段6
     *
     * @return DUMMY6 - 预留字段6
     */
    public String getDummy6() {
        return dummy6;
    }

    /**
     * 设置预留字段6
     *
     * @param dummy6 预留字段6
     */
    public void setDummy6(String dummy6) {
        this.dummy6 = dummy6 == null ? null : dummy6.trim();
    }

    /**
     * 获取预留字段7
     *
     * @return DUMMY7 - 预留字段7
     */
    public String getDummy7() {
        return dummy7;
    }

    /**
     * 设置预留字段7
     *
     * @param dummy7 预留字段7
     */
    public void setDummy7(String dummy7) {
        this.dummy7 = dummy7 == null ? null : dummy7.trim();
    }

    /**
     * 获取预留字段8
     *
     * @return DUMMY8 - 预留字段8
     */
    public String getDummy8() {
        return dummy8;
    }

    /**
     * 设置预留字段8
     *
     * @param dummy8 预留字段8
     */
    public void setDummy8(String dummy8) {
        this.dummy8 = dummy8 == null ? null : dummy8.trim();
    }

    /**
     * 获取预留字段9
     *
     * @return DUMMY9 - 预留字段9
     */
    public String getDummy9() {
        return dummy9;
    }

    /**
     * 设置预留字段9
     *
     * @param dummy9 预留字段9
     */
    public void setDummy9(String dummy9) {
        this.dummy9 = dummy9 == null ? null : dummy9.trim();
    }

    /**
     * 获取预留字段10
     *
     * @return DUMMY10 - 预留字段10
     */
    public String getDummy10() {
        return dummy10;
    }

    /**
     * 设置预留字段10
     *
     * @param dummy10 预留字段10
     */
    public void setDummy10(String dummy10) {
        this.dummy10 = dummy10 == null ? null : dummy10.trim();
    }

    /**
     * 获取预留字段11
     *
     * @return DUMMY11 - 预留字段11
     */
    public String getDummy11() {
        return dummy11;
    }

    /**
     * 设置预留字段11
     *
     * @param dummy11 预留字段11
     */
    public void setDummy11(String dummy11) {
        this.dummy11 = dummy11 == null ? null : dummy11.trim();
    }

    /**
     * 获取预留字段12
     *
     * @return DUMMY12 - 预留字段12
     */
    public String getDummy12() {
        return dummy12;
    }

    /**
     * 设置预留字段12
     *
     * @param dummy12 预留字段12
     */
    public void setDummy12(String dummy12) {
        this.dummy12 = dummy12 == null ? null : dummy12.trim();
    }

    /**
     * 获取预留字段13
     *
     * @return DUMMY13 - 预留字段13
     */
    public String getDummy13() {
        return dummy13;
    }

    /**
     * 设置预留字段13
     *
     * @param dummy13 预留字段13
     */
    public void setDummy13(String dummy13) {
        this.dummy13 = dummy13 == null ? null : dummy13.trim();
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