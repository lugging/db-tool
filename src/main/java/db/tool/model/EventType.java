package db.tool.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "event_type")
public class EventType {
    @Id
    @Column(name = "EVENT_TYPE")
    private String eventType;

    @Column(name = "ACTIVE_FLAG")
    private String activeFlag;

    @Column(name = "EVENT_CLASS")
    private String eventClass;

    @Column(name = "LOCK_ID")
    private String lockId;

    @Column(name = "LOCK_CATEGORY")
    private String lockCategory;

    @Column(name = "ET_DATE")
    private String etDate;

    @Column(name = "LEVEL_CLASS")
    private String levelClass;

    @Column(name = "AMONT_FLAG")
    private String amontFlag;

    @Column(name = "FIX_AMOUNT_FLAG")
    private String fixAmountFlag;

    @Column(name = "CREATOR")
    private String creator;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "UPDATOR")
    private String updator;

    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    @Column(name = "OVER_AMOUNT_FLAG")
    private String overAmountFlag;

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
     * @return ACTIVE_FLAG
     */
    public String getActiveFlag() {
        return activeFlag;
    }

    /**
     * @param activeFlag
     */
    public void setActiveFlag(String activeFlag) {
        this.activeFlag = activeFlag == null ? null : activeFlag.trim();
    }

    /**
     * @return EVENT_CLASS
     */
    public String getEventClass() {
        return eventClass;
    }

    /**
     * @param eventClass
     */
    public void setEventClass(String eventClass) {
        this.eventClass = eventClass == null ? null : eventClass.trim();
    }

    /**
     * @return LOCK_ID
     */
    public String getLockId() {
        return lockId;
    }

    /**
     * @param lockId
     */
    public void setLockId(String lockId) {
        this.lockId = lockId == null ? null : lockId.trim();
    }

    /**
     * @return LOCK_CATEGORY
     */
    public String getLockCategory() {
        return lockCategory;
    }

    /**
     * @param lockCategory
     */
    public void setLockCategory(String lockCategory) {
        this.lockCategory = lockCategory == null ? null : lockCategory.trim();
    }

    /**
     * @return ET_DATE
     */
    public String getEtDate() {
        return etDate;
    }

    /**
     * @param etDate
     */
    public void setEtDate(String etDate) {
        this.etDate = etDate == null ? null : etDate.trim();
    }

    /**
     * @return LEVEL_CLASS
     */
    public String getLevelClass() {
        return levelClass;
    }

    /**
     * @param levelClass
     */
    public void setLevelClass(String levelClass) {
        this.levelClass = levelClass == null ? null : levelClass.trim();
    }

    /**
     * @return AMONT_FLAG
     */
    public String getAmontFlag() {
        return amontFlag;
    }

    /**
     * @param amontFlag
     */
    public void setAmontFlag(String amontFlag) {
        this.amontFlag = amontFlag == null ? null : amontFlag.trim();
    }

    /**
     * @return FIX_AMOUNT_FLAG
     */
    public String getFixAmountFlag() {
        return fixAmountFlag;
    }

    /**
     * @param fixAmountFlag
     */
    public void setFixAmountFlag(String fixAmountFlag) {
        this.fixAmountFlag = fixAmountFlag == null ? null : fixAmountFlag.trim();
    }

    /**
     * @return CREATOR
     */
    public String getCreator() {
        return creator;
    }

    /**
     * @param creator
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
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
     * @return UPDATOR
     */
    public String getUpdator() {
        return updator;
    }

    /**
     * @param updator
     */
    public void setUpdator(String updator) {
        this.updator = updator == null ? null : updator.trim();
    }

    /**
     * @return UPDATE_TIME
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return OVER_AMOUNT_FLAG
     */
    public String getOverAmountFlag() {
        return overAmountFlag;
    }

    /**
     * @param overAmountFlag
     */
    public void setOverAmountFlag(String overAmountFlag) {
        this.overAmountFlag = overAmountFlag == null ? null : overAmountFlag.trim();
    }
}