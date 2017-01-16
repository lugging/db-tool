package db.tool.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "druid_springmethod")
public class DruidSpringmethod {
    @Id
    private Long id;

    private String domain;

    private String app;

    private String cluster;

    private String host;

    private Integer pid;

    @Column(name = "collectTime")
    private Date collecttime;

    @Column(name = "className")
    private String classname;

    private String signature;

    @Column(name = "runningCount")
    private Integer runningcount;

    @Column(name = "concurrentMax")
    private Integer concurrentmax;

    @Column(name = "executeCount")
    private Long executecount;

    @Column(name = "executeErrorCount")
    private Long executeerrorcount;

    @Column(name = "executeTimeNano")
    private Long executetimenano;

    @Column(name = "jdbcFetchRowCount")
    private Long jdbcfetchrowcount;

    @Column(name = "jdbcUpdateCount")
    private Long jdbcupdatecount;

    @Column(name = "jdbcExecuteCount")
    private Long jdbcexecutecount;

    @Column(name = "jdbcExecuteErrorCount")
    private Long jdbcexecuteerrorcount;

    @Column(name = "jdbcExecuteTimeNano")
    private Long jdbcexecutetimenano;

    @Column(name = "jdbcCommitCount")
    private Long jdbccommitcount;

    @Column(name = "jdbcRollbackCount")
    private Long jdbcrollbackcount;

    @Column(name = "jdbcPoolConnectionOpenCount")
    private Long jdbcpoolconnectionopencount;

    @Column(name = "jdbcPoolConnectionCloseCount")
    private Long jdbcpoolconnectionclosecount;

    @Column(name = "jdbcResultSetOpenCount")
    private Long jdbcresultsetopencount;

    @Column(name = "jdbcResultSetCloseCount")
    private Long jdbcresultsetclosecount;

    @Column(name = "lastErrorClass")
    private String lasterrorclass;

    @Column(name = "lastErrorMessage")
    private String lasterrormessage;

    @Column(name = "lastErrorStackTrace")
    private String lasterrorstacktrace;

    @Column(name = "lastErrorTimeMillis")
    private Long lasterrortimemillis;

    private Long h1;

    private Long h10;

    private Long h100;

    private Long h1000;

    private Integer h10000;

    private Integer h100000;

    private Integer h1000000;

    private Integer hmore;

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
     * @return className
     */
    public String getClassname() {
        return classname;
    }

    /**
     * @param classname
     */
    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    /**
     * @return signature
     */
    public String getSignature() {
        return signature;
    }

    /**
     * @param signature
     */
    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }

    /**
     * @return runningCount
     */
    public Integer getRunningcount() {
        return runningcount;
    }

    /**
     * @param runningcount
     */
    public void setRunningcount(Integer runningcount) {
        this.runningcount = runningcount;
    }

    /**
     * @return concurrentMax
     */
    public Integer getConcurrentmax() {
        return concurrentmax;
    }

    /**
     * @param concurrentmax
     */
    public void setConcurrentmax(Integer concurrentmax) {
        this.concurrentmax = concurrentmax;
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
     * @return executeErrorCount
     */
    public Long getExecuteerrorcount() {
        return executeerrorcount;
    }

    /**
     * @param executeerrorcount
     */
    public void setExecuteerrorcount(Long executeerrorcount) {
        this.executeerrorcount = executeerrorcount;
    }

    /**
     * @return executeTimeNano
     */
    public Long getExecutetimenano() {
        return executetimenano;
    }

    /**
     * @param executetimenano
     */
    public void setExecutetimenano(Long executetimenano) {
        this.executetimenano = executetimenano;
    }

    /**
     * @return jdbcFetchRowCount
     */
    public Long getJdbcfetchrowcount() {
        return jdbcfetchrowcount;
    }

    /**
     * @param jdbcfetchrowcount
     */
    public void setJdbcfetchrowcount(Long jdbcfetchrowcount) {
        this.jdbcfetchrowcount = jdbcfetchrowcount;
    }

    /**
     * @return jdbcUpdateCount
     */
    public Long getJdbcupdatecount() {
        return jdbcupdatecount;
    }

    /**
     * @param jdbcupdatecount
     */
    public void setJdbcupdatecount(Long jdbcupdatecount) {
        this.jdbcupdatecount = jdbcupdatecount;
    }

    /**
     * @return jdbcExecuteCount
     */
    public Long getJdbcexecutecount() {
        return jdbcexecutecount;
    }

    /**
     * @param jdbcexecutecount
     */
    public void setJdbcexecutecount(Long jdbcexecutecount) {
        this.jdbcexecutecount = jdbcexecutecount;
    }

    /**
     * @return jdbcExecuteErrorCount
     */
    public Long getJdbcexecuteerrorcount() {
        return jdbcexecuteerrorcount;
    }

    /**
     * @param jdbcexecuteerrorcount
     */
    public void setJdbcexecuteerrorcount(Long jdbcexecuteerrorcount) {
        this.jdbcexecuteerrorcount = jdbcexecuteerrorcount;
    }

    /**
     * @return jdbcExecuteTimeNano
     */
    public Long getJdbcexecutetimenano() {
        return jdbcexecutetimenano;
    }

    /**
     * @param jdbcexecutetimenano
     */
    public void setJdbcexecutetimenano(Long jdbcexecutetimenano) {
        this.jdbcexecutetimenano = jdbcexecutetimenano;
    }

    /**
     * @return jdbcCommitCount
     */
    public Long getJdbccommitcount() {
        return jdbccommitcount;
    }

    /**
     * @param jdbccommitcount
     */
    public void setJdbccommitcount(Long jdbccommitcount) {
        this.jdbccommitcount = jdbccommitcount;
    }

    /**
     * @return jdbcRollbackCount
     */
    public Long getJdbcrollbackcount() {
        return jdbcrollbackcount;
    }

    /**
     * @param jdbcrollbackcount
     */
    public void setJdbcrollbackcount(Long jdbcrollbackcount) {
        this.jdbcrollbackcount = jdbcrollbackcount;
    }

    /**
     * @return jdbcPoolConnectionOpenCount
     */
    public Long getJdbcpoolconnectionopencount() {
        return jdbcpoolconnectionopencount;
    }

    /**
     * @param jdbcpoolconnectionopencount
     */
    public void setJdbcpoolconnectionopencount(Long jdbcpoolconnectionopencount) {
        this.jdbcpoolconnectionopencount = jdbcpoolconnectionopencount;
    }

    /**
     * @return jdbcPoolConnectionCloseCount
     */
    public Long getJdbcpoolconnectionclosecount() {
        return jdbcpoolconnectionclosecount;
    }

    /**
     * @param jdbcpoolconnectionclosecount
     */
    public void setJdbcpoolconnectionclosecount(Long jdbcpoolconnectionclosecount) {
        this.jdbcpoolconnectionclosecount = jdbcpoolconnectionclosecount;
    }

    /**
     * @return jdbcResultSetOpenCount
     */
    public Long getJdbcresultsetopencount() {
        return jdbcresultsetopencount;
    }

    /**
     * @param jdbcresultsetopencount
     */
    public void setJdbcresultsetopencount(Long jdbcresultsetopencount) {
        this.jdbcresultsetopencount = jdbcresultsetopencount;
    }

    /**
     * @return jdbcResultSetCloseCount
     */
    public Long getJdbcresultsetclosecount() {
        return jdbcresultsetclosecount;
    }

    /**
     * @param jdbcresultsetclosecount
     */
    public void setJdbcresultsetclosecount(Long jdbcresultsetclosecount) {
        this.jdbcresultsetclosecount = jdbcresultsetclosecount;
    }

    /**
     * @return lastErrorClass
     */
    public String getLasterrorclass() {
        return lasterrorclass;
    }

    /**
     * @param lasterrorclass
     */
    public void setLasterrorclass(String lasterrorclass) {
        this.lasterrorclass = lasterrorclass == null ? null : lasterrorclass.trim();
    }

    /**
     * @return lastErrorMessage
     */
    public String getLasterrormessage() {
        return lasterrormessage;
    }

    /**
     * @param lasterrormessage
     */
    public void setLasterrormessage(String lasterrormessage) {
        this.lasterrormessage = lasterrormessage == null ? null : lasterrormessage.trim();
    }

    /**
     * @return lastErrorStackTrace
     */
    public String getLasterrorstacktrace() {
        return lasterrorstacktrace;
    }

    /**
     * @param lasterrorstacktrace
     */
    public void setLasterrorstacktrace(String lasterrorstacktrace) {
        this.lasterrorstacktrace = lasterrorstacktrace == null ? null : lasterrorstacktrace.trim();
    }

    /**
     * @return lastErrorTimeMillis
     */
    public Long getLasterrortimemillis() {
        return lasterrortimemillis;
    }

    /**
     * @param lasterrortimemillis
     */
    public void setLasterrortimemillis(Long lasterrortimemillis) {
        this.lasterrortimemillis = lasterrortimemillis;
    }

    /**
     * @return h1
     */
    public Long getH1() {
        return h1;
    }

    /**
     * @param h1
     */
    public void setH1(Long h1) {
        this.h1 = h1;
    }

    /**
     * @return h10
     */
    public Long getH10() {
        return h10;
    }

    /**
     * @param h10
     */
    public void setH10(Long h10) {
        this.h10 = h10;
    }

    /**
     * @return h100
     */
    public Long getH100() {
        return h100;
    }

    /**
     * @param h100
     */
    public void setH100(Long h100) {
        this.h100 = h100;
    }

    /**
     * @return h1000
     */
    public Long getH1000() {
        return h1000;
    }

    /**
     * @param h1000
     */
    public void setH1000(Long h1000) {
        this.h1000 = h1000;
    }

    /**
     * @return h10000
     */
    public Integer getH10000() {
        return h10000;
    }

    /**
     * @param h10000
     */
    public void setH10000(Integer h10000) {
        this.h10000 = h10000;
    }

    /**
     * @return h100000
     */
    public Integer getH100000() {
        return h100000;
    }

    /**
     * @param h100000
     */
    public void setH100000(Integer h100000) {
        this.h100000 = h100000;
    }

    /**
     * @return h1000000
     */
    public Integer getH1000000() {
        return h1000000;
    }

    /**
     * @param h1000000
     */
    public void setH1000000(Integer h1000000) {
        this.h1000000 = h1000000;
    }

    /**
     * @return hmore
     */
    public Integer getHmore() {
        return hmore;
    }

    /**
     * @param hmore
     */
    public void setHmore(Integer hmore) {
        this.hmore = hmore;
    }
}