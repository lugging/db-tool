package db.tool.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "posting_change")
public class PostingChange {
    @Id
    @Column(name = "POSTING_AREA")
    private String postingArea;

    @Id
    @Column(name = "DAY_TYPE")
    private String dayType;

    @Id
    @Column(name = "VALID_FROM_DATE")
    private Date validFromDate;

    @Column(name = "TIMESTAMP")
    private Date timestamp;

    @Column(name = "OPERATOR")
    private String operator;

    /**
     * @return POSTING_AREA
     */
    public String getPostingArea() {
        return postingArea;
    }

    /**
     * @param postingArea
     */
    public void setPostingArea(String postingArea) {
        this.postingArea = postingArea == null ? null : postingArea.trim();
    }

    /**
     * @return DAY_TYPE
     */
    public String getDayType() {
        return dayType;
    }

    /**
     * @param dayType
     */
    public void setDayType(String dayType) {
        this.dayType = dayType == null ? null : dayType.trim();
    }

    /**
     * @return VALID_FROM_DATE
     */
    public Date getValidFromDate() {
        return validFromDate;
    }

    /**
     * @param validFromDate
     */
    public void setValidFromDate(Date validFromDate) {
        this.validFromDate = validFromDate;
    }

    /**
     * @return TIMESTAMP
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * @param timestamp
     */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * @return OPERATOR
     */
    public String getOperator() {
        return operator;
    }

    /**
     * @param operator
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }
}