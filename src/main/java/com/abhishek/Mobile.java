package com.abhishek;

public class Mobile {
    private String operatingsystemName;
    private boolean canMakeCall;
    private String providerName;//Rogers,fido etc

    public String getOperatingsystemName() {
        return operatingsystemName;
    }

    public void setOperatingsystemName(String operatingsystemName) {
        this.operatingsystemName = operatingsystemName;
    }

    public boolean isCanMakeCall() {
        return canMakeCall;
    }

    public void setCanMakeCall(boolean canMakeCall) {
        this.canMakeCall = canMakeCall;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }
}
