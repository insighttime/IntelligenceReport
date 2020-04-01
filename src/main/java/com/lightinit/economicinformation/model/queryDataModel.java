package com.lightinit.economicinformation.model;

import java.util.List;

public class queryDataModel {
    private String dataBase;
    private String fileName;
    private List<queryVariableModel> textList;
//    private List<queryVariableModel> tableList;
//    private List<queryVariableModel> viewList;

    public String getDataBase() {
        return dataBase;
    }

    public void setDataBase(String dataBase) {
        this.dataBase = dataBase;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public List<queryVariableModel> getTextList() {
        return textList;
    }

    public void setTextList(List<queryVariableModel> textList) {
        this.textList = textList;
    }

//    public List<queryVariableModel> getTableList() {
//        return tableList;
//    }
//
//    public void setTableList(List<queryVariableModel> tableList) {
//        this.tableList = tableList;
//    }
//
//    public List<queryVariableModel> getViewList() {
//        return viewList;
//    }
//
//    public void setViewList(List<queryVariableModel> viewList) {
//        this.viewList = viewList;
//    }
}