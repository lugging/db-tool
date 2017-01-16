package db.tool.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "posting_date")
public class PostingDate {
    @Id
    @Column(name = "POSTING_AREA")
    private String postingArea;

    @Column(name = "POSTING_DATE")
    private Date postingDate;

    @Column(name = "LAST_POSTING_DATE")
    private Date lastPostingDate;

    @Column(name = "EOD_DATE")
    private Date eodDate;

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
     * @return POSTING_DATE
     */
    public Date getPostingDate() {
        return postingDate;
    }

    /**
     * @param postingDate
     */
    public void setPostingDate(Date postingDate) {
        this.postingDate = postingDate;
    }

    /**
     * @return LAST_POSTING_DATE
     */
    public Date getLastPostingDate() {
        return lastPostingDate;
    }

    /**
     * @param lastPostingDate
     */
    public void setLastPostingDate(Date lastPostingDate) {
        this.lastPostingDate = lastPostingDate;
    }

    /**
     * @return EOD_DATE
     */
    public Date getEodDate() {
        return eodDate;
    }

    /**
     * @param eodDate
     */
    public void setEodDate(Date eodDate) {
        this.eodDate = eodDate;
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