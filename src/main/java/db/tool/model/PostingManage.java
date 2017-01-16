package db.tool.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "posting_manage")
public class PostingManage {
    @Id
    @Column(name = "POSTING_AREA")
    private String postingArea;

    @Column(name = "VALID_FROM_DATE")
    private Date validFromDate;

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
}