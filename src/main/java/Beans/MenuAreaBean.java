package Beans;

/*
  Author: Jarcem
  Date: 2019/5/20
  Time: 17:13
  Purpose: 菜单大区
*/

public class MenuAreaBean {
    private int menu_area_id;
    private int menu_area_level;
    private String menu_area_name;

    public int getMenu_area_id() {
        return menu_area_id;
    }

    public void setMenu_area_id(int menu_area_id) {
        this.menu_area_id = menu_area_id;
    }

    public int getMenu_area_level() {
        return menu_area_level;
    }

    public void setMenu_area_level(int menu_area_level) {
        this.menu_area_level = menu_area_level;
    }

    public String getMenu_area_name() {
        return menu_area_name;
    }

    public void setMenu_area_name(String menu_area_name) {
        this.menu_area_name = menu_area_name;
    }
}
