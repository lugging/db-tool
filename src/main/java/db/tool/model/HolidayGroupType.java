package db.tool.model;

import javax.persistence.*;

@Table(name = "holiday_group_type")
public class HolidayGroupType {
    @Id
    @Column(name = "HOLIDAY_GROUP_TYPE")
    private String holidayGroupType;

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
}