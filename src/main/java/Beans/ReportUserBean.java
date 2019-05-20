package Beans;

/*
  Author: Jarcem
  Date: 2019/5/20
  Time: 20:52
  Purpose: 用户报表
*/

import java.math.BigDecimal;

public class ReportUserBean {
    private int report_id;
    private int user_id;
    private BigDecimal user_consumption;
    private BigDecimal user_income;
    private int report_time;

    public int getReport_id() {
        return report_id;
    }

    public void setReport_id(int report_id) {
        this.report_id = report_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public BigDecimal getUser_consumption() {
        return user_consumption;
    }

    public void setUser_consumption(BigDecimal user_consumption) {
        this.user_consumption = user_consumption;
    }

    public BigDecimal getUser_income() {
        return user_income;
    }

    public void setUser_income(BigDecimal user_income) {
        this.user_income = user_income;
    }

    public int getReport_time() {
        return report_time;
    }

    public void setReport_time(int report_time) {
        this.report_time = report_time;
    }
}
