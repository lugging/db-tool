package db.tool.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "bank_calendar_rules")
public class BankCalendarRules {
    @Id
    @Column(name = "RULES_ID")
    private String rulesId;

    @Column(name = "CALENDAR")
    private String calendar;

    @Column(name = "VALID_FROM_DATE")
    private Date validFromDate;

    @Column(name = "VALID_TO_DATE")
    private Date validToDate;

    @Column(name = "WORKDAY")
    private String workday;

    /**
     * @return RULES_ID
     */
    public String getRulesId() {
        return rulesId;
    }

    /**
     * @param rulesId
     */
    public void setRulesId(String rulesId) {
        this.rulesId = rulesId == null ? null : rulesId.trim();
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
     * @return VALID_TO_DATE
     */
    public Date getValidToDate() {
        return validToDate;
    }

    /**
     * @param validToDate
     */
    public void setValidToDate(Date validToDate) {
        this.validToDate = validToDate;
    }

    /**
     * @return WORKDAY
     */
    public String getWorkday() {
        return workday;
    }

    /**
     * @param workday
     */
    public void setWorkday(String workday) {
        this.workday = workday == null ? null : workday.trim();
    }
}