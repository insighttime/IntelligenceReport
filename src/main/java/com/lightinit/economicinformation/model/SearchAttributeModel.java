package com.lightinit.economicinformation.model;

public class SearchAttributeModel {
    private Integer variableId;
    private String databaseSuffix;

    public Integer getVariableId() {
        return variableId;
    }

    public void setVariableId(Integer variableId) {
        this.variableId = variableId;
    }

    public String getDatabaseSuffix() {
        return databaseSuffix;
    }

    public void setDatabaseSuffix(String databaseSuffix) {
        this.databaseSuffix = databaseSuffix;
    }
}
