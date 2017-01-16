package db.tool.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "bank_calendar_manager")
public class BankCalendarManager {
    @Id
    @Column(name = "CALENDAR")
    private String calendar;

    @Column(name = "VALID_FROM_DATE")
    private Date validFromDate;

    @Column(name = "VALID_TO_DATE")
    private Date validToDate;

    @Column(name = "HOLIDAY_GROUP_TYPE")
    private String holidayGroupType;

    @Column(name = "MONDAY")
    private String monday;

    @Column(name = "TUESDAY")
    private String tuesday;

    @Column(name = "WEDNESDAY")
    private String wednesday;

    @Column(name = "THURSDAY")
    private String thursday;

    @Column(name = "FRIDAY")
    private String friday;

    @Column(name = "SATURDAY")
    private String saturday;

    @Column(name = "SUNDAY")
    private String sunday;

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
     * @return HOLIDAY_GROUP_TYPE
     */
    public String getHolidayGroupType() {
        return holidayGroupType;
    }

    /**
     * @param holidayGroupType
     */
    public void setHolidayGroupType(String holidayGroupType) {
        this.holidayGroupType = holidayGroupType == null ? null : holidayGroupType.trim();
    }

    /**
     * @return MONDAY
     */
    public String getMonday() {
        return monday;
    }

    /**
     * @param monday
     */
    public void setMonday(String monday) {
        this.monday = monday == null ? null : monday.trim();
    }

    /**
     * @return TUESDAY
     */
    public String getTuesday() {
        return tuesday;
    }

    /**
     * @param tuesday
     */
    public void setTuesday(String tuesday) {
        this.tuesday = tuesday == null ? null : tuesday.trim();
    }

    /**
     * @return WEDNESDAY
     */
    public String getWednesday() {
        return wednesday;
    }

    /**
     * @param wednesday
     */
    public void setWednesday(String wednesday) {
        this.wednesday = wednesday == null ? null : wednesday.trim();
    }

    /**
     * @return THURSDAY
     */
    public String getThursday() {
        return thursday;
    }

    /**
     * @param thursday
     */
    public void setThursday(String thursday) {
        this.thursday = thursday == null ? null : thursday.trim();
    }

    /**
     * @return FRIDAY
     */
    public String getFriday() {
        return friday;
    }

    /**
     * @param friday
     */
    public void setFriday(String friday) {
        this.friday = friday == null ? null : friday.trim();
    }

    /**
     * @return SATURDAY
     */
    public String getSaturday() {
        return saturday;
    }

    /**
     * @param saturday
     */
    public void setSaturday(String saturday) {
        this.saturday = saturday == null ? null : saturday.trim();
    }

    /**
     * @return SUNDAY
     */
    public String getSunday() {
        return sunday;
    }

    /**
     * @param sunday
     */
    public void setSunday(String sunday) {
        this.sunday = sunday == null ? null : sunday.trim();
    }
}