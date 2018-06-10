package com.uy.uyweather.db;

import org.litepal.crud.LitePalSupport;

public class City extends LitePalSupport {

    private int mId;
    private String mCityName;
    private int mCityCode;
    private int mProvinceId;

    public int getmId() {
        return mId;
    }

    public void setmId(int id) {
        this.mId = id;
    }

    public String getmCityName() {
        return mCityName;
    }

    public void setmCityName(String cityName) {
        this.mCityName = cityName;
    }

    public int getmCityCode() {
        return mCityCode;
    }

    public void setmCityCode(int cityCode) {
        this.mCityCode = cityCode;
    }

    public int getmProvinceId() {
        return mProvinceId;
    }

    public void setmProvinceId(int provinceId) {
        this.mProvinceId = provinceId;
    }
}
