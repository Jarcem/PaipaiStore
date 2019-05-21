package Beans;

/*
  Author: Jarcem
  Date: 2019/5/20
  Time: 16:56
  Purpose: 商品分类
*/

public class CommodityClassBean {
    private int commodity_class_id;
    private String class_image;
    private String class_name;
    private int class_status;

    public CommodityClassBean() {
    }

    public int getCommodity_class_id() {
        return commodity_class_id;
    }

    public void setCommodity_class_id(int commodity_class_id) {
        this.commodity_class_id = commodity_class_id;
    }

    public String getClass_image() {
        return class_image;
    }

    public void setClass_image(String class_image) {
        this.class_image = class_image;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public int getClass_status() {
        return class_status;
    }

    public void setClass_status(int class_status) {
        this.class_status = class_status;
    }
}
