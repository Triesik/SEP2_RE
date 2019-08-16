package domain.mediator.shift;



import domain.model.Date.Date;
import domain.model.shift.Shift;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

public class ShiftManager implements ShiftManagerInterface {

    ShiftsDatabase database;
    Date myDate;

    public ShiftManager()
    {

        this.database = new ShiftsDatabase();

    }

    public void assignShift(int employeeId, String date, String startTime, String endTime, String task) throws Exception
    {
        Random rand = new Random();
        int shiftId = rand.nextInt(999);
        while(checkId(shiftId) == false)
        {
            shiftId = rand.nextInt(999);
        }


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
                String starttime = rs.getString("starttime");
                String endtime = rs.getString("endtime");
                String shiftdate = rs.getString("date");

                // Setting the values
                Shift shift = new Shift();
                shift.setTask(task);
                shift.setemployeeId(employeeid);
                shift.setStartTime(starttime);
                shift.setEndTime(endtime);
                shift.setDate(shiftdate);
                System.out.print(shift.getEmployeeId() + " ");
                list.add(shift);
            }
            givenDate.add(Calendar.DATE, +1);


        }

        return list;
    }

    public ArrayList<Shift> getShiftList() throws Exception
    {
        ArrayList<Shift> list = new ArrayList<>();
        ResultSet rs = database.getShiftList();
        while (rs.next()) {
            int shiftId = rs.getInt("shiftid");
            String startTime = rs.getString("starttime");
            String endTime = rs.getString("endtime");
            String task = rs.getString("task");
            String date = rs.getString("date");

            Shift shift = new Shift();
            shift.setShiftId(shiftId);
            shift.setStartTime(startTime);
            shift.setEndTime(endTime);
            shift.setDate(date);
            shift.setTask(task);
            list.add(shift);
        }
        return list;
    }

    public boolean checkId(int id)
    {
        try {
            ResultSet rs = database.getId(id);
            rs.next();
        } catch (Exception e)
        {
            return false;
        }
        return true;
    }


}
