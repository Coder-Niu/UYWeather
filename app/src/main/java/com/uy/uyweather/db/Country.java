package com.uy.uyweather.db;

import org.litepal.crud.LitePalSupport;

public class Country extends LitePalSupport {

    private int mId;
    private String mCountryName;
    private int mWeatherId;
    private int mCityId;

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getmCountryName() {
        return mCountryName;
    }

    public void setmCountryName(String mCountryName) {
        this.mCountryName = mCountryName;
    }

    public int getmWeatherId() {
        return mWeatherId;
    }

    public void setmWeatherId(int mWeatherId) {
        this.mWeatherId = mWeatherId;
    }

    public int getmCityId() {
        return mCityId;
    }

    public void setmCityId(int mCityId) {
        this.mCityId = mCityId;
    }
}
