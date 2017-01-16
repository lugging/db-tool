package db.tool.model;

import javax.persistence.*;

@Table(name = "product_matrix_property")
public class ProductMatrixProperty {
    @Id
    @Column(name = "ATTR_NO")
    private String attrNo;

    @Column(name = "TABLE_NAME1")
    private String tableName1;

    @Column(name = "FIELD_NAME1")
    private String fieldName1;

    @Column(name = "TABLE_NAME2")
    private String tableName2;

    @Column(name = "FIELD_NAME2")
    private String fieldName2;

    @Column(name = "IS_DEF_ONLY_PROD")
    private String isDefOnlyProd;

    @Column(name = "IS_DELETE")
    private String isDelete;

    /**
     * @return ATTR_NO
     */
    public String getAttrNo() {
        return attrNo;
    }

    /**
     * @param attrNo
     */
    public void setAttrNo(String attrNo) {
        this.attrNo = attrNo == null ? null : attrNo.trim();
    }

    /**
     * @return TABLE_NAME1
     */
    public String getTableName1() {
        return tableName1;
    }

    /**
     * @param tableName1
     */
    public void setTableName1(String tableName1) {
        this.tableName1 = tableName1 == null ? null : tableName1.trim();
    }

    /**
     * @return FIELD_NAME1
     */
    public String getFieldName1() {
        return fieldName1;
    }

    /**
     * @param fieldName1
     */
    public void setFieldName1(String fieldName1) {
        this.fieldName1 = fieldName1 == null ? null : fieldName1.trim();
    }

    /**
     * @return TABLE_NAME2
     */
    public String getTableName2() {
        return tableName2;
    }

    /**
     * @param tableName2
     */
    public void setTableName2(String tableName2) {
        this.tableName2 = tableName2 == null ? null : tableName2.trim();
    }

    /**
     * @return FIELD_NAME2
     */
    public String getFieldName2() {
        return fieldName2;
    }

    /**
     * @param fieldName2
     */
    public void setFieldName2(String fieldName2) {
        this.fieldName2 = fieldName2 == null ? null : fieldName2.trim();
    }

    /**
     * @return IS_DEF_ONLY_PROD
     */
    public String getIsDefOnlyProd() {
        return isDefOnlyProd;
    }

    /**
     * @param isDefOnlyProd
     */
    public void setIsDefOnlyProd(String isDefOnlyProd) {
        this.isDefOnlyProd = isDefOnlyProd == null ? null : isDefOnlyProd.trim();
    }

    /**
     * @return IS_DELETE
     */
    public String getIsDelete() {
        return isDelete;
    }

    /**
     * @param isDelete
     */
    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete == null ? null : isDelete.trim();
    }
}