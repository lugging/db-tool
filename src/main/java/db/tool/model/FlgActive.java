package db.tool.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "flg_active")
public class FlgActive {
    @Id
    @Column(name = "TURNOVER_CLASS")
    private String turnoverClass;

    @Id
    @Column(name = "O_LISTTYPE")
    private Integer oListtype;

    @Column(name = "FLG_ACTIVE")
    private String flgActive;

    @Column(name = "ACTIVE_TIMESTAMP")
    private Date activeTimestamp;

    @Column(name = "DEACT_TIMESTAMP")
    private Date deactTimestamp;

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
     * @return O_LISTTYPE
     */
    public Integer getoListtype() {
        return oListtype;
    }

    /**
     * @param oListtype
     */
    public void setoListtype(Integer oListtype) {
        this.oListtype = oListtype;
    }

    /**
     * @return FLG_ACTIVE
     */
    public String getFlgActive() {
        return flgActive;
    }

    /**
     * @param flgActive
     */
    public void setFlgActive(String flgActive) {
        this.flgActive = flgActive == null ? null : flgActive.trim();
    }

    /**
     * @return ACTIVE_TIMESTAMP
     */
    public Date getActiveTimestamp() {
        return activeTimestamp;
    }

    /**
     * @param activeTimestamp
     */
    public void setActiveTimestamp(Date activeTimestamp) {
        this.activeTimestamp = activeTimestamp;
    }

    /**
     * @return DEACT_TIMESTAMP
     */
    public Date getDeactTimestamp() {
        return deactTimestamp;
    }

    /**
     * @param deactTimestamp
     */
    public void setDeactTimestamp(Date deactTimestamp) {
        this.deactTimestamp = deactTimestamp;
    }
}