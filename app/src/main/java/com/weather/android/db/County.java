package com.weather.android.db;

import org.litepal.crud.DataSupport;

// 县实体类
public class County extends DataSupport {
    private int id;     // 县id
    private String countyName;  // 县名称
    private String weatherId;   // 天气id
    private int cityId;     // 市id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}