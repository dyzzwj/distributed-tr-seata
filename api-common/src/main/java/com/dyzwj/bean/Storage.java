package com.dyzwj.bean;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName Storage.java
 * @Description TODO
 * @createTime 2020年08月18日 17:59:00
 */
public class Storage {

    private int id;
    private String commodityCode;
    private int totalCount;
    private int count;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCommodityCode() {
        return commodityCode;
    }

    public void setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
