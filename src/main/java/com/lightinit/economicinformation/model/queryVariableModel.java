package com.lightinit.economicinformation.model;

public class queryVariableModel {
    private String target;//指标变量
    private String attribute;//属性变量
    private String screen;//筛选变量
    private Integer type;//类型 文本/表格/图表
    private Integer paragraph;//段落
    private String tr;
    private String td;




    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getTr() {
        return tr;
    }

    public void setTr(String tr) {
        this.tr = tr;
    }

    public String getTd() {
        return td;
    }

    public void setTd(String td) {
        this.td = td;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getParagraph() {
        return paragraph;
    }

    public void setParagraph(Integer paragraph) {
        this.paragraph = paragraph;
    }
}
