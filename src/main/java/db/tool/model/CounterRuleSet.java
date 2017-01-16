package db.tool.model;

import javax.persistence.*;

@Table(name = "counter_rule_set")
public class CounterRuleSet {
    @Id
    @Column(name = "APPL_ID")
    private String applId;

    @Id
    @Column(name = "APPL_ID_NUMBER")
    private String applIdNumber;

    @Id
    @Column(name = "SEQ_NUMBER")
    private Integer seqNumber;

    @Column(name = "FIELD_NAME")
    private String fieldName;

    @Column(name = "CATEGORY")
    private String category;

    @Column(name = "LOW")
    private String low;

    @Column(name = "HIGH")
    private String high;

    @Column(name = "FLG_LOW_VAR")
    private String flgLowVar;

    @Column(name = "FLG_HIGH_VAR")
    private String flgHighVar;

    @Column(name = "STATUS")
    private String status;

    /**
     * @return APPL_ID
     */
    public String getApplId() {
        return applId;
    }

    /**
     * @param applId
     */
    public void setApplId(String applId) {
        this.applId = applId == null ? null : applId.trim();
    }

    /**
     * @return APPL_ID_NUMBER
     */
    public String getApplIdNumber() {
        return applIdNumber;
    }

    /**
     * @param applIdNumber
     */
    public void setApplIdNumber(String applIdNumber) {
        this.applIdNumber = applIdNumber == null ? null : applIdNumber.trim();
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
     * @return FIELD_NAME
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * @param fieldName
     */
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName == null ? null : fieldName.trim();
    }

    /**
     * @return CATEGORY
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category
     */
    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    /**
     * @return LOW
     */
    public String getLow() {
        return low;
    }

    /**
     * @param low
     */
    public void setLow(String low) {
        this.low = low == null ? null : low.trim();
    }

    /**
     * @return HIGH
     */
    public String getHigh() {
        return high;
    }

    /**
     * @param high
     */
    public void setHigh(String high) {
        this.high = high == null ? null : high.trim();
    }

    /**
     * @return FLG_LOW_VAR
     */
    public String getFlgLowVar() {
        return flgLowVar;
    }

    /**
     * @param flgLowVar
     */
    public void setFlgLowVar(String flgLowVar) {
        this.flgLowVar = flgLowVar == null ? null : flgLowVar.trim();
    }

    /**
     * @return FLG_HIGH_VAR
     */
    public String getFlgHighVar() {
        return flgHighVar;
    }

    /**
     * @param flgHighVar
     */
    public void setFlgHighVar(String flgHighVar) {
        this.flgHighVar = flgHighVar == null ? null : flgHighVar.trim();
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