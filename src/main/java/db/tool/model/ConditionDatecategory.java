package db.tool.model;

import javax.persistence.*;

@Table(name = "condition_datecategory")
public class ConditionDatecategory {
    @Id
    @Column(name = "DATE_CATEGORY")
    private String dateCategory;

    @Column(name = "TEXT")
    private String text;

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
     * @return TEXT
     */
    public String getText() {
        return text;
    }

    /**
     * @param text
     */
    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }
}