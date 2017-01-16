package db.tool.model;

import javax.persistence.*;

@Table(name = "product_attr_type")
public class ProductAttrType {
    @Id
    @Column(name = "ATTR_TYPE")
    private String attrType;

    @Column(name = "TABLE_NAME")
    private String tableName;

    /**
     * @return ATTR_TYPE
     */
    public String getAttrType() {
        return attrType;
    }

    /**
     * @param attrType
     */
    public void setAttrType(String attrType) {
        this.attrType = attrType == null ? null : attrType.trim();
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
}