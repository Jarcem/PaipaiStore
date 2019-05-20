package Beans;

/*
  Author: Jarcem
  Date: 2019/5/20
  Time: 20:50
  Purpose: 商店报表
*/

import java.math.BigDecimal;

public class ReportStoreBean {
    private int report_id;
    private int store_id;
    private BigDecimal store_sales;
    private BigDecimal store_income;
    private BigDecimal store_profit;
    private int report_time;

    public int getReport_id() {
        return report_id;
    }

    public void setReport_id(int report_id) {
        this.report_id = report_id;
    }

    public int getStore_id() {
        return store_id;
    }

    public void setStore_id(int store_id) {
        this.store_id = store_id;
    }

    public BigDecimal getStore_sales() {
        return store_sales;
    }

    public void setStore_sales(BigDecimal store_sales) {
        this.store_sales = store_sales;
    }

    public BigDecimal getStore_income() {
        return store_income;
    }

    public void setStore_income(BigDecimal store_income) {
        this.store_income = store_income;
    }

    public BigDecimal getStore_profit() {
        return store_profit;
    }

    public void setStore_profit(BigDecimal store_profit) {
        this.store_profit = store_profit;
    }

    public int getReport_time() {
        return report_time;
    }

    public void setReport_time(int report_time) {
        this.report_time = report_time;
    }
}
