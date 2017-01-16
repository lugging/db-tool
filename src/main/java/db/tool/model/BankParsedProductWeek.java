package db.tool.model;

import java.util.Date;
import javax.persistence.*;

/**
 * 1.1	产品层结息周期表-不分库
 * @author liugang
 *
 */
@Table(name = "bank_parsed_product_week")
public class BankParsedProductWeek {
	/**
	 * 产品编号
	 */
    @Id
    @Column(name = "PRODUCT_INT")
    private String productInt;

    /**
     * 期间系数
     */
    @Column(name = "PERIOD")
    private Integer period;

    /**
     * 期间单位
     */
    @Column(name = "PERIOD_UNIT")
    private String periodUnit;

    /**
     * 关键日期
     */
    @Column(name = "KEY_DATE")
    private String keyDate;

    /**
     * 基准日期
     */
    @Column(name = "BASE_DATE")
    private Date baseDate;

    /**
     * @return PRODUCT_INT
     */
    public String getProductInt() {
        return productInt;
    }

    /**
     * @param productInt
     */
    public void setProductInt(String productInt) {
        this.productInt = productInt == null ? null : productInt.trim();
    }

    /**
     * @return PERIOD
     */
    public Integer getPeriod() {
        return period;
    }

    /**
     * @param period
     */
    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     * @return PERIOD_UNIT
     */
    public String getPeriodUnit() {
        return periodUnit;
    }

    /**
     * @param periodUnit
     */
    public void setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit == null ? null : periodUnit.trim();
    }

    /**
     * @return KEY_DATE
     */
    public String getKeyDate() {
        return keyDate;
    }

    /**
     * @param keyDate
     */
    public void setKeyDate(String keyDate) {
        this.keyDate = keyDate == null ? null : keyDate.trim();
    }

    /**
     * @return BASE_DATE
     */
    public Date getBaseDate() {
        return baseDate;
    }

    /**
     * @param baseDate
     */
    public void setBaseDate(Date baseDate) {
        this.baseDate = baseDate;
    }
}