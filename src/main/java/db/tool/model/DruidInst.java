package db.tool.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "druid_inst")
public class DruidInst {
    @Id
    private Long id;

    private String app;

    private String domain;

    private String cluster;

    private String host;

    private String ip;

    @Column(name = "lastActiveTime")
    private Date lastactivetime;

    @Column(name = "lastPID")
    private Long lastpid;

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
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * @param ip
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * @return lastActiveTime
     */
    public Date getLastactivetime() {
        return lastactivetime;
    }

    /**
     * @param lastactivetime
     */
    public void setLastactivetime(Date lastactivetime) {
        this.lastactivetime = lastactivetime;
    }

    /**
     * @return lastPID
     */
    public Long getLastpid() {
        return lastpid;
    }

    /**
     * @param lastpid
     */
    public void setLastpid(Long lastpid) {
        this.lastpid = lastpid;
    }
}