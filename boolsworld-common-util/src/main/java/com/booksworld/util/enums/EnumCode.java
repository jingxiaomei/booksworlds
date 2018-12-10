package com.booksworld.util.enums;

public enum EnumCode {
    USERNULL("00001", "用户未登录");

    private EnumCode(String key, String value) {
        this.key = key;
        this.value = value;
    }

    private String key;
    private String value;

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public static EnumCode getValueByKey(String key) {
        EnumCode[] values = EnumCode.values();
        for (EnumCode consts : values) {
            if (consts.getKey().equals(key)) {
                return consts;
            }
        }
        return null;
    }
}
