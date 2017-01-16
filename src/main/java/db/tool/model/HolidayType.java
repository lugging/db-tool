package db.tool.model;

import javax.persistence.*;

@Table(name = "holiday_type")
public class HolidayType {
    @Id
    @Column(name = "HOLIDAY_TYPE")
    private String holidayType;

    @Column(name = "MONTH")
    private String month;

    @Column(name = "DAY")
    private String day;

    @Column(name = "STATUS")
    private String status;

    /**
     * @return HOLIDAY_TYPE
     */
    public String getHolidayType() {
        return holidayType;
    }

    /**
     * @param holidayType
     */
    public void setHolidayType(String holidayType) {
        this.holidayType = holidayType == null ? null : holidayType.trim();
    }

    /**
     * @return MONTH
     */
    public String getMonth() {
        return month;
    }

    /**
     * @param month
     */
    public void setMonth(String month) {
        this.month = month == null ? null : month.trim();
    }

    /**
     * @return DAY
     */
    public String getDay() {
        return day;
    }

    /**
     * @param day
     */
    public void setDay(String day) {
        this.day = day == null ? null : day.trim();
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