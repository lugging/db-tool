package db.tool.model;

import javax.persistence.*;

public class Channel {
    @Id
    @Column(name = "MEDIUM")
    private String medium;

    @Column(name = "STATE")
    private String state;

    /**
     * @return MEDIUM
     */
    public String getMedium() {
        return medium;
    }

    /**
     * @param medium
     */
    public void setMedium(String medium) {
        this.medium = medium == null ? null : medium.trim();
    }

    /**
     * @return STATE
     */
    public String getState() {
        return state;
    }

    /**
     * @param state
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}