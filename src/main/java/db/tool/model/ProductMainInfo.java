package db.tool.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "product_main_info")
public class ProductMainInfo {
    @Id
    @Column(name = "PRODUCT_ID")
    private String productId;

    @Column(name = "BANK_KEY")
    private String bankKey;

    @Column(name = "PRODUCT_TYPE")
    private String productType;

    @Column(name = "PRODUCT_NO")
    private String productNo;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "CREATOR")
    private String creator;

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
     * @return BANK_KEY
     */
    public String getBankKey() {
        return bankKey;
    }

    /**
     * @param bankKey
     */
    public void setBankKey(String bankKey) {
        this.bankKey = bankKey == null ? null : bankKey.trim();
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
     * @return PRODUCT_NO
     */
    public String getProductNo() {
        return productNo;
    }

    /**
     * @param productNo
     */
    public void setProductNo(String productNo) {
        this.productNo = productNo == null ? null : productNo.trim();
    }

    /**
     * @return CREATE_TIME
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return CREATOR
     */
    public String getCreator() {
        return creator;
    }

    /**
     * @param creator
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }
}