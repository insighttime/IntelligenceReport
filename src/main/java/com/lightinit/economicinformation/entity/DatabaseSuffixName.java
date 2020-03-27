package com.lightinit.economicinformation.entity;

public class DatabaseSuffixName {
    private Integer id;

    private String databaseShowName;

    private String sourceDatabaseName;

    private String databaseSuffix;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDatabaseShowName() {
        return databaseShowName;
    }

    public void setDatabaseShowName(String databaseShowName) {
        this.databaseShowName = databaseShowName;
    }

    public String getSourceDatabaseName() {
        return sourceDatabaseName;
    }

    public void setSourceDatabaseName(String sourceDatabaseName) {
        this.sourceDatabaseName = sourceDatabaseName;
    }

    public String getDatabaseSuffix() {
        return databaseSuffix;
    }

    public void setDatabaseSuffix(String databaseSuffix) {
        this.databaseSuffix = databaseSuffix;
    }
}