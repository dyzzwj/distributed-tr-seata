package com.dyzwj.bean;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName Account.java
 * @Description TODO
 * @createTime 2020年08月18日 17:58:00
 */
public class Account {

    private int id;
    private int userId;

    private int totalMoney;

    private int money;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(int totalMoney) {
        this.totalMoney = totalMoney;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
