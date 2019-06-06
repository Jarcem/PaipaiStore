package Beans;

/*
  Author: Jarcem
  Date: 2019/5/23
  Time: 18:07
  Purpose: 头部大图
*/

public class BannerBean {
    private int banner_id;
    private String banner_img;

    public BannerBean() {
    }

    public int getBanner_id() {
        return banner_id;
    }

    public void setBanner_id(int banner_id) {
        this.banner_id = banner_id;
    }

    public String getBanner_img() {
        return banner_img;
    }

    public void setBanner_img(String banner_img) {
        this.banner_img = banner_img;
    }
}
