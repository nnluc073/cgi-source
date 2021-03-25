package com.cgi.common.constants.enums;

public enum ECurrency {
    VND("VN","VND","đ"),
    USD("US","USD","$");

    ECurrency(String code,String name, String character) {
        this.code = code;
        this.character = character;
    }

    String code;
    String name;
    String character;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }
}

