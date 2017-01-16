package db.tool.model;

import javax.persistence.*;

@Table(name = "turnover_class")
public class TurnoverClass {
    @Id
    @Column(name = "TURNOVER_CLASS")
    private String turnoverClass;

    @Column(name = "AGGREGAT_BALANCE")
    private String aggregatBalance;

    @Column(name = "TRNOVRCL_ASSIGN")
    private String trnovrclAssign;

    @Column(name = "FLG_INACTIVE_ACC")
    private String flgInactiveAcc;

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
     * @return AGGREGAT_BALANCE
     */
    public String getAggregatBalance() {
        return aggregatBalance;
    }

    /**
     * @param aggregatBalance
     */
    public void setAggregatBalance(String aggregatBalance) {
        this.aggregatBalance = aggregatBalance == null ? null : aggregatBalance.trim();
    }

    /**
     * @return TRNOVRCL_ASSIGN
     */
    public String getTrnovrclAssign() {
        return trnovrclAssign;
    }

    /**
     * @param trnovrclAssign
     */
    public void setTrnovrclAssign(String trnovrclAssign) {
        this.trnovrclAssign = trnovrclAssign == null ? null : trnovrclAssign.trim();
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