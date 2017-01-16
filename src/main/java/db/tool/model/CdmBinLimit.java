package db.tool.model;

import javax.persistence.*;

@Table(name = "cdm_bin_limit")
public class CdmBinLimit {
    @Id
    @Column(name = "BIN")
    private String bin;

    @Column(name = "LIMIT_NO")
    private Integer limitNo;

    @Column(name = "CUST_01")
    private String cust01;

    @Column(name = "CUST_02")
    private String cust02;

    /**
     * @return BIN
     */
    public String getBin() {
        return bin;
    }

    /**
     * @param bin
     */
    public void setBin(String bin) {
        this.bin = bin == null ? null : bin.trim();
    }

    /**
     * @return LIMIT_NO
     */
    public Integer getLimitNo() {
        return limitNo;
    }

    /**
     * @param limitNo
     */
    public void setLimitNo(Integer limitNo) {
        this.limitNo = limitNo;
    }

    /**
     * @return CUST_01
     */
    public String getCust01() {
        return cust01;
    }

    /**
     * @param cust01
     */
    public void setCust01(String cust01) {
        this.cust01 = cust01 == null ? null : cust01.trim();
    }

    /**
     * @return CUST_02
     */
    public String getCust02() {
        return cust02;
    }

    /**
     * @param cust02
     */
    public void setCust02(String cust02) {
        this.cust02 = cust02 == null ? null : cust02.trim();
    }
}