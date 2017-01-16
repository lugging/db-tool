package db.tool.model;

import javax.persistence.*;

@Table(name = "counter_limit_rela")
public class CounterLimitRela {
    @Id
    @Column(name = "ALCTYPE")
    private String alctype;

    @Column(name = "COUNTER")
    private String counter;

    @Column(name = "PERIOD")
    private Integer period;

    @Column(name = "P_UNIT")
    private String pUnit;

    /**
     * @return ALCTYPE
     */
    public String getAlctype() {
        return alctype;
    }

    /**
     * @param alctype
     */
    public void setAlctype(String alctype) {
        this.alctype = alctype == null ? null : alctype.trim();
    }

    /**
     * @return COUNTER
     */
    public String getCounter() {
        return counter;
    }

    /**
     * @param counter
     */
    public void setCounter(String counter) {
        this.counter = counter == null ? null : counter.trim();
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
}