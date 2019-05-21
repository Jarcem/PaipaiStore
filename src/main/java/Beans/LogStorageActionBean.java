package Beans;

/*
  Author: Jarcem
  Date: 2019/5/20
  Time: 20:35
  Purpose: 仓库日志
*/

public class LogStorageActionBean {
    private int log_id;
    private int goods_id;
    private int storage_action;
    private int action_target_store;
    private int action_operator;
    private int action_time;
    private String ip_address;

    public LogStorageActionBean() {
    }

    public int getLog_id() {
        return log_id;
    }

    public void setLog_id(int log_id) {
        this.log_id = log_id;
    }

    public int getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(int goods_id) {
        this.goods_id = goods_id;
    }

    public int getStorage_action() {
        return storage_action;
    }

    public void setStorage_action(int storage_action) {
        this.storage_action = storage_action;
    }

    public int getAction_target_store() {
        return action_target_store;
    }

    public void setAction_target_store(int action_target_store) {
        this.action_target_store = action_target_store;
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
