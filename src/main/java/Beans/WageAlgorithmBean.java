package Beans;

/*
  Author: Jarcem
  Date: 2019/5/20
  Time: 20:31
  Purpose: 工资算法
*/

import java.math.BigDecimal;

public class WageAlgorithmBean {
    private int wage_type_id;
    private String wage_unit;
    private BigDecimal wage_unit_price;

    public int getWage_type_id() {
        return wage_type_id;
    }

    public void setWage_type_id(int wage_type_id) {
        this.wage_type_id = wage_type_id;
    }

    public String getWage_unit() {
        return wage_unit;
    }

    public void setWage_unit(String wage_unit) {
        this.wage_unit = wage_unit;
    }

    public BigDecimal getWage_unit_price() {
        return wage_unit_price;
    }

    public void setWage_unit_price(BigDecimal wage_unit_price) {
        this.wage_unit_price = wage_unit_price;
    }
}
