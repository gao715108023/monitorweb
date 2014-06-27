package com.gcj.bean;

/**
 * Created by gaochuanjun on 14-5-13.
 */
public class HighChartBean {

    private long updateTime;

    private String value;

    public HighChartBean(long updateTime, String value) {
        this.updateTime = updateTime;
        this.value = value;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public String getValue() {
        return value;
    }
}
