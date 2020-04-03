package com.lightinit.economicinformation.dictionary;

import java.util.LinkedHashMap;

public class DicAttribute {
    public static final String Travel = "Travel";
    public static final String RAREEARTH = "RareEarth";

    private static DicAttribute instance = null;
    private static LinkedHashMap<String, String> dicMap = null;

    private DicAttribute() {
        dicMap = new LinkedHashMap<>();
        dicMap.put(Travel, "tb_target_attribute_Travel");
        dicMap.put(RAREEARTH, "tb_target_attribute_RareEarth");
    }

    public static DicAttribute getInstance() {
        if (instance == null) {
            instance = new DicAttribute();
        }
        return instance;
    }

    public LinkedHashMap<String, String> getDicMap() {
        return (LinkedHashMap<String, String>) dicMap.clone();
    }
}
