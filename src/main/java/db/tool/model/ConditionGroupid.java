package db.tool.model;

import javax.persistence.*;

@Table(name = "condition_groupid")
public class ConditionGroupid {
    @Id
    @Column(name = "CONDITION_GROUP_ID")
    private String conditionGroupId;

    @Column(name = "DESCRIPTION")
    private String description;

    /**
     * @return CONDITION_GROUP_ID
     */
    public String getConditionGroupId() {
        return conditionGroupId;
    }

    /**
     * @param conditionGroupId
     */
    public void setConditionGroupId(String conditionGroupId) {
        this.conditionGroupId = conditionGroupId == null ? null : conditionGroupId.trim();
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
}