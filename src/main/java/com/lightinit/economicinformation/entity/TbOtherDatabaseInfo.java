package com.lightinit.economicinformation.entity;

public class TbOtherDatabaseInfo {
    private String sourceDatabaseChName;

    private String suffix;

    private String sourceDatabaseRealName;

    private String serverHost;

    private String serverUser;

    private String serverUserPassword;

    private String serverDatabasePort;

    private String dataType;

    public String getSourceDatabaseChName() {
        return sourceDatabaseChName;
    }

    public void setSourceDatabaseChName(String sourceDatabaseChName) {
        this.sourceDatabaseChName = sourceDatabaseChName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getSourceDatabaseRealName() {
        return sourceDatabaseRealName;
    }

    public void setSourceDatabaseRealName(String sourceDatabaseRealName) {
        this.sourceDatabaseRealName = sourceDatabaseRealName;
    }

    public String getServerHost() {
        return serverHost;
    }

    public void setServerHost(String serverHost) {
        this.serverHost = serverHost;
    }

    public String getServerUser() {
        return serverUser;
    }

    public void setServerUser(String serverUser) {
        this.serverUser = serverUser;
    }

    public String getServerUserPassword() {
        return serverUserPassword;
    }

    public void setServerUserPassword(String serverUserPassword) {
        this.serverUserPassword = serverUserPassword;
    }

    public String getServerDatabasePort() {
        return serverDatabasePort;
    }

    public void setServerDatabasePort(String serverDatabasePort) {
        this.serverDatabasePort = serverDatabasePort;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }
}