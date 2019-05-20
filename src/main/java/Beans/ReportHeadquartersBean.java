package Beans;

/*
  Author: Jarcem
  Date: 2019/5/20
  Time: 20:40
  Purpose: 总部报表
*/

import java.math.BigDecimal;

public class ReportHeadquartersBean {
    private int report_id;
    private BigDecimal commodity_sale_total;
    private int business_total;
    private int profit_total;
    private int income_total;
    private int report_time;

    public int getReport_id() {
        return report_id;
    }

    public void setReport_id(int report_id) {
        this.report_id = report_id;
    }

    public BigDecimal getCommodity_sale_total() {
        return commodity_sale_total;
    }

    public void setCommodity_sale_total(BigDecimal commodity_sale_total) {
        this.commodity_sale_total = commodity_sale_total;
    }

    public int getBusiness_total() {
        return business_total;
    }

    public void setBusiness_total(int business_total) {
        this.business_total = business_total;
    }

    public int getProfit_total() {
        return profit_total;
    }

    public void setProfit_total(int profit_total) {
        this.profit_total = profit_total;
    }

    public int getIncome_total() {
        return income_total;
    }

    public void setIncome_total(int income_total) {
        this.income_total = income_total;
    }

    public int getReport_time() {
        return report_time;
    }

    public void setReport_time(int report_time) {
        this.report_time = report_time;
    }
}
