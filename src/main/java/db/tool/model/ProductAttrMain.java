package db.tool.model;

import javax.persistence.*;

@Table(name = "product_attr_main")
public class ProductAttrMain {
    @Id
    @Column(name = "ATTR_NO")
    private String attrNo;

    @Column(name = "PRODUCT_TYPE")
    private String productType;

    @Column(name = "ATTR_TYPE")
    private String attrType;

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