package db.tool.model;

import javax.persistence.*;

@Table(name = "holiday_group_type_relation")
public class HolidayGroupTypeRelation {
    @Id
    @Column(name = "HOLIDAY_GROUP_TYPE")
    private String holidayGroupType;

    @Id
    @Column(name = "HOLIDAY_TYPE")
    private String holidayType;

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
}