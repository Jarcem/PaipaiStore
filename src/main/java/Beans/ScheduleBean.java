package Beans;

/*
  Author: Jarcem
  Date: 2019/5/20
  Time: 20:18
  Purpose:排班表
*/

public class ScheduleBean {
    private int schdule_id;
    private int target_store;
    private int delivery_id;
    private int schdule_work_time;

    public ScheduleBean() {
    }

    public int getSchdule_id() {
        return schdule_id;
    }

    public void setSchdule_id(int schdule_id) {
        this.schdule_id = schdule_id;
    }

    public int getTarget_store() {
        return target_store;
    }

    public void setTarget_store(int target_store) {
        this.target_store = target_store;
    }

    public int getDelivery_id() {
        return delivery_id;
    }

    public void setDelivery_id(int delivery_id) {
        this.delivery_id = delivery_id;
    }

    public int getSchdule_work_time() {
        return schdule_work_time;
    }

    public void setSchdule_work_time(int schdule_work_time) {
        this.schdule_work_time = schdule_work_time;
    }
}
