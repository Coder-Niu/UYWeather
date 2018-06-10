package com.uy.uyweather.db;

import org.litepal.crud.LitePalSupport;

public class Province extends LitePalSupport {

    private int mId;
    private String mProvinceName;
    private int mProvinceCode;

    public int getmId() {
        return mId;
    }

    public void setmId(int Id) {
        this.mId = Id;
    }

    public String getmProvinceName() {
        return mProvinceName;
    }

    public void setmProvinceName(String ProvinceName) {
        this.mProvinceName = ProvinceName;
    }

    public int getmProvinceCode() {
        return mProvinceCode;
    }

    public void setmProvinceCode(int ProvinceCode) {
        this.mProvinceCode = ProvinceCode;
    }
}
