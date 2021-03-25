package com.cgi.common.constants.enums;


public enum ELanguage {
    VI("VI","Tieng Viet","vi"),
    EN("EN", "English","en"),
    JA("JA", "Japanese","ja"),
    KO("KO", "Korean","ko");

    private ELanguage(String code,String name, String language) {
        this.language=language;
        this.name=name;
        this.code=code;
    }
    String code;
    String name;
    String language;


    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
