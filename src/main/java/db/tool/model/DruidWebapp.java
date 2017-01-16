package db.tool.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "druid_webapp")
public class DruidWebapp {
    @Id
    private Long id;

    private String domain;

    private String app;

    private String cluster;

    private String host;

    private Integer pid;

    @Column(name = "collectTime")
    private Date collecttime;

    @Column(name = "contextPath")
    private String contextpath;

    @Column(name = "runningCount")
    private Integer runningcount;

    @Column(name = "concurrentMax")
    private Integer concurrentmax;

    @Column(name = "requestCount")
    private Long requestcount;

    @Column(name = "sessionCount")
    private Long sessioncount;

    @Column(name = "jdbcFetchRowCount")
    private Long jdbcfetchrowcount;

    @Column(name = "jdbcUpdateCount")
    private Long jdbcupdatecount;

    @Column(name = "jdbcExecuteCount")
    private Long jdbcexecutecount;

    @Column(name = "jdbcExecuteTimeNano")
    private Long jdbcexecutetimenano;

    @Column(name = "jdbcCommitCount")
    private Long jdbccommitcount;

    @Column(name = "jdbcRollbackCount")
    private Long jdbcrollbackcount;

    @Column(name = "osMacOSXCount")
    private Long osmacosxcount;

    @Column(name = "osWindowsCount")
    private Long oswindowscount;

    @Column(name = "osLinuxCount")
    private Long oslinuxcount;

    @Column(name = "osSymbianCount")
    private Long ossymbiancount;

    @Column(name = "osFreeBSDCount")
    private Long osfreebsdcount;

    @Column(name = "osOpenBSDCount")
    private Long osopenbsdcount;

    @Column(name = "osAndroidCount")
    private Long osandroidcount;

    @Column(name = "osWindows98Count")
    private Long oswindows98count;

    @Column(name = "osWindowsXPCount")
    private Long oswindowsxpcount;

    @Column(name = "osWindows2000Count")
    private Long oswindows2000count;

    @Column(name = "osWindowsVistaCount")
    private Long oswindowsvistacount;

    @Column(name = "osWindows7Count")
    private Long oswindows7count;

    @Column(name = "osWindows8Count")
    private Long oswindows8count;

    @Column(name = "osAndroid15Count")
    private Long osandroid15count;

    @Column(name = "osAndroid16Count")
    private Long osandroid16count;

    @Column(name = "osAndroid20Count")
    private Long osandroid20count;

    @Column(name = "osAndroid21Count")
    private Long osandroid21count;

    @Column(name = "osAndroid22Count")
    private Long osandroid22count;

    @Column(name = "osAndroid23Count")
    private Long osandroid23count;

    @Column(name = "osAndroid30Count")
    private Long osandroid30count;

    @Column(name = "osAndroid31Count")
    private Long osandroid31count;

    @Column(name = "osAndroid32Count")
    private Long osandroid32count;

    @Column(name = "osAndroid40Count")
    private Long osandroid40count;

    @Column(name = "osAndroid41Count")
    private Long osandroid41count;

    @Column(name = "osAndroid42Count")
    private Long osandroid42count;

    @Column(name = "osAndroid43Count")
    private Long osandroid43count;

    @Column(name = "osLinuxUbuntuCount")
    private Long oslinuxubuntucount;

    @Column(name = "browserIECount")
    private Long browseriecount;

    @Column(name = "browserFirefoxCount")
    private Long browserfirefoxcount;

    @Column(name = "browserChromeCount")
    private Long browserchromecount;

    @Column(name = "browserSafariCount")
    private Long browsersafaricount;

    @Column(name = "browserOperaCount")
    private Long browseroperacount;

    @Column(name = "browserIE5Count")
    private Long browserie5count;

    @Column(name = "browserIE6Count")
    private Long browserie6count;

    @Column(name = "browserIE7Count")
    private Long browserie7count;

    @Column(name = "browserIE8Count")
    private Long browserie8count;

    @Column(name = "browserIE9Count")
    private Long browserie9count;

    @Column(name = "browserIE10Count")
    private Long browserie10count;

    @Column(name = "browser360SECount")
    private Long browser360secount;

    @Column(name = "deviceAndroidCount")
    private Long deviceandroidcount;

    @Column(name = "deviceIpadCount")
    private Long deviceipadcount;

    @Column(name = "deviceIphoneCount")
    private Long deviceiphonecount;

    @Column(name = "deviceWindowsPhoneCount")
    private Long devicewindowsphonecount;

    @Column(name = "botCount")
    private Long botcount;

    @Column(name = "botBaiduCount")
    private Long botbaiducount;

    @Column(name = "botYoudaoCount")
    private Long botyoudaocount;

    @Column(name = "botGoogleCount")
    private Long botgooglecount;

    @Column(name = "botMsnCount")
    private Long botmsncount;

    @Column(name = "botBingCount")
    private Long botbingcount;

    @Column(name = "botSosoCount")
    private Long botsosocount;

    @Column(name = "botSogouCount")
    private Long botsogoucount;

    @Column(name = "botYahooCount")
    private Long botyahoocount;

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
     * @return contextPath
     */
    public String getContextpath() {
        return contextpath;
    }

    /**
     * @param contextpath
     */
    public void setContextpath(String contextpath) {
        this.contextpath = contextpath == null ? null : contextpath.trim();
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
     * @return sessionCount
     */
    public Long getSessioncount() {
        return sessioncount;
    }

    /**
     * @param sessioncount
     */
    public void setSessioncount(Long sessioncount) {
        this.sessioncount = sessioncount;
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
     * @return osMacOSXCount
     */
    public Long getOsmacosxcount() {
        return osmacosxcount;
    }

    /**
     * @param osmacosxcount
     */
    public void setOsmacosxcount(Long osmacosxcount) {
        this.osmacosxcount = osmacosxcount;
    }

    /**
     * @return osWindowsCount
     */
    public Long getOswindowscount() {
        return oswindowscount;
    }

    /**
     * @param oswindowscount
     */
    public void setOswindowscount(Long oswindowscount) {
        this.oswindowscount = oswindowscount;
    }

    /**
     * @return osLinuxCount
     */
    public Long getOslinuxcount() {
        return oslinuxcount;
    }

    /**
     * @param oslinuxcount
     */
    public void setOslinuxcount(Long oslinuxcount) {
        this.oslinuxcount = oslinuxcount;
    }

    /**
     * @return osSymbianCount
     */
    public Long getOssymbiancount() {
        return ossymbiancount;
    }

    /**
     * @param ossymbiancount
     */
    public void setOssymbiancount(Long ossymbiancount) {
        this.ossymbiancount = ossymbiancount;
    }

    /**
     * @return osFreeBSDCount
     */
    public Long getOsfreebsdcount() {
        return osfreebsdcount;
    }

    /**
     * @param osfreebsdcount
     */
    public void setOsfreebsdcount(Long osfreebsdcount) {
        this.osfreebsdcount = osfreebsdcount;
    }

    /**
     * @return osOpenBSDCount
     */
    public Long getOsopenbsdcount() {
        return osopenbsdcount;
    }

    /**
     * @param osopenbsdcount
     */
    public void setOsopenbsdcount(Long osopenbsdcount) {
        this.osopenbsdcount = osopenbsdcount;
    }

    /**
     * @return osAndroidCount
     */
    public Long getOsandroidcount() {
        return osandroidcount;
    }

    /**
     * @param osandroidcount
     */
    public void setOsandroidcount(Long osandroidcount) {
        this.osandroidcount = osandroidcount;
    }

    /**
     * @return osWindows98Count
     */
    public Long getOswindows98count() {
        return oswindows98count;
    }

    /**
     * @param oswindows98count
     */
    public void setOswindows98count(Long oswindows98count) {
        this.oswindows98count = oswindows98count;
    }

    /**
     * @return osWindowsXPCount
     */
    public Long getOswindowsxpcount() {
        return oswindowsxpcount;
    }

    /**
     * @param oswindowsxpcount
     */
    public void setOswindowsxpcount(Long oswindowsxpcount) {
        this.oswindowsxpcount = oswindowsxpcount;
    }

    /**
     * @return osWindows2000Count
     */
    public Long getOswindows2000count() {
        return oswindows2000count;
    }

    /**
     * @param oswindows2000count
     */
    public void setOswindows2000count(Long oswindows2000count) {
        this.oswindows2000count = oswindows2000count;
    }

    /**
     * @return osWindowsVistaCount
     */
    public Long getOswindowsvistacount() {
        return oswindowsvistacount;
    }

    /**
     * @param oswindowsvistacount
     */
    public void setOswindowsvistacount(Long oswindowsvistacount) {
        this.oswindowsvistacount = oswindowsvistacount;
    }

    /**
     * @return osWindows7Count
     */
    public Long getOswindows7count() {
        return oswindows7count;
    }

    /**
     * @param oswindows7count
     */
    public void setOswindows7count(Long oswindows7count) {
        this.oswindows7count = oswindows7count;
    }

    /**
     * @return osWindows8Count
     */
    public Long getOswindows8count() {
        return oswindows8count;
    }

    /**
     * @param oswindows8count
     */
    public void setOswindows8count(Long oswindows8count) {
        this.oswindows8count = oswindows8count;
    }

    /**
     * @return osAndroid15Count
     */
    public Long getOsandroid15count() {
        return osandroid15count;
    }

    /**
     * @param osandroid15count
     */
    public void setOsandroid15count(Long osandroid15count) {
        this.osandroid15count = osandroid15count;
    }

    /**
     * @return osAndroid16Count
     */
    public Long getOsandroid16count() {
        return osandroid16count;
    }

    /**
     * @param osandroid16count
     */
    public void setOsandroid16count(Long osandroid16count) {
        this.osandroid16count = osandroid16count;
    }

    /**
     * @return osAndroid20Count
     */
    public Long getOsandroid20count() {
        return osandroid20count;
    }

    /**
     * @param osandroid20count
     */
    public void setOsandroid20count(Long osandroid20count) {
        this.osandroid20count = osandroid20count;
    }

    /**
     * @return osAndroid21Count
     */
    public Long getOsandroid21count() {
        return osandroid21count;
    }

    /**
     * @param osandroid21count
     */
    public void setOsandroid21count(Long osandroid21count) {
        this.osandroid21count = osandroid21count;
    }

    /**
     * @return osAndroid22Count
     */
    public Long getOsandroid22count() {
        return osandroid22count;
    }

    /**
     * @param osandroid22count
     */
    public void setOsandroid22count(Long osandroid22count) {
        this.osandroid22count = osandroid22count;
    }

    /**
     * @return osAndroid23Count
     */
    public Long getOsandroid23count() {
        return osandroid23count;
    }

    /**
     * @param osandroid23count
     */
    public void setOsandroid23count(Long osandroid23count) {
        this.osandroid23count = osandroid23count;
    }

    /**
     * @return osAndroid30Count
     */
    public Long getOsandroid30count() {
        return osandroid30count;
    }

    /**
     * @param osandroid30count
     */
    public void setOsandroid30count(Long osandroid30count) {
        this.osandroid30count = osandroid30count;
    }

    /**
     * @return osAndroid31Count
     */
    public Long getOsandroid31count() {
        return osandroid31count;
    }

    /**
     * @param osandroid31count
     */
    public void setOsandroid31count(Long osandroid31count) {
        this.osandroid31count = osandroid31count;
    }

    /**
     * @return osAndroid32Count
     */
    public Long getOsandroid32count() {
        return osandroid32count;
    }

    /**
     * @param osandroid32count
     */
    public void setOsandroid32count(Long osandroid32count) {
        this.osandroid32count = osandroid32count;
    }

    /**
     * @return osAndroid40Count
     */
    public Long getOsandroid40count() {
        return osandroid40count;
    }

    /**
     * @param osandroid40count
     */
    public void setOsandroid40count(Long osandroid40count) {
        this.osandroid40count = osandroid40count;
    }

    /**
     * @return osAndroid41Count
     */
    public Long getOsandroid41count() {
        return osandroid41count;
    }

    /**
     * @param osandroid41count
     */
    public void setOsandroid41count(Long osandroid41count) {
        this.osandroid41count = osandroid41count;
    }

    /**
     * @return osAndroid42Count
     */
    public Long getOsandroid42count() {
        return osandroid42count;
    }

    /**
     * @param osandroid42count
     */
    public void setOsandroid42count(Long osandroid42count) {
        this.osandroid42count = osandroid42count;
    }

    /**
     * @return osAndroid43Count
     */
    public Long getOsandroid43count() {
        return osandroid43count;
    }

    /**
     * @param osandroid43count
     */
    public void setOsandroid43count(Long osandroid43count) {
        this.osandroid43count = osandroid43count;
    }

    /**
     * @return osLinuxUbuntuCount
     */
    public Long getOslinuxubuntucount() {
        return oslinuxubuntucount;
    }

    /**
     * @param oslinuxubuntucount
     */
    public void setOslinuxubuntucount(Long oslinuxubuntucount) {
        this.oslinuxubuntucount = oslinuxubuntucount;
    }

    /**
     * @return browserIECount
     */
    public Long getBrowseriecount() {
        return browseriecount;
    }

    /**
     * @param browseriecount
     */
    public void setBrowseriecount(Long browseriecount) {
        this.browseriecount = browseriecount;
    }

    /**
     * @return browserFirefoxCount
     */
    public Long getBrowserfirefoxcount() {
        return browserfirefoxcount;
    }

    /**
     * @param browserfirefoxcount
     */
    public void setBrowserfirefoxcount(Long browserfirefoxcount) {
        this.browserfirefoxcount = browserfirefoxcount;
    }

    /**
     * @return browserChromeCount
     */
    public Long getBrowserchromecount() {
        return browserchromecount;
    }

    /**
     * @param browserchromecount
     */
    public void setBrowserchromecount(Long browserchromecount) {
        this.browserchromecount = browserchromecount;
    }

    /**
     * @return browserSafariCount
     */
    public Long getBrowsersafaricount() {
        return browsersafaricount;
    }

    /**
     * @param browsersafaricount
     */
    public void setBrowsersafaricount(Long browsersafaricount) {
        this.browsersafaricount = browsersafaricount;
    }

    /**
     * @return browserOperaCount
     */
    public Long getBrowseroperacount() {
        return browseroperacount;
    }

    /**
     * @param browseroperacount
     */
    public void setBrowseroperacount(Long browseroperacount) {
        this.browseroperacount = browseroperacount;
    }

    /**
     * @return browserIE5Count
     */
    public Long getBrowserie5count() {
        return browserie5count;
    }

    /**
     * @param browserie5count
     */
    public void setBrowserie5count(Long browserie5count) {
        this.browserie5count = browserie5count;
    }

    /**
     * @return browserIE6Count
     */
    public Long getBrowserie6count() {
        return browserie6count;
    }

    /**
     * @param browserie6count
     */
    public void setBrowserie6count(Long browserie6count) {
        this.browserie6count = browserie6count;
    }

    /**
     * @return browserIE7Count
     */
    public Long getBrowserie7count() {
        return browserie7count;
    }

    /**
     * @param browserie7count
     */
    public void setBrowserie7count(Long browserie7count) {
        this.browserie7count = browserie7count;
    }

    /**
     * @return browserIE8Count
     */
    public Long getBrowserie8count() {
        return browserie8count;
    }

    /**
     * @param browserie8count
     */
    public void setBrowserie8count(Long browserie8count) {
        this.browserie8count = browserie8count;
    }

    /**
     * @return browserIE9Count
     */
    public Long getBrowserie9count() {
        return browserie9count;
    }

    /**
     * @param browserie9count
     */
    public void setBrowserie9count(Long browserie9count) {
        this.browserie9count = browserie9count;
    }

    /**
     * @return browserIE10Count
     */
    public Long getBrowserie10count() {
        return browserie10count;
    }

    /**
     * @param browserie10count
     */
    public void setBrowserie10count(Long browserie10count) {
        this.browserie10count = browserie10count;
    }

    /**
     * @return browser360SECount
     */
    public Long getBrowser360secount() {
        return browser360secount;
    }

    /**
     * @param browser360secount
     */
    public void setBrowser360secount(Long browser360secount) {
        this.browser360secount = browser360secount;
    }

    /**
     * @return deviceAndroidCount
     */
    public Long getDeviceandroidcount() {
        return deviceandroidcount;
    }

    /**
     * @param deviceandroidcount
     */
    public void setDeviceandroidcount(Long deviceandroidcount) {
        this.deviceandroidcount = deviceandroidcount;
    }

    /**
     * @return deviceIpadCount
     */
    public Long getDeviceipadcount() {
        return deviceipadcount;
    }

    /**
     * @param deviceipadcount
     */
    public void setDeviceipadcount(Long deviceipadcount) {
        this.deviceipadcount = deviceipadcount;
    }

    /**
     * @return deviceIphoneCount
     */
    public Long getDeviceiphonecount() {
        return deviceiphonecount;
    }

    /**
     * @param deviceiphonecount
     */
    public void setDeviceiphonecount(Long deviceiphonecount) {
        this.deviceiphonecount = deviceiphonecount;
    }

    /**
     * @return deviceWindowsPhoneCount
     */
    public Long getDevicewindowsphonecount() {
        return devicewindowsphonecount;
    }

    /**
     * @param devicewindowsphonecount
     */
    public void setDevicewindowsphonecount(Long devicewindowsphonecount) {
        this.devicewindowsphonecount = devicewindowsphonecount;
    }

    /**
     * @return botCount
     */
    public Long getBotcount() {
        return botcount;
    }

    /**
     * @param botcount
     */
    public void setBotcount(Long botcount) {
        this.botcount = botcount;
    }

    /**
     * @return botBaiduCount
     */
    public Long getBotbaiducount() {
        return botbaiducount;
    }

    /**
     * @param botbaiducount
     */
    public void setBotbaiducount(Long botbaiducount) {
        this.botbaiducount = botbaiducount;
    }

    /**
     * @return botYoudaoCount
     */
    public Long getBotyoudaocount() {
        return botyoudaocount;
    }

    /**
     * @param botyoudaocount
     */
    public void setBotyoudaocount(Long botyoudaocount) {
        this.botyoudaocount = botyoudaocount;
    }

    /**
     * @return botGoogleCount
     */
    public Long getBotgooglecount() {
        return botgooglecount;
    }

    /**
     * @param botgooglecount
     */
    public void setBotgooglecount(Long botgooglecount) {
        this.botgooglecount = botgooglecount;
    }

    /**
     * @return botMsnCount
     */
    public Long getBotmsncount() {
        return botmsncount;
    }

    /**
     * @param botmsncount
     */
    public void setBotmsncount(Long botmsncount) {
        this.botmsncount = botmsncount;
    }

    /**
     * @return botBingCount
     */
    public Long getBotbingcount() {
        return botbingcount;
    }

    /**
     * @param botbingcount
     */
    public void setBotbingcount(Long botbingcount) {
        this.botbingcount = botbingcount;
    }

    /**
     * @return botSosoCount
     */
    public Long getBotsosocount() {
        return botsosocount;
    }

    /**
     * @param botsosocount
     */
    public void setBotsosocount(Long botsosocount) {
        this.botsosocount = botsosocount;
    }

    /**
     * @return botSogouCount
     */
    public Long getBotsogoucount() {
        return botsogoucount;
    }

    /**
     * @param botsogoucount
     */
    public void setBotsogoucount(Long botsogoucount) {
        this.botsogoucount = botsogoucount;
    }

    /**
     * @return botYahooCount
     */
    public Long getBotyahoocount() {
        return botyahoocount;
    }

    /**
     * @param botyahoocount
     */
    public void setBotyahoocount(Long botyahoocount) {
        this.botyahoocount = botyahoocount;
    }
}