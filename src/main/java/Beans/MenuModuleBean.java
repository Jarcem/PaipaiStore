package Beans;

/*
  Author: Jarcem
  Date: 2019/5/20
  Time: 17:17
  Purpose: 菜单模块
*/

public class MenuModuleBean {
    private int menu_module_id;
    private int menu_area_id;
    private String menu_module_name;
    private int menu_module_permissions_id;

    public int getMenu_module_id() {
        return menu_module_id;
    }

    public void setMenu_module_id(int menu_module_id) {
        this.menu_module_id = menu_module_id;
    }

    public int getMenu_area_id() {
        return menu_area_id;
    }

    public void setMenu_area_id(int menu_area_id) {
        this.menu_area_id = menu_area_id;
    }

    public String getMenu_module_name() {
        return menu_module_name;
    }

    public void setMenu_module_name(String menu_module_name) {
        this.menu_module_name = menu_module_name;
    }

    public int getMenu_module_permissions_id() {
        return menu_module_permissions_id;
    }

    public void setMenu_module_permissions_id(int menu_module_permissions_id) {
        this.menu_module_permissions_id = menu_module_permissions_id;
    }
}
