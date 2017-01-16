package db.tool.model;

import javax.persistence.*;

@Table(name = "org_cal_postarea_rela")
public class OrgCalPostareaRela {
    @Id
    @Column(name = "ORGANIZATION")
    private String organization;

    @Column(name = "CALENDAR")
    private String calendar;

    @Column(name = "POSTING_AREA")
    private String postingArea;

    @Column(name = "BANK_KEY")
    private String bankKey;

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
     * @return CALENDAR
     */
    public String getCalendar() {
        return calendar;
    }

    /**
     * @param calendar
     */
    public void setCalendar(String calendar) {
        this.calendar = calendar == null ? null : calendar.trim();
    }

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
}