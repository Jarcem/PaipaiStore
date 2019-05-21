package Beans;

/*
  Author: Jarcem
  Date: 2019/5/20
  Time: 16:47
  Purpose: 商品
*/

import java.math.BigDecimal;

public class CommodityBean {
    private int commodity_id;
    private int commodity_class;
    private int commodity_barcode;
    private String commodity_image;
    private String commodity_name;
    private String commodity_label;
    private BigDecimal commodity_cost;
    private BigDecimal commodity_price;
    private int commodity_status;
    private String commodity_unit;

    public CommodityBean() {
    }

    public int getCommodity_id() {
        return commodity_id;
    }

    public void setCommodity_id(int commodity_id) {
        this.commodity_id = commodity_id;
    }

    public int getCommodity_class() {
        return commodity_class;
    }

    public void setCommodity_class(int commodity_class) {
        this.commodity_class = commodity_class;
    }

    public int getCommodity_barcode() {
        return commodity_barcode;
    }

    public void setCommodity_barcode(int commodity_barcode) {
        this.commodity_barcode = commodity_barcode;
    }

    public String getCommodity_image() {
        return commodity_image;
    }

    public void setCommodity_image(String commodity_image) {
        this.commodity_image = commodity_image;
    }

    public String getCommodity_name() {
        return commodity_name;
    }

    public void setCommodity_name(String commodity_name) {
        this.commodity_name = commodity_name;
    }

    public String getCommodity_label() {
        return commodity_label;
    }

    public void setCommodity_label(String commodity_label) {
        this.commodity_label = commodity_label;
    }

    public BigDecimal getCommodity_cost() {
        return commodity_cost;
    }

    public void setCommodity_cost(BigDecimal commodity_cost) {
        this.commodity_cost = commodity_cost;
    }

    public BigDecimal getCommodity_price() {
        return commodity_price;
    }

    public void setCommodity_price(BigDecimal commodity_price) {
        this.commodity_price = commodity_price;
    }

    public int getCommodity_status() {
        return commodity_status;
    }

    public void setCommodity_status(int commodity_status) {
        this.commodity_status = commodity_status;
    }

    public String getCommodity_unit() {
        return commodity_unit;
    }

    public void setCommodity_unit(String commodity_unit) {
        this.commodity_unit = commodity_unit;
    }
}
