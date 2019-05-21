package Beans;

/*
  Author: Jarcem
  Date: 2019/5/20
  Time: 16:40
  Purpose: 活动
*/

import java.math.BigDecimal;

public class ActivityBean {
    private int activity_id;
    private int activity_target_store;
    private int activity_target_role;
    private int activity_target_user;
    private int activity_type;
    private BigDecimal activity_discount;
    private int activity_starttime;
    private int activity_endtime;
    private String activity_message;

    public ActivityBean() {
    }

    public int getActivity_id() {
        return activity_id;
    }

    public void setActivity_id(int activity_id) {
        this.activity_id = activity_id;
    }

    public int getActivity_target_store() {
        return activity_target_store;
    }

    public void setActivity_target_store(int activity_target_store) {
        this.activity_target_store = activity_target_store;
    }

    public int getActivity_target_role() {
        return activity_target_role;
    }

    public void setActivity_target_role(int activity_target_role) {
        this.activity_target_role = activity_target_role;
    }

    public int getActivity_target_user() {
        return activity_target_user;
    }

    public void setActivity_target_user(int activity_target_user) {
        this.activity_target_user = activity_target_user;
    }

    public int getActivity_type() {
        return activity_type;
    }

    public void setActivity_type(int activity_type) {
        this.activity_type = activity_type;
    }

    public BigDecimal getActivity_discount() {
        return activity_discount;
    }

    public void setActivity_discount(BigDecimal activity_discount) {
        this.activity_discount = activity_discount;
    }

    public int getActivity_starttime() {
        return activity_starttime;
    }

    public void setActivity_starttime(int activity_starttime) {
        this.activity_starttime = activity_starttime;
    }

    public int getActivity_endtime() {
        return activity_endtime;
    }

    public void setActivity_endtime(int activity_endtime) {
        this.activity_endtime = activity_endtime;
    }

    public String getActivity_message() {
        return activity_message;
    }

    public void setActivity_message(String activity_message) {
        this.activity_message = activity_message;
    }
}
