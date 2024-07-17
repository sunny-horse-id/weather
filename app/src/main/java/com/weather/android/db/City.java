package com.weather.android.db;

import org.litepal.crud.DataSupport;

// 市实体类
public class City extends DataSupport {
    private int id;     // 市id
    private String CityName;    // 市名称
    private int cityCode;   // 市代号
    private int provinceId;     // 省id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String cityName) {
        CityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}