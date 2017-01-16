package db.tool.model;

import javax.persistence.*;

@Table(name = "business_object")
public class BusinessObject {
    @Id
    @Column(name = "TRANS_SEQ_NO")
    private String transSeqNo;

    @Id
    @Column(name = "ROUTE_BO_TYPE")
    private String routeBoType;

    @Id
    @Column(name = "ROUTE_BO_ID")
    private String routeBoId;

    @Id
    @Column(name = "STEP_NO")
    private Integer stepNo;

    @Id
    @Column(name = "LINE_NO")
    private Integer lineNo;

    @Column(name = "BO_TYPE")
    private String boType;

    @Column(name = "BO_INSTANCE_ID")
    private String boInstanceId;

    @Column(name = "STATUS")
    private String status;

    /**
     * @return TRANS_SEQ_NO
     */
    public String getTransSeqNo() {
        return transSeqNo;
    }

    /**
     * @param transSeqNo
     */
    public void setTransSeqNo(String transSeqNo) {
        this.transSeqNo = transSeqNo == null ? null : transSeqNo.trim();
    }

    /**
     * @return ROUTE_BO_TYPE
     */
    public String getRouteBoType() {
        return routeBoType;
    }

    /**
     * @param routeBoType
     */
    public void setRouteBoType(String routeBoType) {
        this.routeBoType = routeBoType == null ? null : routeBoType.trim();
    }

    /**
     * @return ROUTE_BO_ID
     */
    public String getRouteBoId() {
        return routeBoId;
    }

    /**
     * @param routeBoId
     */
    public void setRouteBoId(String routeBoId) {
        this.routeBoId = routeBoId == null ? null : routeBoId.trim();
    }

    /**
     * @return STEP_NO
     */
    public Integer getStepNo() {
        return stepNo;
    }

    /**
     * @param stepNo
     */
    public void setStepNo(Integer stepNo) {
        this.stepNo = stepNo;
    }

    /**
     * @return LINE_NO
     */
    public Integer getLineNo() {
        return lineNo;
    }

    /**
     * @param lineNo
     */
    public void setLineNo(Integer lineNo) {
        this.lineNo = lineNo;
    }

    /**
     * @return BO_TYPE
     */
    public String getBoType() {
        return boType;
    }

    /**
     * @param boType
     */
    public void setBoType(String boType) {
        this.boType = boType == null ? null : boType.trim();
    }

    /**
     * @return BO_INSTANCE_ID
     */
    public String getBoInstanceId() {
        return boInstanceId;
    }

    /**
     * @param boInstanceId
     */
    public void setBoInstanceId(String boInstanceId) {
        this.boInstanceId = boInstanceId == null ? null : boInstanceId.trim();
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