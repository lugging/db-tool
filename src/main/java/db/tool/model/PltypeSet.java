package db.tool.model;

import javax.persistence.*;

@Table(name = "pltype_set")
public class PltypeSet {
    @Id
    @Column(name = "PLTYPE")
    private String pltype;

    @Column(name = "TURNOVER_CLASS")
    private String turnoverClass;

    @Column(name = "BLCTYP")
    private String blctyp;

    @Column(name = "CMPDAT")
    private String cmpdat;

    @Column(name = "PERIOD")
    private Integer period;

    @Column(name = "P_UNIT")
    private String pUnit;

    @Column(name = "PERCHG")
    private String perchg;

    @Column(name = "PUNCHG")
    private String punchg;

    @Column(name = "AMTCHG")
    private String amtchg;

    /**
     * @return PLTYPE
     */
    public String getPltype() {
        return pltype;
    }

    /**
     * @param pltype
     */
    public void setPltype(String pltype) {
        this.pltype = pltype == null ? null : pltype.trim();
    }

    /**
     * @return TURNOVER_CLASS
     */
    public String getTurnoverClass() {
        return turnoverClass;
    }

    /**
     * @param turnoverClass
     */
    public void setTurnoverClass(String turnoverClass) {
        this.turnoverClass = turnoverClass == null ? null : turnoverClass.trim();
    }

    /**
     * @return BLCTYP
     */
    public String getBlctyp() {
        return blctyp;
    }

    /**
     * @param blctyp
     */
    public void setBlctyp(String blctyp) {
        this.blctyp = blctyp == null ? null : blctyp.trim();
    }

    /**
     * @return CMPDAT
     */
    public String getCmpdat() {
        return cmpdat;
    }

    /**
     * @param cmpdat
     */
    public void setCmpdat(String cmpdat) {
        this.cmpdat = cmpdat == null ? null : cmpdat.trim();
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
     * @return P_UNIT
     */
    public String getpUnit() {
        return pUnit;
    }

    /**
     * @param pUnit
     */
    public void setpUnit(String pUnit) {
        this.pUnit = pUnit == null ? null : pUnit.trim();
    }

    /**
     * @return PERCHG
     */
    public String getPerchg() {
        return perchg;
    }

    /**
     * @param perchg
     */
    public void setPerchg(String perchg) {
        this.perchg = perchg == null ? null : perchg.trim();
    }

    /**
     * @return PUNCHG
     */
    public String getPunchg() {
        return punchg;
    }

    /**
     * @param punchg
     */
    public void setPunchg(String punchg) {
        this.punchg = punchg == null ? null : punchg.trim();
    }

    /**
     * @return AMTCHG
     */
    public String getAmtchg() {
        return amtchg;
    }

    /**
     * @param amtchg
     */
    public void setAmtchg(String amtchg) {
        this.amtchg = amtchg == null ? null : amtchg.trim();
    }
}