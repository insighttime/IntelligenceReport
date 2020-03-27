package com.lightinit.economicinformation.model;

import java.util.List;

public class SearchDateModel {
    private List<Integer> ids;
    private String databaseSuffix;

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    public String getDatabaseSuffix() {
        return databaseSuffix;
    }

    public void setDatabaseSuffix(String databaseSuffix) {
        this.databaseSuffix = databaseSuffix;
    }
}
