package db.tool.model;

import javax.persistence.*;

@Table(name = "attri_valuerange_type")
public class AttriValuerangeType {
    @Id
    @Column(name = "ATTRI_ID")
    private String attriId;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "TABLE_NAME")
    private String tableName;

    @Column(name = "FIELD_NAME")
    private String fieldName;

    @Column(name = "CONDITION")
    private String condition;

    /**
     * @return ATTRI_ID
     */
    public String getAttriId() {
        return attriId;
    }

    /**
     * @param attriId
     */
    public void setAttriId(String attriId) {
        this.attriId = attriId == null ? null : attriId.trim();
    }

    /**
     * @return TYPE
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * @return TABLE_NAME
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * @param tableName
     */
    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    /**
     * @return FIELD_NAME
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * @param fieldName
     */
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName == null ? null : fieldName.trim();
    }

    /**
     * @return CONDITION
     */
    public String getCondition() {
        return condition;
    }

    /**
     * @param condition
     */
    public void setCondition(String condition) {
        this.condition = condition == null ? null : condition.trim();
    }
}