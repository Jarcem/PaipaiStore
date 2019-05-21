package Beans;

/*
  Author: Jarcem
  Date: 2019/5/20
  Time: 20:13
  Purpose: 权限
*/

public class PermissionsBean {
    private int permissions_id;
    private String permissions_info;

    public PermissionsBean() {
    }

    public int getPermissions_id() {
        return permissions_id;
    }

    public void setPermissions_id(int permissions_id) {
        this.permissions_id = permissions_id;
    }

    public String getPermissions_info() {
        return permissions_info;
    }

    public void setPermissions_info(String permissions_info) {
        this.permissions_info = permissions_info;
    }
}
