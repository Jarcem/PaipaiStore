package Beans;

/*
  Author: Jarcem
  Date: 2019/5/20
  Time: 20:19
  Purpose: 班次时间段
*/

import java.math.BigDecimal;

public class ScheduleWorkTimeBean {
    private int schedule_work_time_id;
    private int schedule_year;
    private int week_number;
    private int weekday;
    private BigDecimal work_time;

    public int getSchedule_work_time_id() {
        return schedule_work_time_id;
    }

    public void setSchedule_work_time_id(int schedule_work_time_id) {
        this.schedule_work_time_id = schedule_work_time_id;
    }

    public int getSchedule_year() {
        return schedule_year;
    }

    public void setSchedule_year(int schedule_year) {
        this.schedule_year = schedule_year;
    }

    public int getWeek_number() {
        return week_number;
    }

    public void setWeek_number(int week_number) {
        this.week_number = week_number;
    }

    public int getWeekday() {
        return weekday;
    }

    public void setWeekday(int weekday) {
        this.weekday = weekday;
    }

    public BigDecimal getWork_time() {
        return work_time;
    }

    public void setWork_time(BigDecimal work_time) {
        this.work_time = work_time;
    }
}
