package db.tool.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cdm_event_dtl")
public class CdmEventDtl {
    @Id
    @Column(name = "CARD_EVENT_ID")
    private String cardEventId;

    @Column(name = "CARD_ID")
    private String cardId;

    @Column(name = "CARD_NO")
    private String cardNo;

    @Column(name = "CARD_VER")
    private Integer cardVer;

    @Column(name = "EVENT_TYPE")
    private String eventType;

    @Column(name = "EVENT_DATE")
    private Date eventDate;

    @Column(name = "EVENT_TIME")
    private Date eventTime;

    @Column(name = "CARD_EVENT")
    private String cardEvent;

    @Column(name = "CARD_STATE")
    private String cardState;

    @Column(name = "NEXT_STATE")
    private String nextState;

    @Column(name = "NEW_CARD_NO")
    private String newCardNo;

    @Column(name = "NEW_CARD_VER")
    private Integer newCardVer;

    @Column(name = "DRAW_BRANCH")
    private String drawBranch;

    @Column(name = "PENDING_FLAG")
    private String pendingFlag;

    @Column(name = "SERIAL_decimal")
    private String serialDecimal;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "CREATE_DATE")
    private Date createDate;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "CREATE_TELLER")
    private String createTeller;

    @Column(name = "CREATE_MEDIUM")
    private String createMedium;

    @Column(name = "CREATE_ORG")
    private String createOrg;

    /**
     * @return CARD_EVENT_ID
     */
    public String getCardEventId() {
        return cardEventId;
    }

    /**
     * @param cardEventId
     */
    public void setCardEventId(String cardEventId) {
        this.cardEventId = cardEventId == null ? null : cardEventId.trim();
    }

    /**
     * @return CARD_ID
     */
    public String getCardId() {
        return cardId;
    }

    /**
     * @param cardId
     */
    public void setCardId(String cardId) {
        this.cardId = cardId == null ? null : cardId.trim();
    }

    /**
     * @return CARD_NO
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * @param cardNo
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    /**
     * @return CARD_VER
     */
    public Integer getCardVer() {
        return cardVer;
    }

    /**
     * @param cardVer
     */
    public void setCardVer(Integer cardVer) {
        this.cardVer = cardVer;
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
     * @return EVENT_DATE
     */
    public Date getEventDate() {
        return eventDate;
    }

    /**
     * @param eventDate
     */
    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    /**
     * @return EVENT_TIME
     */
    public Date getEventTime() {
        return eventTime;
    }

    /**
     * @param eventTime
     */
    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
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
     * @return CARD_STATE
     */
    public String getCardState() {
        return cardState;
    }

    /**
     * @param cardState
     */
    public void setCardState(String cardState) {
        this.cardState = cardState == null ? null : cardState.trim();
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
     * @return NEW_CARD_NO
     */
    public String getNewCardNo() {
        return newCardNo;
    }

    /**
     * @param newCardNo
     */
    public void setNewCardNo(String newCardNo) {
        this.newCardNo = newCardNo == null ? null : newCardNo.trim();
    }

    /**
     * @return NEW_CARD_VER
     */
    public Integer getNewCardVer() {
        return newCardVer;
    }

    /**
     * @param newCardVer
     */
    public void setNewCardVer(Integer newCardVer) {
        this.newCardVer = newCardVer;
    }

    /**
     * @return DRAW_BRANCH
     */
    public String getDrawBranch() {
        return drawBranch;
    }

    /**
     * @param drawBranch
     */
    public void setDrawBranch(String drawBranch) {
        this.drawBranch = drawBranch == null ? null : drawBranch.trim();
    }

    /**
     * @return PENDING_FLAG
     */
    public String getPendingFlag() {
        return pendingFlag;
    }

    /**
     * @param pendingFlag
     */
    public void setPendingFlag(String pendingFlag) {
        this.pendingFlag = pendingFlag == null ? null : pendingFlag.trim();
    }

    /**
     * @return SERIAL_decimal
     */
    public String getSerialDecimal() {
        return serialDecimal;
    }

    /**
     * @param serialDecimal
     */
    public void setSerialDecimal(String serialDecimal) {
        this.serialDecimal = serialDecimal == null ? null : serialDecimal.trim();
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
     * @return CREATE_DATE
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * @return CREATE_TIME
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return CREATE_TELLER
     */
    public String getCreateTeller() {
        return createTeller;
    }

    /**
     * @param createTeller
     */
    public void setCreateTeller(String createTeller) {
        this.createTeller = createTeller == null ? null : createTeller.trim();
    }

    /**
     * @return CREATE_MEDIUM
     */
    public String getCreateMedium() {
        return createMedium;
    }

    /**
     * @param createMedium
     */
    public void setCreateMedium(String createMedium) {
        this.createMedium = createMedium == null ? null : createMedium.trim();
    }

    /**
     * @return CREATE_ORG
     */
    public String getCreateOrg() {
        return createOrg;
    }

    /**
     * @param createOrg
     */
    public void setCreateOrg(String createOrg) {
        this.createOrg = createOrg == null ? null : createOrg.trim();
    }
}