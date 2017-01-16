package db.tool.model;

import javax.persistence.*;

@Table(name = "condition_diff")
public class ConditionDiff {
    @Id
    @Column(name = "DIFFE_CATEGORY")
    private String diffeCategory;

    @Column(name = "DESCRIPTION")
    private String description;

    /**
     * @return DIFFE_CATEGORY
     */
    public String getDiffeCategory() {
        return diffeCategory;
    }

    /**
     * @param diffeCategory
     */
    public void setDiffeCategory(String diffeCategory) {
        this.diffeCategory = diffeCategory == null ? null : diffeCategory.trim();
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