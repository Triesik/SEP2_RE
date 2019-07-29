package domain.model.shifts;

import java.time.Year;

public class Shift {

    private int shiftId;
    private int employeeId;
    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;
    private int startTime;
    private int endTime;
    String task;

    public Shift(int employeeId, int year, int month, int day, int hour, int minute, int startTime, int endTime, String task)
    {
        this.employeeId = employeeId;
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.startTime = startTime;
        this.endTime = endTime;
        this.task = task;
    }

    public void setShiftId(int shiftId){this.shiftId = shiftId;}

    public void setemployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) { this.minute = minute;}

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public void setTask(String task) {
        this.task = task;
    }


    public int getShiftId(){return shiftId;}

    public int getEmployeeId() {
        return employeeId;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getHour() { return hour;}


    public int getMinute() {
        return minute;
    }

    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public String getTask() {
        return task;
    }

}
