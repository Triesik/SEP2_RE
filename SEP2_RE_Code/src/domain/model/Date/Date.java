package domain.model.Date;

import java.util.Calendar;

public class Date {

    private int day;
    private int month;
    private int year;
    private int hour;
    private int minute;
    private Calendar givenDate;


    public Date(Calendar rightNow) {
        this.day = (rightNow.get(Calendar.DAY_OF_MONTH));
        this.month = (rightNow.get(Calendar.MONTH)) + 1;
        this.year = (rightNow.get(Calendar.YEAR));
        this.hour = (rightNow.get(Calendar.HOUR_OF_DAY));
        this.minute = (rightNow.get(Calendar.MINUTE));
        this.givenDate = rightNow;
        //rightNow.get(Calendar.)

    }

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }


    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public Calendar getGivenDate()
    {
        return givenDate;
    }

    public int getCurrentWeekDay() {
        Calendar now = Calendar.getInstance();
        int day = now.get(Calendar.DAY_OF_WEEK);

        return day;
    }

    public String toString() {
        String date = year + "-" + month  + "-" + day;
        return date;
    }

    public Calendar getFirstDayOfWeek() {

        Calendar currently = givenDate;
        while (currently.get(Calendar.DAY_OF_WEEK) > currently.getFirstDayOfWeek()) {
            currently.add(Calendar.DATE, -1);
        }

            return currently;

        }

    public String timeToString()
    {
        return getHour() + ":" + getMinute();
    }



}