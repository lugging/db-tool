package db.tool.model;

import javax.persistence.*;

@Table(name = "product_type")
public class ProductType {
    @Id
    @Column(name = "PRODUCT_TYPE")
    private String productType;

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
}