package Beans;

/*
  Author: Jarcem
  Date: 2019/5/20
  Time: 20:38
  Purpose: 商品报表
*/

import java.math.BigDecimal;

public class ReportCommodityBean {
    private int report_id;
    private int commodity_id;
    private int commodity_sales;
    private BigDecimal commodity_income;
    private BigDecimal commodity_profit;
    private int report_time;

    public ReportCommodityBean() {
    }

    public int getReport_id() {
        return report_id;
    }

    public void setReport_id(int report_id) {
        this.report_id = report_id;
    }

    public int getCommodity_id() {
        return commodity_id;
    }

    public void setCommodity_id(int commodity_id) {
        this.commodity_id = commodity_id;
    }

    public int getCommodity_sales() {
        return commodity_sales;
    }

    public void setCommodity_sales(int commodity_sales) {
        this.commodity_sales = commodity_sales;
    }

    public BigDecimal getCommodity_income() {
        return commodity_income;
    }

    public void setCommodity_income(BigDecimal commodity_income) {
        this.commodity_income = commodity_income;
    }

    public BigDecimal getCommodity_profit() {
        return commodity_profit;
    }

    public void setCommodity_profit(BigDecimal commodity_profit) {
        this.commodity_profit = commodity_profit;
    }

    public int getReport_time() {
        return report_time;
    }

    public void setReport_time(int report_time) {
        this.report_time = report_time;
    }
}
