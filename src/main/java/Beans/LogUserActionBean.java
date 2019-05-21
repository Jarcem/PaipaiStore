package Beans;

/*
  Author: Jarcem
  Date: 2019/5/20
  Time: 20:37
  Purpose: 用户行为日志
*/

public class LogUserActionBean {
    private int log_id;
    private int user_id;
    private int action_type;
    private String ip_address;

    public LogUserActionBean() {
    }

    public int getLog_id() {
        return log_id;
    }

    public void setLog_id(int log_id) {
        this.log_id = log_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getAction_type() {
        return action_type;
    }

    public void setAction_type(int action_type) {
        this.action_type = action_type;
    }

    public String getIp_address() {
        return ip_address;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address;
    }
}
