package com.lightinit.economicinformation.entity;

public class TbTargetAttributeWithBLOBs extends TbTargetAttribute {
    private String filterCondition1Id;

    private String requireAttributeId;

    public String getFilterCondition1Id() {
        return filterCondition1Id;
    }

    public void setFilterCondition1Id(String filterCondition1Id) {
        this.filterCondition1Id = filterCondition1Id;
    }

    public String getRequireAttributeId() {
        return requireAttributeId;
    }

    public void setRequireAttributeId(String requireAttributeId) {
        this.requireAttributeId = requireAttributeId;
    }
}