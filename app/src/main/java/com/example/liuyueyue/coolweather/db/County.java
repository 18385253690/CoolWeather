package com.example.liuyueyue.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by liuyueyue on 2017/5/27.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;//县名
    private String weatherId;//县所对应的天气
    private int cityId;//当前城市的id

    public int getId() {
        return id;
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

    public int getCityId(int cityId) {
        return this.cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }


}

