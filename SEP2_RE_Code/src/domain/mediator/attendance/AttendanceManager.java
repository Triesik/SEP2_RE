package domain.mediator.attendance;


import domain.model.Date.Date;
import domain.model.employee.Employee;

import java.sql.ResultSet;
import java.util.ArrayList;
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

        String startDate = date.toString();
        String startTime = date.timeToString();
        String shiftId = (Integer.toString(date.getDay()) + Integer.toString(date.getMonth()) + Integer.toString(date.getYear()) + Integer.toString(date.getHour()) + Integer.toString(date.getMinute()) + Integer.toString(date.getMinute()) + employeeId);

        database.setStatus(employeeId, shiftId);
        database.checkIn(employeeId, shiftId, startDate, startTime);
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



    public void removeEntry(int shiftId) throws Exception
    {
        database.removeEntry(shiftId);
    }


    public ArrayList getEmployees() throws Exception {
        ArrayList<Employee> list = new ArrayList<>();
        ResultSet rs = database.getEmployees();
        while (rs.next()) {
            // Retrieve by column name
            int employeeId = rs.getInt("employeeid");
            String firstName = rs.getString("firstname");
            String lastName = rs.getString("lastname");
            String email = rs.getString(("email"));

            // Setting the values
            Employee employee = new Employee();
            employee.setFirstName(firstName);
            employee.setLastName(lastName);
            employee.setEamil(email);
            employee.setEmployeeId(employeeId);
            list.add(employee);
        }
        return list;
    }

    public boolean verifyPassword(int employeeId, String inputPassword) throws Exception
    {
        ResultSet rs = database.getPassword(employeeId);
        rs.next();
        String password = rs.getString("password");


        if(password.equals(inputPassword))
        {
            return true;
        }
        return false;
    }

    public boolean getStatus(int employeeId) throws Exception
    {
        ResultSet rs = database.getStatus(employeeId);
        rs.next();
        String status = rs.getString("status");


        if(status.equals("nonactive"))
        {
            return false;
        }

        return true;

    }






}
