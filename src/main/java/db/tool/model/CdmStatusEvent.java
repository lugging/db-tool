package db.tool.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cdm_status_event")
public class CdmStatusEvent {
    @Id
    @Column(name = "CARD_STATUS")
    private String cardStatus;

    @Id
    @Column(name = "CARD_EVENT")
    private String cardEvent;

    @Column(name = "DESCIPTION")
    private String desciption;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "LAST_CHG_DATE")
    private Date lastChgDate;

    @Column(name = "LAST_CHG_TIME")
    private Date lastChgTime;

    @Column(name = "LAST_CHG_TELLER")
    private String lastChgTeller;

    /**
     * @return CARD_STATUS
     */
    public String getCardStatus() {
        return cardStatus;
    }

    /**
     * @param cardStatus
     */
    public void setCardStatus(String cardStatus) {
        this.cardStatus = cardStatus == null ? null : cardStatus.trim();
    }

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
     * @return DESCIPTION
     */
    public String getDesciption() {
        return desciption;
    }

    /**
     * @param desciption
     */
    public void setDesciption(String desciption) {
        this.desciption = desciption == null ? null : desciption.trim();
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