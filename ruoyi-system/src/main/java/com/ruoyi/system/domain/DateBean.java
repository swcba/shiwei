package com.ruoyi.system.domain;/****************************************************
 * 创建人：     @author shiwei1    
 * 创建时间: 2021/3/2/9:55
 * 项目名称：  demo
 * 文件名称: null.java
 * 文件描述: @Description: (用一句话描述该文件做什么)
 *
 * All rights Reserved, Designed By 投资交易团队
 * @Copyright:2016-2021
 *
 ********************************************************/


/**
 * 包名称：com.ruoyi.system.domain
 * 类名称：DateBean
 * 类描述：
 * 创建人：@author shiwei1
 * 创建时间：2021/3/2/9:55
 */

public class DateBean {

    private Integer day;

    private  Integer month;

    private  Integer year;

    public DateBean() {
    }

    public DateBean(Integer day, Integer month, Integer year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "DateBean{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
