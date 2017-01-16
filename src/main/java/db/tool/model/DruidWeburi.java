package db.tool.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "druid_weburi")
public class DruidWeburi {
    @Id
    private Long id;

    private String domain;

    private String app;

    private String cluster;

    private String host;

    private Integer pid;

    @Column(name = "collectTime")
    private Date collecttime;

    private String uri;

    @Column(name = "runningCount")
    private Integer runningcount;

    @Column(name = "concurrentMax")
    private Integer concurrentmax;

    @Column(name = "requestCount")
    private Long requestcount;

    @Column(name = "requestTimeNano")
    private Long requesttimenano;

    @Column(name = "jdbcFetchRowCount")
    private Long jdbcfetchrowcount;

    @Column(name = "jdbcFetchRowPeak")
    private Long jdbcfetchrowpeak;

    @Column(name = "jdbcUpdateCount")
    private Long jdbcupdatecount;

    @Column(name = "jdbcUpdatePeak")
    private Long jdbcupdatepeak;

    @Column(name = "jdbcExecuteCount")
    private Long jdbcexecutecount;

    @Column(name = "jdbcExecuteErrorCount")
    private Long jdbcexecuteerrorcount;

    @Column(name = "jdbcExecutePeak")
    private Long jdbcexecutepeak;

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

    @Column(name = "errorCount")
    private Long errorcount;

    @Column(name = "lastAccessTime")
    private Date lastaccesstime;

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
     * @return uri
     */
    public String getUri() {
        return uri;
    }

    /**
     * @param uri
     */
    public void setUri(String uri) {
        this.uri = uri == null ? null : uri.trim();
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
     * @return requestCount
     */
    public Long getRequestcount() {
        return requestcount;
    }

    /**
     * @param requestcount
     */
    public void setRequestcount(Long requestcount) {
        this.requestcount = requestcount;
    }

    /**
     * @return requestTimeNano
     */
    public Long getRequesttimenano() {
        return requesttimenano;
    }

    /**
     * @param requesttimenano
     */
    public void setRequesttimenano(Long requesttimenano) {
        this.requesttimenano = requesttimenano;
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
     * @return jdbcFetchRowPeak
     */
    public Long getJdbcfetchrowpeak() {
        return jdbcfetchrowpeak;
    }

    /**
     * @param jdbcfetchrowpeak
     */
    public void setJdbcfetchrowpeak(Long jdbcfetchrowpeak) {
        this.jdbcfetchrowpeak = jdbcfetchrowpeak;
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
     * @return jdbcUpdatePeak
     */
    public Long getJdbcupdatepeak() {
        return jdbcupdatepeak;
    }

    /**
     * @param jdbcupdatepeak
     */
    public void setJdbcupdatepeak(Long jdbcupdatepeak) {
        this.jdbcupdatepeak = jdbcupdatepeak;
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
     * @return jdbcExecutePeak
     */
    public Long getJdbcexecutepeak() {
        return jdbcexecutepeak;
    }

    /**
     * @param jdbcexecutepeak
     */
    public void setJdbcexecutepeak(Long jdbcexecutepeak) {
        this.jdbcexecutepeak = jdbcexecutepeak;
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
     * @return errorCount
     */
    public Long getErrorcount() {
        return errorcount;
    }

    /**
     * @param errorcount
     */
    public void setErrorcount(Long errorcount) {
        this.errorcount = errorcount;
    }

    /**
     * @return lastAccessTime
     */
    public Date getLastaccesstime() {
        return lastaccesstime;
    }

    /**
     * @param lastaccesstime
     */
    public void setLastaccesstime(Date lastaccesstime) {
        this.lastaccesstime = lastaccesstime;
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