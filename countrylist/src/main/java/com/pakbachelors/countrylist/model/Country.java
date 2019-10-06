package com.pakbachelors.countrylist.model;

import java.io.Serializable;

public class Country implements Serializable {
    private String nameCode;
    private String countryCode;
    private String countryName;
    private int countryImageCode;
    private boolean charW;

    public Country(String nameCode, String countryCode, String countryName, int countryImageCode, boolean charW) {
        this.nameCode = nameCode;
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.countryImageCode = countryImageCode;
        this.charW = charW;

    }

    public String getNameCode() {
        return nameCode;
    }

    public void setNameCode(String nameCode) {
        this.nameCode = nameCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getCountryImageCode() {
        return countryImageCode;
    }

    public void setCountryImageCode(int countryImageCode) {
        this.countryImageCode = countryImageCode;
    }

    public boolean isCharW() {
        return charW;
    }

    public void setCharW(boolean charW) {
        this.charW = charW;
    }

}
