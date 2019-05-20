package Beans;

/*
  Author: Jarcem
  Date: 2019/5/20
  Time: 20:23
  Purpose: 商店
*/

import java.math.BigDecimal;

public class StoreBean {
    private int store_id;
    private int store_master;
    private String store_name;
    private int store_location;
    private int wage_algorithm;
    private BigDecimal store_share_rate;
    private int store_status;

    public int getStore_id() {
        return store_id;
    }

    public void setStore_id(int store_id) {
        this.store_id = store_id;
    }

    public int getStore_master() {
        return store_master;
    }

    public void setStore_master(int store_master) {
        this.store_master = store_master;
    }

    public String getStore_name() {
        return store_name;
    }

    public void setStore_name(String store_name) {
        this.store_name = store_name;
    }

    public int getStore_location() {
        return store_location;
    }

    public void setStore_location(int store_location) {
        this.store_location = store_location;
    }

    public int getWage_algorithm() {
        return wage_algorithm;
    }

    public void setWage_algorithm(int wage_algorithm) {
        this.wage_algorithm = wage_algorithm;
    }

    public BigDecimal getStore_share_rate() {
        return store_share_rate;
    }

    public void setStore_share_rate(BigDecimal store_share_rate) {
        this.store_share_rate = store_share_rate;
    }

    public int getStore_status() {
        return store_status;
    }

    public void setStore_status(int store_status) {
        this.store_status = store_status;
    }
}
