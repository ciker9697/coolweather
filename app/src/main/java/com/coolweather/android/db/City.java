package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/12/21 0021.
 */

public class City extends DataSupport{
    private int id;
    private int cityCode;
    private String cityName;
    private int provinceId;
    public int getId(){
        return  id;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setCityName(String cityName){
        this.cityName = cityName;
    }
    public String getCityName(){
        return cityName;
    }
    public void setCityCode(int cityCode){
        this.cityCode = cityCode;
    }
    public int getCityCode(){
        return cityCode;
    }
    public void setProvinceId(int provinceId){
        this.provinceId = provinceId;
    }
    public int getProvinceId(){
        return provinceId;
    }
}
