package db.tool.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
/**
 * 账户限额管理
 * @author liugang
 *
 */
@Table(name = "bank_account_amount_limit")
public class BankAccountAmountLimit {
    /**
     * 账号
     */
    @Id
    @Column(name = "ACCOUNT_NO")
    private String accountNo;

    /**
     * 透支类型
     */
    @Id
    @Column(name = "LIMIT_TYPE")
    private String limitType;

    /**
     * 币种
     */
    @Column(name = "CURRENCY")
    private String currency;

    /**
     * 金额
     */
    @Column(name = "AMOUNT")
    private BigDecimal amount;

    /**
     * 生效日期
     */
    @Column(name = "VALID_FROM_DATE")
    private Date validFromDate;

    /**
     * 失效时期
     */
    @Column(name = "VALID_TO_DATE")
    private Date validToDate;

    /**
     * 状态
     */
    @Column(name = "STATUS")
    private String status;

    /**
     * 创建人
     */
    @Column(name = "CREATOR")
    private String creator;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * 创建柜员
     */
    @Column(name = "CREATE_TELLER")
    private String createTeller;

    /**
     * 创建机构
     */
    @Column(name = "CREATE_ORG")
    private String createOrg;

    /**
     * 修改人
     */
    @Column(name = "UPDATOR")
    private String updator;

    /**
     * 修改时间
     */
    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    /**
     * 修改柜员
     */
    @Column(name = "UPDATE_TELLER")
    private String updateTeller;

    /**
     * 修改机构
     */
    @Column(name = "UPDATE_ORG")
    private String updateOrg;

    /**
     * 附加字段1
     */
    @Column(name = "CUST_01")
    private String cust01;

    /**
     * 附加字段2
     */
    @Column(name = "CUST_02")
    private String cust02;

    /**
     * 附加字段3
     */
    @Column(name = "CUST_03")
    private String cust03;

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
     * 获取透支类型
     *
     * @return LIMIT_TYPE - 透支类型
     */
    public String getLimitType() {
        return limitType;
    }

    /**
     * 设置透支类型
     *
     * @param limitType 透支类型
     */
    public void setLimitType(String limitType) {
        this.limitType = limitType == null ? null : limitType.trim();
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
     * 获取生效日期
     *
     * @return VALID_FROM_DATE - 生效日期
     */
    public Date getValidFromDate() {
        return validFromDate;
    }

    /**
     * 设置生效日期
     *
     * @param validFromDate 生效日期
     */
    public void setValidFromDate(Date validFromDate) {
        this.validFromDate = validFromDate;
    }

    /**
     * 获取失效时期
     *
     * @return VALID_TO_DATE - 失效时期
     */
    public Date getValidToDate() {
        return validToDate;
    }

    /**
     * 设置失效时期
     *
     * @param validToDate 失效时期
     */
    public void setValidToDate(Date validToDate) {
        this.validToDate = validToDate;
    }

    /**
     * 获取状态
     *
     * @return STATUS - 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 获取创建人
     *
     * @return CREATOR - 创建人
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置创建人
     *
     * @param creator 创建人
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * 获取创建时间
     *
     * @return CREATE_TIME - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取创建柜员
     *
     * @return CREATE_TELLER - 创建柜员
     */
    public String getCreateTeller() {
        return createTeller;
    }

    /**
     * 设置创建柜员
     *
     * @param createTeller 创建柜员
     */
    public void setCreateTeller(String createTeller) {
        this.createTeller = createTeller == null ? null : createTeller.trim();
    }

    /**
     * 获取创建机构
     *
     * @return CREATE_ORG - 创建机构
     */
    public String getCreateOrg() {
        return createOrg;
    }

    /**
     * 设置创建机构
     *
     * @param createOrg 创建机构
     */
    public void setCreateOrg(String createOrg) {
        this.createOrg = createOrg == null ? null : createOrg.trim();
    }

    /**
     * 获取修改人
     *
     * @return UPDATOR - 修改人
     */
    public String getUpdator() {
        return updator;
    }

    /**
     * 设置修改人
     *
     * @param updator 修改人
     */
    public void setUpdator(String updator) {
        this.updator = updator == null ? null : updator.trim();
    }

    /**
     * 获取修改时间
     *
     * @return UPDATE_TIME - 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取修改柜员
     *
     * @return UPDATE_TELLER - 修改柜员
     */
    public String getUpdateTeller() {
        return updateTeller;
    }

    /**
     * 设置修改柜员
     *
     * @param updateTeller 修改柜员
     */
    public void setUpdateTeller(String updateTeller) {
        this.updateTeller = updateTeller == null ? null : updateTeller.trim();
    }

    /**
     * 获取修改机构
     *
     * @return UPDATE_ORG - 修改机构
     */
    public String getUpdateOrg() {
        return updateOrg;
    }

    /**
     * 设置修改机构
     *
     * @param updateOrg 修改机构
     */
    public void setUpdateOrg(String updateOrg) {
        this.updateOrg = updateOrg == null ? null : updateOrg.trim();
    }

    /**
     * 获取附加字段1
     *
     * @return CUST_01 - 附加字段1
     */
    public String getCust01() {
        return cust01;
    }

    /**
     * 设置附加字段1
     *
     * @param cust01 附加字段1
     */
    public void setCust01(String cust01) {
        this.cust01 = cust01 == null ? null : cust01.trim();
    }

    /**
     * 获取附加字段2
     *
     * @return CUST_02 - 附加字段2
     */
    public String getCust02() {
        return cust02;
    }

    /**
     * 设置附加字段2
     *
     * @param cust02 附加字段2
     */
    public void setCust02(String cust02) {
        this.cust02 = cust02 == null ? null : cust02.trim();
    }

    /**
     * 获取附加字段3
     *
     * @return CUST_03 - 附加字段3
     */
    public String getCust03() {
        return cust03;
    }

    /**
     * 设置附加字段3
     *
     * @param cust03 附加字段3
     */
    public void setCust03(String cust03) {
        this.cust03 = cust03 == null ? null : cust03.trim();
    }
}