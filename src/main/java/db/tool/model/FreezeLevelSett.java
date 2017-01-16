package db.tool.model;

import javax.persistence.*;

@Table(name = "freeze_level_sett")
public class FreezeLevelSett {
    @Id
    @Column(name = "LEVEL_CLASS")
    private String levelClass;

    @Column(name = "LEVEL_CODE")
    private Integer levelCode;

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
     * @return LEVEL_CODE
     */
    public Integer getLevelCode() {
        return levelCode;
    }

    /**
     * @param levelCode
     */
    public void setLevelCode(Integer levelCode) {
        this.levelCode = levelCode;
    }
}