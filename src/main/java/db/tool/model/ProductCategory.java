package db.tool.model;

import javax.persistence.*;

@Table(name = "product_category")
public class ProductCategory {
    @Id
    @Column(name = "CATEGORY_NO")
    private String categoryNo;

    @Column(name = "PRODUCT_TYPE")
    private String productType;

    @Column(name = "IS_DELETE")
    private String isDelete;

    @Column(name = "BIT_NUMBER")
    private Integer bitNumber;

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
     * @return PRODUCT_TYPE
     */
    public String getProductType() {
        return productType;
    }

    /**
     * @param productType
     */
    public void setProductType(String productType) {
        this.productType = productType == null ? null : productType.trim();
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

    /**
     * @return BIT_NUMBER
     */
    public Integer getBitNumber() {
        return bitNumber;
    }

    /**
     * @param bitNumber
     */
    public void setBitNumber(Integer bitNumber) {
        this.bitNumber = bitNumber;
    }
}