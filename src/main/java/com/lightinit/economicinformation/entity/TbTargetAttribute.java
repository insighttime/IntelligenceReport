package com.lightinit.economicinformation.entity;

import java.util.Date;

public class TbTargetAttribute {
    private Integer id;

    private Integer variableId;

    private String targetFromTableName;

    private String targetIndexField;

    private Integer defaultDescribeId;

    private Date baseTime;

    private String targetAttributeName;

    private String targetAttributeType;

    private String targetAttributeIndexField;

    private Integer computingMethodId;

    private String filterSupported;

    private Integer filterCondition2Id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVariableId() {
        return variableId;
    }

    public void setVariableId(Integer variableId) {
        this.variableId = variableId;
    }

    public String getTargetFromTableName() {
        return targetFromTableName;
    }

    public void setTargetFromTableName(String targetFromTableName) {
        this.targetFromTableName = targetFromTableName;
    }

    public String getTargetIndexField() {
        return targetIndexField;
    }

    public void setTargetIndexField(String targetIndexField) {
        this.targetIndexField = targetIndexField;
    }

    public Integer getDefaultDescribeId() {
        return defaultDescribeId;
    }

    public void setDefaultDescribeId(Integer defaultDescribeId) {
        this.defaultDescribeId = defaultDescribeId;
    }

    public Date getBaseTime() {
        return baseTime;
    }

    public void setBaseTime(Date baseTime) {
        this.baseTime = baseTime;
    }

    public String getTargetAttributeName() {
        return targetAttributeName;
    }

    public void setTargetAttributeName(String targetAttributeName) {
        this.targetAttributeName = targetAttributeName;
    }

    public String getTargetAttributeType() {
        return targetAttributeType;
    }

    public void setTargetAttributeType(String targetAttributeType) {
        this.targetAttributeType = targetAttributeType;
    }

    public String getTargetAttributeIndexField() {
        return targetAttributeIndexField;
    }

    public void setTargetAttributeIndexField(String targetAttributeIndexField) {
        this.targetAttributeIndexField = targetAttributeIndexField;
    }

    public Integer getComputingMethodId() {
        return computingMethodId;
    }

    public void setComputingMethodId(Integer computingMethodId) {
        this.computingMethodId = computingMethodId;
    }

    public String getFilterSupported() {
        return filterSupported;
    }

    public void setFilterSupported(String filterSupported) {
        this.filterSupported = filterSupported;
    }

    public Integer getFilterCondition2Id() {
        return filterCondition2Id;
    }

    public void setFilterCondition2Id(Integer filterCondition2Id) {
        this.filterCondition2Id = filterCondition2Id;
    }
}