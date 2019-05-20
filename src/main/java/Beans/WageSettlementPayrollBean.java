package Beans;

/*
  Author: Jarcem
  Date: 2019/5/20
  Time: 20:53
  Purpose: 工资结算单
*/

import java.math.BigDecimal;

public class WageSettlementPayrollBean {
    private int wage_settlement_payroll_id;
    private int payroll_employee_id;
    private BigDecimal achievement_point;
    private int wage_algorithm;
    private int payroll_status;
    private BigDecimal total_wage;
    private int wage_time;

    public int getWage_settlement_payroll_id() {
        return wage_settlement_payroll_id;
    }

    public void setWage_settlement_payroll_id(int wage_settlement_payroll_id) {
        this.wage_settlement_payroll_id = wage_settlement_payroll_id;
    }

    public int getPayroll_employee_id() {
        return payroll_employee_id;
    }

    public void setPayroll_employee_id(int payroll_employee_id) {
        this.payroll_employee_id = payroll_employee_id;
    }

    public BigDecimal getAchievement_point() {
        return achievement_point;
    }

    public void setAchievement_point(BigDecimal achievement_point) {
        this.achievement_point = achievement_point;
    }

    public int getWage_algorithm() {
        return wage_algorithm;
    }

    public void setWage_algorithm(int wage_algorithm) {
        this.wage_algorithm = wage_algorithm;
    }

    public int getPayroll_status() {
        return payroll_status;
    }

    public void setPayroll_status(int payroll_status) {
        this.payroll_status = payroll_status;
    }

    public BigDecimal getTotal_wage() {
        return total_wage;
    }

    public void setTotal_wage(BigDecimal total_wage) {
        this.total_wage = total_wage;
    }

    public int getWage_time() {
        return wage_time;
    }

    public void setWage_time(int wage_time) {
        this.wage_time = wage_time;
    }
}
