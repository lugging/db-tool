package db.tool.model;

import javax.persistence.*;

@Table(name = "counter_define")
public class CounterDefine {
    @Id
    @Column(name = "COUNTER_TYPE")
    private String counterType;

    @Column(name = "COUNTER_CATG")
    private String counterCatg;

    @Column(name = "FLG_ALLOW_AMOUNT")
    private String flgAllowAmount;

    @Column(name = "CNTR_ASSIGNMENT")
    private String cntrAssignment;

    @Column(name = "FLG_CHG_MAN")
    private String flgChgMan;

    @Column(name = "FLG_INACTIVE_ACC")
    private String flgInactiveAcc;

    /**
     * @return COUNTER_TYPE
     */
    public String getCounterType() {
        return counterType;
    }

    /**
     * @param counterType
     */
    public void setCounterType(String counterType) {
        this.counterType = counterType == null ? null : counterType.trim();
    }

    /**
     * @return COUNTER_CATG
     */
    public String getCounterCatg() {
        return counterCatg;
    }

    /**
     * @param counterCatg
     */
    public void setCounterCatg(String counterCatg) {
        this.counterCatg = counterCatg == null ? null : counterCatg.trim();
    }

    /**
     * @return FLG_ALLOW_AMOUNT
     */
    public String getFlgAllowAmount() {
        return flgAllowAmount;
    }

    /**
     * @param flgAllowAmount
     */
    public void setFlgAllowAmount(String flgAllowAmount) {
        this.flgAllowAmount = flgAllowAmount == null ? null : flgAllowAmount.trim();
    }

    /**
     * @return CNTR_ASSIGNMENT
     */
    public String getCntrAssignment() {
        return cntrAssignment;
    }

    /**
     * @param cntrAssignment
     */
    public void setCntrAssignment(String cntrAssignment) {
        this.cntrAssignment = cntrAssignment == null ? null : cntrAssignment.trim();
    }

    /**
     * @return FLG_CHG_MAN
     */
    public String getFlgChgMan() {
        return flgChgMan;
    }

    /**
     * @param flgChgMan
     */
    public void setFlgChgMan(String flgChgMan) {
        this.flgChgMan = flgChgMan == null ? null : flgChgMan.trim();
    }

    /**
     * @return FLG_INACTIVE_ACC
     */
    public String getFlgInactiveAcc() {
        return flgInactiveAcc;
    }

    /**
     * @param flgInactiveAcc
     */
    public void setFlgInactiveAcc(String flgInactiveAcc) {
        this.flgInactiveAcc = flgInactiveAcc == null ? null : flgInactiveAcc.trim();
    }
}