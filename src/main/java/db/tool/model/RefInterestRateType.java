package db.tool.model;

import javax.persistence.*;

@Table(name = "ref_interest_rate_type")
public class RefInterestRateType {
    @Id
    @Column(name = "REFINTEREST_RATE_TYPE")
    private String refinterestRateType;

    @Column(name = "DESCRIPTION")
    private String description;

    /**
     * @return REFINTEREST_RATE_TYPE
     */
    public String getRefinterestRateType() {
        return refinterestRateType;
    }

    /**
     * @param refinterestRateType
     */
    public void setRefinterestRateType(String refinterestRateType) {
        this.refinterestRateType = refinterestRateType == null ? null : refinterestRateType.trim();
    }

    /**
     * @return DESCRIPTION
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}