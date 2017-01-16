package db.tool.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "druid_datasource")
public class DruidDatasource {
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

    @Column(name = "dbType")
    private String dbtype;

    @Column(name = "driverClassName")
    private String driverclassname;

    @Column(name = "activeCount")
    private Integer activecount;

    @Column(name = "activePeak")
    private Integer activepeak;

    @Column(name = "activePeakTime")
    private Long activepeaktime;

    @Column(name = "poolingCount")
    private Integer poolingcount;

    @Column(name = "poolingPeak")
    private Integer poolingpeak;

    @Column(name = "poolingPeakTime")
    private Long poolingpeaktime;

    @Column(name = "connectCount")
    private Long connectcount;

    @Column(name = "closeCount")
    private Long closecount;

    @Column(name = "waitThreadCount")
    private Long waitthreadcount;

    @Column(name = "notEmptyWaitCount")
    private Long notemptywaitcount;

    @Column(name = "notEmptyWaitNanos")
    private Long notemptywaitnanos;

    @Column(name = "logicConnectErrorCount")
    private Long logicconnecterrorcount;

    @Column(name = "physicalConnectCount")
    private Long physicalconnectcount;

    @Column(name = "physicalCloseCount")
    private Long physicalclosecount;

    @Column(name = "physicalConnectErrorCount")
    private Long physicalconnecterrorcount;

    @Column(name = "executeCount")
    private Long executecount;

    @Column(name = "errorCount")
    private Long errorcount;

    @Column(name = "commitCount")
    private Long commitcount;

    @Column(name = "rollbackCount")
    private Long rollbackcount;

    @Column(name = "pstmtCacheHitCount")
    private Long pstmtcachehitcount;

    @Column(name = "pstmtCacheMissCount")
    private Long pstmtcachemisscount;

    @Column(name = "startTransactionCount")
    private Long starttransactioncount;

    @Column(name = "txn_0_1")
    private Long txn01;

    @Column(name = "txn_1_10")
    private Long txn110;

    @Column(name = "txn_10_100")
    private Long txn10100;

    @Column(name = "txn_100_1000")
    private Long txn1001000;

    @Column(name = "txn_1000_10000")
    private Long txn100010000;

    @Column(name = "txn_10000_100000")
    private Long txn10000100000;

    @Column(name = "txn_more")
    private Long txnMore;

    @Column(name = "clobOpenCount")
    private Long clobopencount;

    @Column(name = "blobOpenCount")
    private Long blobopencount;

    @Column(name = "sqlSkipCount")
    private Long sqlskipcount;

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
     * @return dbType
     */
    public String getDbtype() {
        return dbtype;
    }

    /**
     * @param dbtype
     */
    public void setDbtype(String dbtype) {
        this.dbtype = dbtype == null ? null : dbtype.trim();
    }

    /**
     * @return driverClassName
     */
    public String getDriverclassname() {
        return driverclassname;
    }

    /**
     * @param driverclassname
     */
    public void setDriverclassname(String driverclassname) {
        this.driverclassname = driverclassname == null ? null : driverclassname.trim();
    }

    /**
     * @return activeCount
     */
    public Integer getActivecount() {
        return activecount;
    }

    /**
     * @param activecount
     */
    public void setActivecount(Integer activecount) {
        this.activecount = activecount;
    }

    /**
     * @return activePeak
     */
    public Integer getActivepeak() {
        return activepeak;
    }

    /**
     * @param activepeak
     */
    public void setActivepeak(Integer activepeak) {
        this.activepeak = activepeak;
    }

    /**
     * @return activePeakTime
     */
    public Long getActivepeaktime() {
        return activepeaktime;
    }

    /**
     * @param activepeaktime
     */
    public void setActivepeaktime(Long activepeaktime) {
        this.activepeaktime = activepeaktime;
    }

    /**
     * @return poolingCount
     */
    public Integer getPoolingcount() {
        return poolingcount;
    }

    /**
     * @param poolingcount
     */
    public void setPoolingcount(Integer poolingcount) {
        this.poolingcount = poolingcount;
    }

    /**
     * @return poolingPeak
     */
    public Integer getPoolingpeak() {
        return poolingpeak;
    }

    /**
     * @param poolingpeak
     */
    public void setPoolingpeak(Integer poolingpeak) {
        this.poolingpeak = poolingpeak;
    }

    /**
     * @return poolingPeakTime
     */
    public Long getPoolingpeaktime() {
        return poolingpeaktime;
    }

    /**
     * @param poolingpeaktime
     */
    public void setPoolingpeaktime(Long poolingpeaktime) {
        this.poolingpeaktime = poolingpeaktime;
    }

    /**
     * @return connectCount
     */
    public Long getConnectcount() {
        return connectcount;
    }

    /**
     * @param connectcount
     */
    public void setConnectcount(Long connectcount) {
        this.connectcount = connectcount;
    }

    /**
     * @return closeCount
     */
    public Long getClosecount() {
        return closecount;
    }

    /**
     * @param closecount
     */
    public void setClosecount(Long closecount) {
        this.closecount = closecount;
    }

    /**
     * @return waitThreadCount
     */
    public Long getWaitthreadcount() {
        return waitthreadcount;
    }

    /**
     * @param waitthreadcount
     */
    public void setWaitthreadcount(Long waitthreadcount) {
        this.waitthreadcount = waitthreadcount;
    }

    /**
     * @return notEmptyWaitCount
     */
    public Long getNotemptywaitcount() {
        return notemptywaitcount;
    }

    /**
     * @param notemptywaitcount
     */
    public void setNotemptywaitcount(Long notemptywaitcount) {
        this.notemptywaitcount = notemptywaitcount;
    }

    /**
     * @return notEmptyWaitNanos
     */
    public Long getNotemptywaitnanos() {
        return notemptywaitnanos;
    }

    /**
     * @param notemptywaitnanos
     */
    public void setNotemptywaitnanos(Long notemptywaitnanos) {
        this.notemptywaitnanos = notemptywaitnanos;
    }

    /**
     * @return logicConnectErrorCount
     */
    public Long getLogicconnecterrorcount() {
        return logicconnecterrorcount;
    }

    /**
     * @param logicconnecterrorcount
     */
    public void setLogicconnecterrorcount(Long logicconnecterrorcount) {
        this.logicconnecterrorcount = logicconnecterrorcount;
    }

    /**
     * @return physicalConnectCount
     */
    public Long getPhysicalconnectcount() {
        return physicalconnectcount;
    }

    /**
     * @param physicalconnectcount
     */
    public void setPhysicalconnectcount(Long physicalconnectcount) {
        this.physicalconnectcount = physicalconnectcount;
    }

    /**
     * @return physicalCloseCount
     */
    public Long getPhysicalclosecount() {
        return physicalclosecount;
    }

    /**
     * @param physicalclosecount
     */
    public void setPhysicalclosecount(Long physicalclosecount) {
        this.physicalclosecount = physicalclosecount;
    }

    /**
     * @return physicalConnectErrorCount
     */
    public Long getPhysicalconnecterrorcount() {
        return physicalconnecterrorcount;
    }

    /**
     * @param physicalconnecterrorcount
     */
    public void setPhysicalconnecterrorcount(Long physicalconnecterrorcount) {
        this.physicalconnecterrorcount = physicalconnecterrorcount;
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
     * @return commitCount
     */
    public Long getCommitcount() {
        return commitcount;
    }

    /**
     * @param commitcount
     */
    public void setCommitcount(Long commitcount) {
        this.commitcount = commitcount;
    }

    /**
     * @return rollbackCount
     */
    public Long getRollbackcount() {
        return rollbackcount;
    }

    /**
     * @param rollbackcount
     */
    public void setRollbackcount(Long rollbackcount) {
        this.rollbackcount = rollbackcount;
    }

    /**
     * @return pstmtCacheHitCount
     */
    public Long getPstmtcachehitcount() {
        return pstmtcachehitcount;
    }

    /**
     * @param pstmtcachehitcount
     */
    public void setPstmtcachehitcount(Long pstmtcachehitcount) {
        this.pstmtcachehitcount = pstmtcachehitcount;
    }

    /**
     * @return pstmtCacheMissCount
     */
    public Long getPstmtcachemisscount() {
        return pstmtcachemisscount;
    }

    /**
     * @param pstmtcachemisscount
     */
    public void setPstmtcachemisscount(Long pstmtcachemisscount) {
        this.pstmtcachemisscount = pstmtcachemisscount;
    }

    /**
     * @return startTransactionCount
     */
    public Long getStarttransactioncount() {
        return starttransactioncount;
    }

    /**
     * @param starttransactioncount
     */
    public void setStarttransactioncount(Long starttransactioncount) {
        this.starttransactioncount = starttransactioncount;
    }

    /**
     * @return txn_0_1
     */
    public Long getTxn01() {
        return txn01;
    }

    /**
     * @param txn01
     */
    public void setTxn01(Long txn01) {
        this.txn01 = txn01;
    }

    /**
     * @return txn_1_10
     */
    public Long getTxn110() {
        return txn110;
    }

    /**
     * @param txn110
     */
    public void setTxn110(Long txn110) {
        this.txn110 = txn110;
    }

    /**
     * @return txn_10_100
     */
    public Long getTxn10100() {
        return txn10100;
    }

    /**
     * @param txn10100
     */
    public void setTxn10100(Long txn10100) {
        this.txn10100 = txn10100;
    }

    /**
     * @return txn_100_1000
     */
    public Long getTxn1001000() {
        return txn1001000;
    }

    /**
     * @param txn1001000
     */
    public void setTxn1001000(Long txn1001000) {
        this.txn1001000 = txn1001000;
    }

    /**
     * @return txn_1000_10000
     */
    public Long getTxn100010000() {
        return txn100010000;
    }

    /**
     * @param txn100010000
     */
    public void setTxn100010000(Long txn100010000) {
        this.txn100010000 = txn100010000;
    }

    /**
     * @return txn_10000_100000
     */
    public Long getTxn10000100000() {
        return txn10000100000;
    }

    /**
     * @param txn10000100000
     */
    public void setTxn10000100000(Long txn10000100000) {
        this.txn10000100000 = txn10000100000;
    }

    /**
     * @return txn_more
     */
    public Long getTxnMore() {
        return txnMore;
    }

    /**
     * @param txnMore
     */
    public void setTxnMore(Long txnMore) {
        this.txnMore = txnMore;
    }

    /**
     * @return clobOpenCount
     */
    public Long getClobopencount() {
        return clobopencount;
    }

    /**
     * @param clobopencount
     */
    public void setClobopencount(Long clobopencount) {
        this.clobopencount = clobopencount;
    }

    /**
     * @return blobOpenCount
     */
    public Long getBlobopencount() {
        return blobopencount;
    }

    /**
     * @param blobopencount
     */
    public void setBlobopencount(Long blobopencount) {
        this.blobopencount = blobopencount;
    }

    /**
     * @return sqlSkipCount
     */
    public Long getSqlskipcount() {
        return sqlskipcount;
    }

    /**
     * @param sqlskipcount
     */
    public void setSqlskipcount(Long sqlskipcount) {
        this.sqlskipcount = sqlskipcount;
    }
}