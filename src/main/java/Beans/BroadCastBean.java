package Beans;

/*
  Author: Jarcem
  Date: 2019/5/20
  Time: 16:45
  Purpose: 广播
*/

public class BroadCastBean {
    private int broadcast_id;
    private int broadcast_mode;
    private int broadcast_target_id;

    public BroadCastBean() {
    }

    public int getBroadcast_id() {
        return broadcast_id;
    }

    public void setBroadcast_id(int broadcast_id) {
        this.broadcast_id = broadcast_id;
    }

    public int getBroadcast_mode() {
        return broadcast_mode;
    }

    public void setBroadcast_mode(int broadcast_mode) {
        this.broadcast_mode = broadcast_mode;
    }

    public int getBroadcast_target_id() {
        return broadcast_target_id;
    }

    public void setBroadcast_target_id(int broadcast_target_id) {
        this.broadcast_target_id = broadcast_target_id;
    }
}
