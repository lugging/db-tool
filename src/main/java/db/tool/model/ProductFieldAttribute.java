package db.tool.model;

import javax.persistence.*;

@Table(name = "product_field_attribute")
public class ProductFieldAttribute {
    @Id
    @Column(name = "ATTR_NO")
    private String attrNo;

    @Column(name = "FIELD_NAME")
    private String fieldName;

    @Column(name = "VALUE_TYPE")
    private String valueType;

    @Column(name = "IS_DEF_ONLY_PROD")
    private String isDefOnlyProd;

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
     * @return VALUE_TYPE
     */
    public String getValueType() {
        return valueType;
    }

    /**
     * @param valueType
     */
    public void setValueType(String valueType) {
        this.valueType = valueType == null ? null : valueType.trim();
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
}