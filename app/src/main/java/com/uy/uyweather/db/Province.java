package com.uy.uyweather.db;

import org.litepal.crud.LitePalSupport;

public class Province extends LitePalSupport {

    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int Id) {
        this.id = Id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String ProvinceName) {
        this.provinceName = ProvinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int ProvinceCode) {
        this.provinceCode = ProvinceCode;
    }
}
