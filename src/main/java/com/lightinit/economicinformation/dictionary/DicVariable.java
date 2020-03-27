package com.lightinit.economicinformation.dictionary;

import java.util.LinkedHashMap;

public class DicVariable {
    public static final String Travel = "Travel";
    public static final String RAREEARTH = "rareearth";

    private static DicVariable instance = null;
    private static LinkedHashMap<String, String> dicMap = null;

    private DicVariable() {
        dicMap = new LinkedHashMap<>();
        dicMap.put(Travel, "tb_variable_Travel");
        dicMap.put(RAREEARTH, "tb_variable_RareEarth");
    }

    public static DicVariable getInstance() {
        if (instance == null) {
            instance = new DicVariable();
        }
        return instance;
    }

    public LinkedHashMap<String, String> getDicMap() {
        return (LinkedHashMap<String, String>) dicMap.clone();
    }
}
