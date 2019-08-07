package domain.mediator.shift;



import java.rmi.Remote;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;

import domain.model.shift.*;
import domain.model.Date.Date;

public class ShiftManager implements ShiftManagerInterface {

    ShiftsDatabase database;
    Date myDate;

    public ShiftManager()
    {

        this.database = new ShiftsDatabase();

    }

    public void assignShift(int shiftId, int employeeId, int date, int startTime, int endTime, String task) throws Exception
    {

        database.assignShift(shiftId, employeeId, date, startTime, endTime, task);
    }

    public void removeShift(int shiftId) throws Exception
    {
        database.removeShift(shiftId);
    }

    public void editShift(int shiftId) throws Exception
    {
        database.editShift(shiftId);
    }



    public ArrayList<Shift> getWeekPlan(int employeeId, Calendar inputDate) throws Exception
    {
        ArrayList<Shift> list = new ArrayList<>();
        Calendar givenDate;
        Date date = new Date(inputDate);
        givenDate = date.getFirstDayOfWeek();

        for(int i = 0; i < 7; i++)
        {
            Date newDate = new Date(givenDate);
            ResultSet rs = database.getWeekPlan(employeeId, newDate.toString());
            while (rs.next()) {
                // Retrieve by column name
                String task = rs.getString("task");
                int employeeid = rs.getInt("employeeid");
                int starttime = rs.getInt("starttime");
                String shiftdate = rs.getString("date");

                // Setting the values
                Shift shift = new Shift();
                shift.setTask(task);
                shift.setemployeeId(employeeid);
                shift.setStartTime(starttime);
                shift.setDate(shiftdate);
                System.out.print(shift.getEmployeeId() + " ");
                list.add(shift);
            }
            givenDate.add(Calendar.DATE, +1);


        }

        return list;
    }


}
