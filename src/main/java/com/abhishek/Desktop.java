package com.abhishek;

public class Desktop extends Computer {
    private String keyboardType;
    private String screenType;

    public Desktop() {
    }

    public Desktop(String keyboardType, String screenType) {
        this.keyboardType = keyboardType;
        this.screenType = screenType;
    }

    public Desktop(int id, String manufacturerName, String keyboardType, String screenType) {
        super(id, manufacturerName);
        this.keyboardType = keyboardType;
        this.screenType = screenType;
    }

    public String getKeyboardType() {
        return keyboardType;
    }

    public void setKeyboardType(String keyboardType) {
        this.keyboardType = keyboardType;
    }

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }
}
