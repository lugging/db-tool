package db.tool.model;

import javax.persistence.*;

@Table(name = "product_fieldattri_profea_rel")
public class ProductFieldattriProfeaRel {
    @Id
    @Column(name = "PRODUCT_ID")
    private String productId;

    @Id
    @Column(name = "PRODUCT_VERSION")
    private String productVersion;

    @Id
    @Column(name = "CATEGORY_NO")
    private String categoryNo;

    @Id
    @Column(name = "ATTR_NO")
    private String attrNo;

    @Column(name = "VALUE_TYPE")
    private String valueType;

    /**
     * @return PRODUCT_ID
     */
    public String getProductId() {
        return productId;
    }

    /**
     * @param productId
     */
    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    /**
     * @return PRODUCT_VERSION
     */
    public String getProductVersion() {
        return productVersion;
    }

    /**
     * @param productVersion
     */
    public void setProductVersion(String productVersion) {
        this.productVersion = productVersion == null ? null : productVersion.trim();
    }

    /**
     * @return CATEGORY_NO
     */
    public String getCategoryNo() {
        return categoryNo;
    }

    /**
     * @param categoryNo
     */
    public void setCategoryNo(String categoryNo) {
        this.categoryNo = categoryNo == null ? null : categoryNo.trim();
    }

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
}