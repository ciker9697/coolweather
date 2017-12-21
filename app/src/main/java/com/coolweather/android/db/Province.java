package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/12/21 0021.
 */

public class Province extends DataSupport{
    private int id;
    private int provinceCode;
    private String provinceName;
    public int getId(){
        return  id;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setProvinceName(String provinceName){
        this.provinceName = provinceName;
    }
    public String getProvinceName(){
        return provinceName;
    }
    public void setProvinceCode(int provinceCode){
        this.provinceCode = provinceCode;
    }
    public int getProvinceCode(){
        return provinceCode;
    }
}
