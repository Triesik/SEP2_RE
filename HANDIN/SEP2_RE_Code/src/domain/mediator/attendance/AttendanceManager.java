package domain.mediator.attendance;


import domain.model.Date.Date;

import java.sql.ResultSet;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;


public class AttendanceManager implements AttendanceManagerInterface {

    AttendanceDatabase database;
    Date date;

    public AttendanceManager()
    {

        this.database = new AttendanceDatabase();

    }

    public void checkIn(int employeeId) throws Exception
    {
        TimeUnit.SECONDS.sleep(1);
        date = new Date(Calendar.getInstance());

        if(getStatus(employeeId) == false) {
            String startDate = date.toString();
            String startTime = date.timeToString();
            String shiftId = (Integer.toString(date.getDay()) + Integer.toString(date.getMonth()) + Integer.toString(date.getYear()) + Integer.toString(date.getHour()) + Integer.toString(date.getMinute()) + Integer.toString(date.getMinute()) + employeeId);
            database.setStatus(employeeId, shiftId);
            database.checkIn(employeeId, shiftId, startDate, startTime);
        }
    }

    public void checkOut(int employeeId) throws Exception
    {
        date = new Date(Calendar.getInstance());

        String endDate = date.toString();
        String endTime = date.timeToString();
        ResultSet rs = database.getStatus(employeeId);
        rs.next();
        String status = rs.getString("status");
        database.checkOut(status, endDate, endTime);
        database.setStatus(employeeId, "nonactive");
    }




    public boolean getStatus(int employeeId) throws Exception
    {
        ResultSet rs = database.getStatus(employeeId);
        rs.next();
        String status = rs.getString("status");
        rs.close();


        if(status.equals("nonactive"))
        {
            return false;
        }

        return true;

    }






}
