package db.tool.model;

import javax.persistence.*;

@Table(name = "product_matrix_relation")
public class ProductMatrixRelation {
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

    @Id
    @Column(name = "FIELD_CODE1")
    private String fieldCode1;

    @Id
    @Column(name = "FIELD_CODE2")
    private String fieldCode2;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "IS_FIXED")
    private String isFixed;

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
     * @return FIELD_CODE1
     */
    public String getFieldCode1() {
        return fieldCode1;
    }

    /**
     * @param fieldCode1
     */
    public void setFieldCode1(String fieldCode1) {
        this.fieldCode1 = fieldCode1 == null ? null : fieldCode1.trim();
    }

    /**
     * @return FIELD_CODE2
     */
    public String getFieldCode2() {
        return fieldCode2;
    }

    /**
     * @param fieldCode2
     */
    public void setFieldCode2(String fieldCode2) {
        this.fieldCode2 = fieldCode2 == null ? null : fieldCode2.trim();
    }

    /**
     * @return STATUS
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * @return IS_FIXED
     */
    public String getIsFixed() {
        return isFixed;
    }

    /**
     * @param isFixed
     */
    public void setIsFixed(String isFixed) {
        this.isFixed = isFixed == null ? null : isFixed.trim();
    }
}