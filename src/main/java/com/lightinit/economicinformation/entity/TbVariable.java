package com.lightinit.economicinformation.entity;

public class TbVariable {
    private Integer id;

    private String databaseName;

    private String batabaseChName;

    private String variableCategory;

    private String targetName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public String getBatabaseChName() {
        return batabaseChName;
    }

    public void setBatabaseChName(String batabaseChName) {
        this.batabaseChName = batabaseChName;
    }

    public String getVariableCategory() {
        return variableCategory;
    }

    public void setVariableCategory(String variableCategory) {
        this.variableCategory = variableCategory;
    }

    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }
}