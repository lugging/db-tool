package db.tool.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cdm_card_state")
public class CdmCardState {
    @Id
    @Column(name = "CARD_STATUS")
    private String cardStatus;

    @Column(name = "DESCIPTION")
    private String desciption;

    @Column(name = "ALLOW_ASSO")
    private String allowAsso;

    @Column(name = "ALLOW_ADDCARD")
    private String allowAddcard;

    @Column(name = "ALLOW_QUERY")
    private String allowQuery;

    @Column(name = "ALLOW_SAVE")
    private String allowSave;

    @Column(name = "ALLOW_DRAW")
    private String allowDraw;

    @Column(name = "ALLOW_BKSAVE")
    private String allowBksave;

    @Column(name = "ALLOW_BKDRAW")
    private String allowBkdraw;

    @Column(name = "VALID_FLAG")
    private String validFlag;

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
     * @return ALLOW_ASSO
     */
    public String getAllowAsso() {
        return allowAsso;
    }

    /**
     * @param allowAsso
     */
    public void setAllowAsso(String allowAsso) {
        this.allowAsso = allowAsso == null ? null : allowAsso.trim();
    }

    /**
     * @return ALLOW_ADDCARD
     */
    public String getAllowAddcard() {
        return allowAddcard;
    }

    /**
     * @param allowAddcard
     */
    public void setAllowAddcard(String allowAddcard) {
        this.allowAddcard = allowAddcard == null ? null : allowAddcard.trim();
    }

    /**
     * @return ALLOW_QUERY
     */
    public String getAllowQuery() {
        return allowQuery;
    }

    /**
     * @param allowQuery
     */
    public void setAllowQuery(String allowQuery) {
        this.allowQuery = allowQuery == null ? null : allowQuery.trim();
    }

    /**
     * @return ALLOW_SAVE
     */
    public String getAllowSave() {
        return allowSave;
    }

    /**
     * @param allowSave
     */
    public void setAllowSave(String allowSave) {
        this.allowSave = allowSave == null ? null : allowSave.trim();
    }

    /**
     * @return ALLOW_DRAW
     */
    public String getAllowDraw() {
        return allowDraw;
    }

    /**
     * @param allowDraw
     */
    public void setAllowDraw(String allowDraw) {
        this.allowDraw = allowDraw == null ? null : allowDraw.trim();
    }

    /**
     * @return ALLOW_BKSAVE
     */
    public String getAllowBksave() {
        return allowBksave;
    }

    /**
     * @param allowBksave
     */
    public void setAllowBksave(String allowBksave) {
        this.allowBksave = allowBksave == null ? null : allowBksave.trim();
    }

    /**
     * @return ALLOW_BKDRAW
     */
    public String getAllowBkdraw() {
        return allowBkdraw;
    }

    /**
     * @param allowBkdraw
     */
    public void setAllowBkdraw(String allowBkdraw) {
        this.allowBkdraw = allowBkdraw == null ? null : allowBkdraw.trim();
    }

    /**
     * @return VALID_FLAG
     */
    public String getValidFlag() {
        return validFlag;
    }

    /**
     * @param validFlag
     */
    public void setValidFlag(String validFlag) {
        this.validFlag = validFlag == null ? null : validFlag.trim();
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