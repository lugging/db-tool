package db.tool.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "druid_sql")
public class DruidSql {
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

    @Column(name = "dataSource")
    private String datasource;

    @Column(name = "lastStartTime")
    private Long laststarttime;

    @Column(name = "batchTotal")
    private Long batchtotal;

    @Column(name = "batchToMax")
    private Integer batchtomax;

    @Column(name = "execSuccessCount")
    private Long execsuccesscount;

    @Column(name = "execNanoTotal")
    private Long execnanototal;

    @Column(name = "execNanoMax")
    private Long execnanomax;

    private Integer running;

    @Column(name = "concurrentMax")
    private Integer concurrentmax;

    @Column(name = "rsHoldTime")
    private Long rsholdtime;

    @Column(name = "execRsHoldTime")
    private Long execrsholdtime;

    private String name;

    private String file;

    @Column(name = "dbType")
    private String dbtype;

    @Column(name = "execNanoMaxOccurTime")
    private Long execnanomaxoccurtime;

    @Column(name = "errorCount")
    private Long errorcount;

    @Column(name = "errorLastMsg")
    private String errorlastmsg;

    @Column(name = "errorLastClass")
    private String errorlastclass;

    @Column(name = "errorLastStackTrace")
    private String errorlaststacktrace;

    @Column(name = "errorLastTime")
    private Long errorlasttime;

    @Column(name = "updateCount")
    private Long updatecount;

    @Column(name = "updateCountMax")
    private Long updatecountmax;

    @Column(name = "fetchRowCount")
    private Long fetchrowcount;

    @Column(name = "fetchRowCountMax")
    private Long fetchrowcountmax;

    @Column(name = "inTxnCount")
    private Long intxncount;

    @Column(name = "lastSlowParameters")
    private String lastslowparameters;

    @Column(name = "clobOpenCount")
    private Long clobopencount;

    @Column(name = "blobOpenCount")
    private Long blobopencount;

    @Column(name = "readStringLength")
    private Long readstringlength;

    @Column(name = "readBytesLength")
    private Long readbyteslength;

    @Column(name = "inputStreamOpenCount")
    private Long inputstreamopencount;

    @Column(name = "readerOpenCount")
    private Long readeropencount;

    private Long h1;

    private Long h10;

    private Integer h100;

    private Integer h1000;

    private Integer h10000;

    private Integer h100000;

    private Integer h1000000;

    private Integer hmore;

    private Long eh1;

    private Long eh10;

    private Integer eh100;

    private Integer eh1000;

    private Integer eh10000;

    private Integer eh100000;

    private Integer eh1000000;

    private Integer ehmore;

    private Long f1;

    private Long f10;

    private Long f100;

    private Integer f1000;

    private Integer f10000;

    private Integer fmore;

    private Long u1;

    private Long u10;

    private Long u100;

    private Integer u1000;

    private Integer u10000;

    private Integer umore;

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
     * @return dataSource
     */
    public String getDatasource() {
        return datasource;
    }

    /**
     * @param datasource
     */
    public void setDatasource(String datasource) {
        this.datasource = datasource == null ? null : datasource.trim();
    }

    /**
     * @return lastStartTime
     */
    public Long getLaststarttime() {
        return laststarttime;
    }

    /**
     * @param laststarttime
     */
    public void setLaststarttime(Long laststarttime) {
        this.laststarttime = laststarttime;
    }

    /**
     * @return batchTotal
     */
    public Long getBatchtotal() {
        return batchtotal;
    }

    /**
     * @param batchtotal
     */
    public void setBatchtotal(Long batchtotal) {
        this.batchtotal = batchtotal;
    }

    /**
     * @return batchToMax
     */
    public Integer getBatchtomax() {
        return batchtomax;
    }

    /**
     * @param batchtomax
     */
    public void setBatchtomax(Integer batchtomax) {
        this.batchtomax = batchtomax;
    }

    /**
     * @return execSuccessCount
     */
    public Long getExecsuccesscount() {
        return execsuccesscount;
    }

    /**
     * @param execsuccesscount
     */
    public void setExecsuccesscount(Long execsuccesscount) {
        this.execsuccesscount = execsuccesscount;
    }

    /**
     * @return execNanoTotal
     */
    public Long getExecnanototal() {
        return execnanototal;
    }

    /**
     * @param execnanototal
     */
    public void setExecnanototal(Long execnanototal) {
        this.execnanototal = execnanototal;
    }

    /**
     * @return execNanoMax
     */
    public Long getExecnanomax() {
        return execnanomax;
    }

    /**
     * @param execnanomax
     */
    public void setExecnanomax(Long execnanomax) {
        this.execnanomax = execnanomax;
    }

    /**
     * @return running
     */
    public Integer getRunning() {
        return running;
    }

    /**
     * @param running
     */
    public void setRunning(Integer running) {
        this.running = running;
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
     * @return rsHoldTime
     */
    public Long getRsholdtime() {
        return rsholdtime;
    }

    /**
     * @param rsholdtime
     */
    public void setRsholdtime(Long rsholdtime) {
        this.rsholdtime = rsholdtime;
    }

    /**
     * @return execRsHoldTime
     */
    public Long getExecrsholdtime() {
        return execrsholdtime;
    }

    /**
     * @param execrsholdtime
     */
    public void setExecrsholdtime(Long execrsholdtime) {
        this.execrsholdtime = execrsholdtime;
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
     * @return file
     */
    public String getFile() {
        return file;
    }

    /**
     * @param file
     */
    public void setFile(String file) {
        this.file = file == null ? null : file.trim();
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
     * @return execNanoMaxOccurTime
     */
    public Long getExecnanomaxoccurtime() {
        return execnanomaxoccurtime;
    }

    /**
     * @param execnanomaxoccurtime
     */
    public void setExecnanomaxoccurtime(Long execnanomaxoccurtime) {
        this.execnanomaxoccurtime = execnanomaxoccurtime;
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
     * @return errorLastMsg
     */
    public String getErrorlastmsg() {
        return errorlastmsg;
    }

    /**
     * @param errorlastmsg
     */
    public void setErrorlastmsg(String errorlastmsg) {
        this.errorlastmsg = errorlastmsg == null ? null : errorlastmsg.trim();
    }

    /**
     * @return errorLastClass
     */
    public String getErrorlastclass() {
        return errorlastclass;
    }

    /**
     * @param errorlastclass
     */
    public void setErrorlastclass(String errorlastclass) {
        this.errorlastclass = errorlastclass == null ? null : errorlastclass.trim();
    }

    /**
     * @return errorLastStackTrace
     */
    public String getErrorlaststacktrace() {
        return errorlaststacktrace;
    }

    /**
     * @param errorlaststacktrace
     */
    public void setErrorlaststacktrace(String errorlaststacktrace) {
        this.errorlaststacktrace = errorlaststacktrace == null ? null : errorlaststacktrace.trim();
    }

    /**
     * @return errorLastTime
     */
    public Long getErrorlasttime() {
        return errorlasttime;
    }

    /**
     * @param errorlasttime
     */
    public void setErrorlasttime(Long errorlasttime) {
        this.errorlasttime = errorlasttime;
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
     * @return updateCountMax
     */
    public Long getUpdatecountmax() {
        return updatecountmax;
    }

    /**
     * @param updatecountmax
     */
    public void setUpdatecountmax(Long updatecountmax) {
        this.updatecountmax = updatecountmax;
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
     * @return fetchRowCountMax
     */
    public Long getFetchrowcountmax() {
        return fetchrowcountmax;
    }

    /**
     * @param fetchrowcountmax
     */
    public void setFetchrowcountmax(Long fetchrowcountmax) {
        this.fetchrowcountmax = fetchrowcountmax;
    }

    /**
     * @return inTxnCount
     */
    public Long getIntxncount() {
        return intxncount;
    }

    /**
     * @param intxncount
     */
    public void setIntxncount(Long intxncount) {
        this.intxncount = intxncount;
    }

    /**
     * @return lastSlowParameters
     */
    public String getLastslowparameters() {
        return lastslowparameters;
    }

    /**
     * @param lastslowparameters
     */
    public void setLastslowparameters(String lastslowparameters) {
        this.lastslowparameters = lastslowparameters == null ? null : lastslowparameters.trim();
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
     * @return readStringLength
     */
    public Long getReadstringlength() {
        return readstringlength;
    }

    /**
     * @param readstringlength
     */
    public void setReadstringlength(Long readstringlength) {
        this.readstringlength = readstringlength;
    }

    /**
     * @return readBytesLength
     */
    public Long getReadbyteslength() {
        return readbyteslength;
    }

    /**
     * @param readbyteslength
     */
    public void setReadbyteslength(Long readbyteslength) {
        this.readbyteslength = readbyteslength;
    }

    /**
     * @return inputStreamOpenCount
     */
    public Long getInputstreamopencount() {
        return inputstreamopencount;
    }

    /**
     * @param inputstreamopencount
     */
    public void setInputstreamopencount(Long inputstreamopencount) {
        this.inputstreamopencount = inputstreamopencount;
    }

    /**
     * @return readerOpenCount
     */
    public Long getReaderopencount() {
        return readeropencount;
    }

    /**
     * @param readeropencount
     */
    public void setReaderopencount(Long readeropencount) {
        this.readeropencount = readeropencount;
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
    public Integer getH100() {
        return h100;
    }

    /**
     * @param h100
     */
    public void setH100(Integer h100) {
        this.h100 = h100;
    }

    /**
     * @return h1000
     */
    public Integer getH1000() {
        return h1000;
    }

    /**
     * @param h1000
     */
    public void setH1000(Integer h1000) {
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

    /**
     * @return eh1
     */
    public Long getEh1() {
        return eh1;
    }

    /**
     * @param eh1
     */
    public void setEh1(Long eh1) {
        this.eh1 = eh1;
    }

    /**
     * @return eh10
     */
    public Long getEh10() {
        return eh10;
    }

    /**
     * @param eh10
     */
    public void setEh10(Long eh10) {
        this.eh10 = eh10;
    }

    /**
     * @return eh100
     */
    public Integer getEh100() {
        return eh100;
    }

    /**
     * @param eh100
     */
    public void setEh100(Integer eh100) {
        this.eh100 = eh100;
    }

    /**
     * @return eh1000
     */
    public Integer getEh1000() {
        return eh1000;
    }

    /**
     * @param eh1000
     */
    public void setEh1000(Integer eh1000) {
        this.eh1000 = eh1000;
    }

    /**
     * @return eh10000
     */
    public Integer getEh10000() {
        return eh10000;
    }

    /**
     * @param eh10000
     */
    public void setEh10000(Integer eh10000) {
        this.eh10000 = eh10000;
    }

    /**
     * @return eh100000
     */
    public Integer getEh100000() {
        return eh100000;
    }

    /**
     * @param eh100000
     */
    public void setEh100000(Integer eh100000) {
        this.eh100000 = eh100000;
    }

    /**
     * @return eh1000000
     */
    public Integer getEh1000000() {
        return eh1000000;
    }

    /**
     * @param eh1000000
     */
    public void setEh1000000(Integer eh1000000) {
        this.eh1000000 = eh1000000;
    }

    /**
     * @return ehmore
     */
    public Integer getEhmore() {
        return ehmore;
    }

    /**
     * @param ehmore
     */
    public void setEhmore(Integer ehmore) {
        this.ehmore = ehmore;
    }

    /**
     * @return f1
     */
    public Long getF1() {
        return f1;
    }

    /**
     * @param f1
     */
    public void setF1(Long f1) {
        this.f1 = f1;
    }

    /**
     * @return f10
     */
    public Long getF10() {
        return f10;
    }

    /**
     * @param f10
     */
    public void setF10(Long f10) {
        this.f10 = f10;
    }

    /**
     * @return f100
     */
    public Long getF100() {
        return f100;
    }

    /**
     * @param f100
     */
    public void setF100(Long f100) {
        this.f100 = f100;
    }

    /**
     * @return f1000
     */
    public Integer getF1000() {
        return f1000;
    }

    /**
     * @param f1000
     */
    public void setF1000(Integer f1000) {
        this.f1000 = f1000;
    }

    /**
     * @return f10000
     */
    public Integer getF10000() {
        return f10000;
    }

    /**
     * @param f10000
     */
    public void setF10000(Integer f10000) {
        this.f10000 = f10000;
    }

    /**
     * @return fmore
     */
    public Integer getFmore() {
        return fmore;
    }

    /**
     * @param fmore
     */
    public void setFmore(Integer fmore) {
        this.fmore = fmore;
    }

    /**
     * @return u1
     */
    public Long getU1() {
        return u1;
    }

    /**
     * @param u1
     */
    public void setU1(Long u1) {
        this.u1 = u1;
    }

    /**
     * @return u10
     */
    public Long getU10() {
        return u10;
    }

    /**
     * @param u10
     */
    public void setU10(Long u10) {
        this.u10 = u10;
    }

    /**
     * @return u100
     */
    public Long getU100() {
        return u100;
    }

    /**
     * @param u100
     */
    public void setU100(Long u100) {
        this.u100 = u100;
    }

    /**
     * @return u1000
     */
    public Integer getU1000() {
        return u1000;
    }

    /**
     * @param u1000
     */
    public void setU1000(Integer u1000) {
        this.u1000 = u1000;
    }

    /**
     * @return u10000
     */
    public Integer getU10000() {
        return u10000;
    }

    /**
     * @param u10000
     */
    public void setU10000(Integer u10000) {
        this.u10000 = u10000;
    }

    /**
     * @return umore
     */
    public Integer getUmore() {
        return umore;
    }

    /**
     * @param umore
     */
    public void setUmore(Integer umore) {
        this.umore = umore;
    }
}