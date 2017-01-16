package db.tool.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "druid_wall")
public class DruidWall {
    @Id
    private Long id;

    private String domain;

    private String app;

    private String cluster;

    private String host;

    private Integer pid;

    @Column(name = "collectTime")
    private Date collecttime;

    private String name;

    @Column(name = "checkCount")
    private Long checkcount;

    @Column(name = "hardCheckCount")
    private Long hardcheckcount;

    @Column(name = "violationCount")
    private Long violationcount;

    @Column(name = "whiteListHitCount")
    private Long whitelisthitcount;

    @Column(name = "blackListHitCount")
    private Long blacklisthitcount;

    @Column(name = "syntaxErrorCount")
    private Long syntaxerrorcount;

    @Column(name = "violationEffectRowCount")
    private Long violationeffectrowcount;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    /**
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain == null ? null : domain.trim();
    }

    /**
     * @return app
     */
    public String getApp() {
        return app;
    }

    /**
     * @param app
     */
    public void setApp(String app) {
        this.app = app == null ? null : app.trim();
    }

    /**
     * @return cluster
     */
    public String getCluster() {
        return cluster;
    }

    /**
     * @param cluster
     */
    public void setCluster(String cluster) {
        this.cluster = cluster == null ? null : cluster.trim();
    }

    /**
     * @return host
     */
    public String getHost() {
        return host;
    }

    /**
     * @param host
     */
    public void setHost(String host) {
        this.host = host == null ? null : host.trim();
    }

    /**
     * @return pid
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * @param pid
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * @return collectTime
     */
    public Date getCollecttime() {
        return collecttime;
    }

    /**
     * @param collecttime
     */
    public void setCollecttime(Date collecttime) {
        this.collecttime = collecttime;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return checkCount
     */
    public Long getCheckcount() {
        return checkcount;
    }

    /**
     * @param checkcount
     */
    public void setCheckcount(Long checkcount) {
        this.checkcount = checkcount;
    }

    /**
     * @return hardCheckCount
     */
    public Long getHardcheckcount() {
        return hardcheckcount;
    }

    /**
     * @param hardcheckcount
     */
    public void setHardcheckcount(Long hardcheckcount) {
        this.hardcheckcount = hardcheckcount;
    }

    /**
     * @return violationCount
     */
    public Long getViolationcount() {
        return violationcount;
    }

    /**
     * @param violationcount
     */
    public void setViolationcount(Long violationcount) {
        this.violationcount = violationcount;
    }

    /**
     * @return whiteListHitCount
     */
    public Long getWhitelisthitcount() {
        return whitelisthitcount;
    }

    /**
     * @param whitelisthitcount
     */
    public void setWhitelisthitcount(Long whitelisthitcount) {
        this.whitelisthitcount = whitelisthitcount;
    }

    /**
     * @return blackListHitCount
     */
    public Long getBlacklisthitcount() {
        return blacklisthitcount;
    }

    /**
     * @param blacklisthitcount
     */
    public void setBlacklisthitcount(Long blacklisthitcount) {
        this.blacklisthitcount = blacklisthitcount;
    }

    /**
     * @return syntaxErrorCount
     */
    public Long getSyntaxerrorcount() {
        return syntaxerrorcount;
    }

    /**
     * @param syntaxerrorcount
     */
    public void setSyntaxerrorcount(Long syntaxerrorcount) {
        this.syntaxerrorcount = syntaxerrorcount;
    }

    /**
     * @return violationEffectRowCount
     */
    public Long getViolationeffectrowcount() {
        return violationeffectrowcount;
    }

    /**
     * @param violationeffectrowcount
     */
    public void setViolationeffectrowcount(Long violationeffectrowcount) {
        this.violationeffectrowcount = violationeffectrowcount;
    }
}