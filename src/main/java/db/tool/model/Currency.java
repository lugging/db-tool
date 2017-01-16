package db.tool.model;

import java.util.Date;
import javax.persistence.*;

public class Currency {
    @Id
    @Column(name = "CURRENCY")
    private String currency;

    @Column(name = "ISOCD")
    private String isocd;

    @Column(name = "ALTER_CURR_CODE")
    private String alterCurrCode;

    @Column(name = "VALID_TO_DATE")
    private Date validToDate;

    @Column(name = "CURR_PRECISION")
    private Integer currPrecision;

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
     * @return ISOCD
     */
    public String getIsocd() {
        return isocd;
    }

    /**
     * @param isocd
     */
    public void setIsocd(String isocd) {
        this.isocd = isocd == null ? null : isocd.trim();
    }

    /**
     * @return ALTER_CURR_CODE
     */
    public String getAlterCurrCode() {
        return alterCurrCode;
    }

    /**
     * @param alterCurrCode
     */
    public void setAlterCurrCode(String alterCurrCode) {
        this.alterCurrCode = alterCurrCode == null ? null : alterCurrCode.trim();
    }

    /**
     * @return VALID_TO_DATE
     */
    public Date getValidToDate() {
        return validToDate;
    }

    /**
     * @param validToDate
     */
    public void setValidToDate(Date validToDate) {
        this.validToDate = validToDate;
    }

    /**
     * @return CURR_PRECISION
     */
    public Integer getCurrPrecision() {
        return currPrecision;
    }

    /**
     * @param currPrecision
     */
    public void setCurrPrecision(Integer currPrecision) {
        this.currPrecision = currPrecision;
    }
}