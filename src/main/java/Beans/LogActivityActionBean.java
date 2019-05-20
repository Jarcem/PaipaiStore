package Beans;

/*
  Author: Jarcem
  Date: 2019/5/20
  Time: 20:32
  Purpose: 活动日志
*/

public class LogActivityActionBean {
    private int log_id;
    private int activity_id;
    private int activity_action;
    private int activity_operator;
    private int action_time;
    private String ip_address;

    public int getLog_id() {
        return log_id;
    }

    public void setLog_id(int log_id) {
        this.log_id = log_id;
    }

    public int getActivity_id() {
        return activity_id;
    }

    public void setActivity_id(int activity_id) {
        this.activity_id = activity_id;
    }

    public int getActivity_action() {
        return activity_action;
    }

    public void setActivity_action(int activity_action) {
        this.activity_action = activity_action;
    }

    public int getActivity_operator() {
        return activity_operator;
    }

    public void setActivity_operator(int activity_operator) {
        this.activity_operator = activity_operator;
    }

    public int getAction_time() {
        return action_time;
    }

    public void setAction_time(int action_time) {
        this.action_time = action_time;
    }

    public String getIp_address() {
        return ip_address;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address;
    }
}
