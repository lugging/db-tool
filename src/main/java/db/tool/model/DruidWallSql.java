package db.tool.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "druid_wall_sql")
public class DruidWallSql {
    @Id
    private Long id;

    private String domain;

    private String app;

    private String cluster;

    private String host;

    private Integer pid;

    @Column(name = "collectTime")
    private Date collecttime;

    @Column(name = "sqlHash")
    private Long sqlhash;

    @Column(name = "sqlSHash")
    private Long sqlshash;

    @Column(name = "sqlSampleHash")
    private Long sqlsamplehash;

    @Column(name = "executeCount")
    private Long executecount;

    @Column(name = "fetchRowCount")
    private Long fetchrowcount;

    @Column(name = "updateCount")
    private Long updatecount;

    @Column(name = "syntaxError")
    private Integer syntaxerror;

    @Column(name = "violationMessage")
    private String violationmessage;

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
     * @return sqlHash
     */
    public Long getSqlhash() {
        return sqlhash;
    }

    /**
     * @param sqlhash
     */
    public void setSqlhash(Long sqlhash) {
        this.sqlhash = sqlhash;
    }

    /**
     * @return sqlSHash
     */
    public Long getSqlshash() {
        return sqlshash;
    }

    /**
     * @param sqlshash
     */
    public void setSqlshash(Long sqlshash) {
        this.sqlshash = sqlshash;
    }

    /**
     * @return sqlSampleHash
     */
    public Long getSqlsamplehash() {
        return sqlsamplehash;
    }

    /**
     * @param sqlsamplehash
     */
    public void setSqlsamplehash(Long sqlsamplehash) {
        this.sqlsamplehash = sqlsamplehash;
    }

    /**
     * @return executeCount
     */
    public Long getExecutecount() {
        return executecount;
    }

    /**
     * @param executecount
     */
    public void setExecutecount(Long executecount) {
        this.executecount = executecount;
    }

    /**
     * @return fetchRowCount
     */
    public Long getFetchrowcount() {
        return fetchrowcount;
    }

    /**
     * @param fetchrowcount
     */
    public void setFetchrowcount(Long fetchrowcount) {
        this.fetchrowcount = fetchrowcount;
    }

    /**
     * @return updateCount
     */
    public Long getUpdatecount() {
        return updatecount;
    }

    /**
     * @param updatecount
     */
    public void setUpdatecount(Long updatecount) {
        this.updatecount = updatecount;
    }

    /**
     * @return syntaxError
     */
    public Integer getSyntaxerror() {
        return syntaxerror;
    }

    /**
     * @param syntaxerror
     */
    public void setSyntaxerror(Integer syntaxerror) {
        this.syntaxerror = syntaxerror;
    }

    /**
     * @return violationMessage
     */
    public String getViolationmessage() {
        return violationmessage;
    }

    /**
     * @param violationmessage
     */
    public void setViolationmessage(String violationmessage) {
        this.violationmessage = violationmessage == null ? null : violationmessage.trim();
    }
}