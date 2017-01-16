package db.tool.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "druid_wall_table")
public class DruidWallTable {
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

    @Column(name = "selectCount")
    private Long selectcount;

    @Column(name = "selectIntoCount")
    private Long selectintocount;

    @Column(name = "insertCount")
    private Long insertcount;

    @Column(name = "updateCount")
    private Long updatecount;

    @Column(name = "deleteCount")
    private Long deletecount;

    @Column(name = "truncateCount")
    private Long truncatecount;

    @Column(name = "createCount")
    private Long createcount;

    @Column(name = "alterCount")
    private Long altercount;

    @Column(name = "dropCount")
    private Long dropcount;

    @Column(name = "replaceCount")
    private Long replacecount;

    @Column(name = "deleteDataCount")
    private Long deletedatacount;

    @Column(name = "updateDataCount")
    private Long updatedatacount;

    @Column(name = "insertDataCount")
    private Long insertdatacount;

    @Column(name = "fetchRowCount")
    private Long fetchrowcount;

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
     * @return selectCount
     */
    public Long getSelectcount() {
        return selectcount;
    }

    /**
     * @param selectcount
     */
    public void setSelectcount(Long selectcount) {
        this.selectcount = selectcount;
    }

    /**
     * @return selectIntoCount
     */
    public Long getSelectintocount() {
        return selectintocount;
    }

    /**
     * @param selectintocount
     */
    public void setSelectintocount(Long selectintocount) {
        this.selectintocount = selectintocount;
    }

    /**
     * @return insertCount
     */
    public Long getInsertcount() {
        return insertcount;
    }

    /**
     * @param insertcount
     */
    public void setInsertcount(Long insertcount) {
        this.insertcount = insertcount;
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
     * @return deleteCount
     */
    public Long getDeletecount() {
        return deletecount;
    }

    /**
     * @param deletecount
     */
    public void setDeletecount(Long deletecount) {
        this.deletecount = deletecount;
    }

    /**
     * @return truncateCount
     */
    public Long getTruncatecount() {
        return truncatecount;
    }

    /**
     * @param truncatecount
     */
    public void setTruncatecount(Long truncatecount) {
        this.truncatecount = truncatecount;
    }

    /**
     * @return createCount
     */
    public Long getCreatecount() {
        return createcount;
    }

    /**
     * @param createcount
     */
    public void setCreatecount(Long createcount) {
        this.createcount = createcount;
    }

    /**
     * @return alterCount
     */
    public Long getAltercount() {
        return altercount;
    }

    /**
     * @param altercount
     */
    public void setAltercount(Long altercount) {
        this.altercount = altercount;
    }

    /**
     * @return dropCount
     */
    public Long getDropcount() {
        return dropcount;
    }

    /**
     * @param dropcount
     */
    public void setDropcount(Long dropcount) {
        this.dropcount = dropcount;
    }

    /**
     * @return replaceCount
     */
    public Long getReplacecount() {
        return replacecount;
    }

    /**
     * @param replacecount
     */
    public void setReplacecount(Long replacecount) {
        this.replacecount = replacecount;
    }

    /**
     * @return deleteDataCount
     */
    public Long getDeletedatacount() {
        return deletedatacount;
    }

    /**
     * @param deletedatacount
     */
    public void setDeletedatacount(Long deletedatacount) {
        this.deletedatacount = deletedatacount;
    }

    /**
     * @return updateDataCount
     */
    public Long getUpdatedatacount() {
        return updatedatacount;
    }

    /**
     * @param updatedatacount
     */
    public void setUpdatedatacount(Long updatedatacount) {
        this.updatedatacount = updatedatacount;
    }

    /**
     * @return insertDataCount
     */
    public Long getInsertdatacount() {
        return insertdatacount;
    }

    /**
     * @param insertdatacount
     */
    public void setInsertdatacount(Long insertdatacount) {
        this.insertdatacount = insertdatacount;
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
}