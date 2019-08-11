package domain.mediator.attendance;


import domain.model.Date.Date;
import domain.model.employee.Employee;

import java.rmi.Remote;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;


public class AttendanceManager implements AttendanceManagerInterface {

    AttendanceDatabase database;
    Date date;

    public AttendanceManager()
    {

        this.database = new AttendanceDatabase();

    }

    public void checkIn(int employeeId) throws Exception
    {
        date = new Date(Calendar.getInstance());

        String startDate = date.toString();
        String startTime = date.timeToString();
        int shiftId = employeeId + date.getDay() + date.getMonth() + date.getYear();

        database.setStatus(employeeId, true);
        database.checkIn(employeeId, shiftId, startDate, startTime);
    }

    public void checkOut(int shiftid)



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


        if(status.equals("true"))
        {
            return true;
        }

        return false;

    }






}
