package db.tool.model;

import javax.persistence.*;

@Table(name = "product_value_limit")
public class ProductValueLimit {
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

    @Column(name = "SEQ_NUMBER")
    private Integer seqNumber;

    @Column(name = "VALUE_FROM")
    private String valueFrom;

    @Column(name = "VALUE_TO")
    private String valueTo;

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
     * @return SEQ_NUMBER
     */
    public Integer getSeqNumber() {
        return seqNumber;
    }

    /**
     * @param seqNumber
     */
    public void setSeqNumber(Integer seqNumber) {
        this.seqNumber = seqNumber;
    }

    /**
     * @return VALUE_FROM
     */
    public String getValueFrom() {
        return valueFrom;
    }

    /**
     * @param valueFrom
     */
    public void setValueFrom(String valueFrom) {
        this.valueFrom = valueFrom == null ? null : valueFrom.trim();
    }

    /**
     * @return VALUE_TO
     */
    public String getValueTo() {
        return valueTo;
    }

    /**
     * @param valueTo
     */
    public void setValueTo(String valueTo) {
        this.valueTo = valueTo == null ? null : valueTo.trim();
    }
}