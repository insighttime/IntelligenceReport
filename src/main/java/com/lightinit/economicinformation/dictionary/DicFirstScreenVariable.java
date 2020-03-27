package com.lightinit.economicinformation.dictionary;

import java.util.LinkedHashMap;

public class DicFirstScreenVariable {

    public static final String Travel = "Travel";
    public static final String RAREEARTH = "rareearth";

    private static DicFirstScreenVariable instance = null;
    private static LinkedHashMap<String, String> dicMap = null;

    private DicFirstScreenVariable() {
        dicMap = new LinkedHashMap<>();
        dicMap.put(Travel, "tb_first_screen_variable_Travel");
        dicMap.put(RAREEARTH, "tb_first_screen_variable_RareEarth");
    }

    public static DicFirstScreenVariable getInstance() {
        if (instance == null) {
            instance = new DicFirstScreenVariable();
        }
        return instance;
    }

    public LinkedHashMap<String, String> getDicMap() {
        return (LinkedHashMap<String, String>) dicMap.clone();
    }
}
