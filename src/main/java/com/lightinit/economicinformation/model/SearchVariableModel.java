package com.lightinit.economicinformation.model;

public class SearchVariableModel {
    private String variableType;
    private String databaseSuffix;

    public String getVariableType() {
        return variableType;
    }

    public void setVariableType(String variableType) {
        this.variableType = variableType;
    }

    public String getDatabaseSuffix() {
        return databaseSuffix;
    }

    public void setDatabaseSuffix(String databaseSuffix) {
        this.databaseSuffix = databaseSuffix;
    }
}
