package db.tool.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "product_attribute_relation")
public class ProductAttributeRelation {
    @Id
    @Column(name = "ATTR_NO")
    private String attrNo;

    @Id
    @Column(name = "CATEGORY_NO")
    private String categoryNo;

    @Column(name = "PARENT_NO")
    private String parentNo;

    @Column(name = "CHILD_NO")
    private String childNo;

    @Column(name = "NEXT_NO")
    private String nextNo;

    @Column(name = "IS_DELETE")
    private String isDelete;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "CREATOR")
    private String creator;

    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    @Column(name = "UPDATOR")
    private String updator;

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
     * @return PARENT_NO
     */
    public String getParentNo() {
        return parentNo;
    }

    /**
     * @param parentNo
     */
    public void setParentNo(String parentNo) {
        this.parentNo = parentNo == null ? null : parentNo.trim();
    }

    /**
     * @return CHILD_NO
     */
    public String getChildNo() {
        return childNo;
    }

    /**
     * @param childNo
     */
    public void setChildNo(String childNo) {
        this.childNo = childNo == null ? null : childNo.trim();
    }

    /**
     * @return NEXT_NO
     */
    public String getNextNo() {
        return nextNo;
    }

    /**
     * @param nextNo
     */
    public void setNextNo(String nextNo) {
        this.nextNo = nextNo == null ? null : nextNo.trim();
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

    /**
     * @return UPDATE_TIME
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return UPDATOR
     */
    public String getUpdator() {
        return updator;
    }

    /**
     * @param updator
     */
    public void setUpdator(String updator) {
        this.updator = updator == null ? null : updator.trim();
    }
}