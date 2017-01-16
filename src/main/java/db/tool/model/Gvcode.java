package db.tool.model;

import javax.persistence.*;

public class Gvcode {
    @Id
    @Column(name = "GVCODE")
    private String gvcode;

    /**
     * @return GVCODE
     */
    public String getGvcode() {
        return gvcode;
    }

    /**
     * @param gvcode
     */
    public void setGvcode(String gvcode) {
        this.gvcode = gvcode == null ? null : gvcode.trim();
    }
}