package Beans;

/*
  Author: Jarcem
  Date: 2019/5/20
  Time: 17:07
  Purpose: 地点
*/

public class LocationBean {
    private int location_id;
    private String location_name;
    private String location_coodinate;

    public LocationBean() {
    }

    public int getLocation_id() {
        return location_id;
    }

    public void setLocation_id(int location_id) {
        this.location_id = location_id;
    }

    public String getLocation_name() {
        return location_name;
    }

    public void setLocation_name(String location_name) {
        this.location_name = location_name;
    }

    public String getLocation_coodinate() {
        return location_coodinate;
    }

    public void setLocation_coodinate(String location_coodinate) {
        this.location_coodinate = location_coodinate;
    }
}
