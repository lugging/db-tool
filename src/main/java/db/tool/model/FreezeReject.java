package db.tool.model;

import javax.persistence.*;

@Table(name = "freeze_reject")
public class FreezeReject {
    @Id
    @Column(name = "MUTEX_ID")
    private Integer mutexId;

    @Column(name = "EVENT_TYPE_TOSIGN")
    private String eventTypeTosign;

    @Column(name = "REMARK_PEND")
    private String remarkPend;

    @Column(name = "EVENT_TYPE_EXIST")
    private String eventTypeExist;

    @Column(name = "REMARK_EXIST")
    private String remarkExist;

    @Column(name = "BLACK_OR_WHITE")
    private String blackOrWhite;

    @Column(name = "CUST_01")
    private String cust01;

    @Column(name = "CUST_02")
    private String cust02;

    @Column(name = "CUST_03")
    private String cust03;

    /**
     * @return MUTEX_ID
     */
    public Integer getMutexId() {
        return mutexId;
    }

    /**
     * @param mutexId
     */
    public void setMutexId(Integer mutexId) {
        this.mutexId = mutexId;
    }

    /**
     * @return EVENT_TYPE_TOSIGN
     */
    public String getEventTypeTosign() {
        return eventTypeTosign;
    }

    /**
     * @param eventTypeTosign
     */
    public void setEventTypeTosign(String eventTypeTosign) {
        this.eventTypeTosign = eventTypeTosign == null ? null : eventTypeTosign.trim();
    }

    /**
     * @return REMARK_PEND
     */
    public String getRemarkPend() {
        return remarkPend;
    }

    /**
     * @param remarkPend
     */
    public void setRemarkPend(String remarkPend) {
        this.remarkPend = remarkPend == null ? null : remarkPend.trim();
    }

    /**
     * @return EVENT_TYPE_EXIST
     */
    public String getEventTypeExist() {
        return eventTypeExist;
    }

    /**
     * @param eventTypeExist
     */
    public void setEventTypeExist(String eventTypeExist) {
        this.eventTypeExist = eventTypeExist == null ? null : eventTypeExist.trim();
    }

    /**
     * @return REMARK_EXIST
     */
    public String getRemarkExist() {
        return remarkExist;
    }

    /**
     * @param remarkExist
     */
    public void setRemarkExist(String remarkExist) {
        this.remarkExist = remarkExist == null ? null : remarkExist.trim();
    }

    /**
     * @return BLACK_OR_WHITE
     */
    public String getBlackOrWhite() {
        return blackOrWhite;
    }

    /**
     * @param blackOrWhite
     */
    public void setBlackOrWhite(String blackOrWhite) {
        this.blackOrWhite = blackOrWhite == null ? null : blackOrWhite.trim();
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

    /**
     * @return CUST_03
     */
    public String getCust03() {
        return cust03;
    }

    /**
     * @param cust03
     */
    public void setCust03(String cust03) {
        this.cust03 = cust03 == null ? null : cust03.trim();
    }
}