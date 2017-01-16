package db.tool.model;

import javax.persistence.*;

@Table(name = "condition_date")
public class ConditionDate {
    @Id
    @Column(name = "CONDITION_TYPE")
    private String conditionType;

    @Id
    @Column(name = "DATE_CATEGORY")
    private String dateCategory;

    @Column(name = "DESCRIPTION")
    private String description;

    /**
     * @return CONDITION_TYPE
     */
    public String getConditionType() {
        return conditionType;
    }

    /**
     * @param conditionType
     */
    public void setConditionType(String conditionType) {
        this.conditionType = conditionType == null ? null : conditionType.trim();
    }

    /**
     * @return DATE_CATEGORY
     */
    public String getDateCategory() {
        return dateCategory;
    }

    /**
     * @param dateCategory
     */
    public void setDateCategory(String dateCategory) {
        this.dateCategory = dateCategory == null ? null : dateCategory.trim();
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