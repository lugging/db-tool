package db.tool.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "organization_relation")
public class OrganizationRelation {
    @Id
    @Column(name = "ORGANIZATION")
    private String organization;

    @Column(name = "ORG_TYPE")
    private String orgType;

    @Column(name = "ORG_PARENT")
    private String orgParent;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "CREATOR")
    private String creator;

    @Column(name = "STATUS")
    private String status;

    /**
     * @return ORGANIZATION
     */
    public String getOrganization() {
        return organization;
    }

    /**
     * @param organization
     */
    public void setOrganization(String organization) {
        this.organization = organization == null ? null : organization.trim();
    }

    /**
     * @return ORG_TYPE
     */
    public String getOrgType() {
        return orgType;
    }

    /**
     * @param orgType
     */
    public void setOrgType(String orgType) {
        this.orgType = orgType == null ? null : orgType.trim();
    }

    /**
     * @return ORG_PARENT
     */
    public String getOrgParent() {
        return orgParent;
    }

    /**
     * @param orgParent
     */
    public void setOrgParent(String orgParent) {
        this.orgParent = orgParent == null ? null : orgParent.trim();
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
}