package Beans;

/*
  Author: Jarcem
  Date: 2019/5/20
  Time: 20:21
  Purpose: 仓库
*/

import java.math.BigDecimal;

public class StorageBean {
    private int storage_info_id;
    private int goods_id;
    private BigDecimal goods_num;
    private int goods_target_store;
    private int goods_status;
    private BigDecimal storage_warning_threshold;
    private int storage_warning_switch;

    public StorageBean() {
    }

    public int getStorage_info_id() {
        return storage_info_id;
    }

    public void setStorage_info_id(int storage_info_id) {
        this.storage_info_id = storage_info_id;
    }

    public int getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(int goods_id) {
        this.goods_id = goods_id;
    }

    public BigDecimal getGoods_num() {
        return goods_num;
    }

    public void setGoods_num(BigDecimal goods_num) {
        this.goods_num = goods_num;
    }

    public int getGoods_target_store() {
        return goods_target_store;
    }

    public void setGoods_target_store(int goods_target_store) {
        this.goods_target_store = goods_target_store;
    }

    public int getGoods_status() {
        return goods_status;
    }

    public void setGoods_status(int goods_status) {
        this.goods_status = goods_status;
    }

    public BigDecimal getStorage_warning_threshold() {
        return storage_warning_threshold;
    }

    public void setStorage_warning_threshold(BigDecimal storage_warning_threshold) {
        this.storage_warning_threshold = storage_warning_threshold;
    }

    public int getStorage_warning_switch() {
        return storage_warning_switch;
    }

    public void setStorage_warning_switch(int storage_warning_switch) {
        this.storage_warning_switch = storage_warning_switch;
    }
}
