package db.tool.model;

import javax.persistence.*;

@Table(name = "default_trans_typeset")
public class DefaultTransTypeset {
    @Id
    @Column(name = "CR_TRANS_TYPE")
    private String crTransType;

    @Id
    @Column(name = "OFFESET_TT")
    private String offesetTt;

    @Column(name = "CODE")
    private String code;

    /**
     * @return CR_TRANS_TYPE
     */
    public String getCrTransType() {
        return crTransType;
    }

    /**
     * @param crTransType
     */
    public void setCrTransType(String crTransType) {
        this.crTransType = crTransType == null ? null : crTransType.trim();
    }

    /**
     * @return OFFESET_TT
     */
    public String getOffesetTt() {
        return offesetTt;
    }

    /**
     * @param offesetTt
     */
    public void setOffesetTt(String offesetTt) {
        this.offesetTt = offesetTt == null ? null : offesetTt.trim();
    }

    /**
     * @return CODE
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }
}