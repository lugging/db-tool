package db.tool.model;

import javax.persistence.*;

@Table(name = "tt_lock_rela")
public class TtLockRela {
    @Id
    @Column(name = "LOCK_ID")
    private String lockId;

    @Id
    @Column(name = "MEDIUM")
    private String medium;

    @Id
    @Column(name = "TT_GROUP")
    private String ttGroup;

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
     * @return MEDIUM
     */
    public String getMedium() {
        return medium;
    }

    /**
     * @param medium
     */
    public void setMedium(String medium) {
        this.medium = medium == null ? null : medium.trim();
    }

    /**
     * @return TT_GROUP
     */
    public String getTtGroup() {
        return ttGroup;
    }

    /**
     * @param ttGroup
     */
    public void setTtGroup(String ttGroup) {
        this.ttGroup = ttGroup == null ? null : ttGroup.trim();
    }
}