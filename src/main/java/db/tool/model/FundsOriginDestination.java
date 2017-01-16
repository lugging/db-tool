package db.tool.model;

import javax.persistence.*;

@Table(name = "funds_origin_destination")
public class FundsOriginDestination {
    @Id
    @Column(name = "TRANS_TYPE")
    private String transType;

    /**
     * @return TRANS_TYPE
     */
    public String getTransType() {
        return transType;
    }

    /**
     * @param transType
     */
    public void setTransType(String transType) {
        this.transType = transType == null ? null : transType.trim();
    }
}