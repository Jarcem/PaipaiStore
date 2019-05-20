package Beans;

/*
  Author: Jarcem
  Date: 2019/5/20
  Time: 20:34
  Purpose: 订单日志
*/

public class LogOrderActionBean {
    private int log_id;
    private int order_id;
    private int order_action;
    private int action_operator;
    private int action_time;
    private String ip_address;

    public int getLog_id() {
        return log_id;
    }

    public void setLog_id(int log_id) {
        this.log_id = log_id;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getOrder_action() {
        return order_action;
    }

    public void setOrder_action(int order_action) {
        this.order_action = order_action;
    }

    public int getAction_operator() {
        return action_operator;
    }

    public void setAction_operator(int action_operator) {
        this.action_operator = action_operator;
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
