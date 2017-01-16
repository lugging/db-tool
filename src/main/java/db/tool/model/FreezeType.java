package db.tool.model;

import javax.persistence.*;

@Table(name = "freeze_type")
public class FreezeType {
    @Id
    @Column(name = "LOCK_ID")
    private String lockId;

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
}