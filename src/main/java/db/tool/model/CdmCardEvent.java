package db.tool.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cdm_card_event")
public class CdmCardEvent {
    @Id
    @Column(name = "CARD_EVENT")
    private String cardEvent;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "EVENT_TYPE")
    private String eventType;

    @Column(name = "NEXT_STATE")
    private String nextState;

    @Column(name = "CONTROL_DAYS")
    private Integer controlDays;

    @Column(name = "BRANCH_LIMIT")
    private String branchLimit;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "LAST_CHG_DATE")
    private Date lastChgDate;

    @Column(name = "LAST_CHG_TIME")
    private Date lastChgTime;

    @Column(name = "LAST_CHG_TELLER")
    private String lastChgTeller;

    /**
     * @return CARD_EVENT
     */
    public String getCardEvent() {
        return cardEvent;
    }

    /**
     * @param cardEvent
     */
    public void setCardEvent(String cardEvent) {
        this.cardEvent = cardEvent == null ? null : cardEvent.trim();
    }

    /**
     * @return DESCRIPTION
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * @return EVENT_TYPE
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * @param eventType
     */
    public void setEventType(String eventType) {
        this.eventType = eventType == null ? null : eventType.trim();
    }

    /**
     * @return NEXT_STATE
     */
    public String getNextState() {
        return nextState;
    }

    /**
     * @param nextState
     */
    public void setNextState(String nextState) {
        this.nextState = nextState == null ? null : nextState.trim();
    }

    /**
     * @return CONTROL_DAYS
     */
    public Integer getControlDays() {
        return controlDays;
    }

    /**
     * @param controlDays
     */
    public void setControlDays(Integer controlDays) {
        this.controlDays = controlDays;
    }

    /**
     * @return BRANCH_LIMIT
     */
    public String getBranchLimit() {
        return branchLimit;
    }

    /**
     * @param branchLimit
     */
    public void setBranchLimit(String branchLimit) {
        this.branchLimit = branchLimit == null ? null : branchLimit.trim();
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
     * @return LAST_CHG_DATE
     */
    public Date getLastChgDate() {
        return lastChgDate;
    }

    /**
     * @param lastChgDate
     */
    public void setLastChgDate(Date lastChgDate) {
        this.lastChgDate = lastChgDate;
    }

    /**
     * @return LAST_CHG_TIME
     */
    public Date getLastChgTime() {
        return lastChgTime;
    }

    /**
     * @param lastChgTime
     */
    public void setLastChgTime(Date lastChgTime) {
        this.lastChgTime = lastChgTime;
    }

    /**
     * @return LAST_CHG_TELLER
     */
    public String getLastChgTeller() {
        return lastChgTeller;
    }

    /**
     * @param lastChgTeller
     */
    public void setLastChgTeller(String lastChgTeller) {
        this.lastChgTeller = lastChgTeller == null ? null : lastChgTeller.trim();
    }
}