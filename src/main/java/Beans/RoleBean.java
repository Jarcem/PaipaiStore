package Beans;

/*
  Author: Jarcem
  Date: 2019/5/20
  Time: 20:16
  Purpose: 角色
*/

public class RoleBean {
    private int role_id;
    private String role_name;
    private String role_permissions;
    private int role_status;

    public RoleBean() {
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public String getRole_permissions() {
        return role_permissions;
    }

    public void setRole_permissions(String role_permissions) {
        this.role_permissions = role_permissions;
    }

    public int getRole_status() {
        return role_status;
    }

    public void setRole_status(int role_status) {
        this.role_status = role_status;
    }
}
