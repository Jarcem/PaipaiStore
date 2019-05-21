package Beans;

/*
  Author: Jarcem
  Date: 2019/5/20
  Time: 20:41
  Purpose: 工资单报表
*/

import java.math.BigDecimal;

public class ReportPayrollBean {
    private int report_id;
    private BigDecimal payroll_expenditure;
    private int payment_user_id;
    private int settel_time;

    public ReportPayrollBean() {
    }

    public int getReport_id() {
        return report_id;
    }

    public void setReport_id(int report_id) {
        this.report_id = report_id;
    }

    public BigDecimal getPayroll_expenditure() {
        return payroll_expenditure;
    }

    public void setPayroll_expenditure(BigDecimal payroll_expenditure) {
        this.payroll_expenditure = payroll_expenditure;
    }

    public int getPayment_user_id() {
        return payment_user_id;
    }

    public void setPayment_user_id(int payment_user_id) {
        this.payment_user_id = payment_user_id;
    }

    public int getSettel_time() {
        return settel_time;
    }

    public void setSettel_time(int settel_time) {
        this.settel_time = settel_time;
    }
}
