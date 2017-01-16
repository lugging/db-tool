package db.tool.model;

import javax.persistence.*;

@Table(name = "tt_group")
public class TtGroup {
    @Id
    @Column(name = "TT_GROUP")
    private String ttGroup;

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