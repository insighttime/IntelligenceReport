package com.lightinit.economicinformation.entity;

public class TbFirstScreenVariable {
    private Integer id;

    private Integer variableId;

    private String inputWay;

    private String screenFromTableName;

    private String screenIndexFieldName;

    private String screenConditionModel1;

    private String screenConditionModel2;

    private String conditionOptionsType;

    private String minOptionsValue;

    private String maxOptionsValue;

    private String screenVariableType;

    private String optionsContent;

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

    public String getInputWay() {
        return inputWay;
    }

    public void setInputWay(String inputWay) {
        this.inputWay = inputWay;
    }

    public String getScreenFromTableName() {
        return screenFromTableName;
    }

    public void setScreenFromTableName(String screenFromTableName) {
        this.screenFromTableName = screenFromTableName;
    }

    public String getScreenIndexFieldName() {
        return screenIndexFieldName;
    }

    public void setScreenIndexFieldName(String screenIndexFieldName) {
        this.screenIndexFieldName = screenIndexFieldName;
    }

    public String getScreenConditionModel1() {
        return screenConditionModel1;
    }

    public void setScreenConditionModel1(String screenConditionModel1) {
        this.screenConditionModel1 = screenConditionModel1;
    }

    public String getScreenConditionModel2() {
        return screenConditionModel2;
    }

    public void setScreenConditionModel2(String screenConditionModel2) {
        this.screenConditionModel2 = screenConditionModel2;
    }

    public String getConditionOptionsType() {
        return conditionOptionsType;
    }

    public void setConditionOptionsType(String conditionOptionsType) {
        this.conditionOptionsType = conditionOptionsType;
    }

    public String getMinOptionsValue() {
        return minOptionsValue;
    }

    public void setMinOptionsValue(String minOptionsValue) {
        this.minOptionsValue = minOptionsValue;
    }

    public String getMaxOptionsValue() {
        return maxOptionsValue;
    }

    public void setMaxOptionsValue(String maxOptionsValue) {
        this.maxOptionsValue = maxOptionsValue;
    }

    public String getScreenVariableType() {
        return screenVariableType;
    }

    public void setScreenVariableType(String screenVariableType) {
        this.screenVariableType = screenVariableType;
    }

    public String getOptionsContent() {
        return optionsContent;
    }

    public void setOptionsContent(String optionsContent) {
        this.optionsContent = optionsContent;
    }
}