package domain.mediator.employee;


import domain.model.employee.Employee;

import java.nio.charset.Charset;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Random;

public class EmployeeManager implements EmployeeManagerInterface {

    EmployeeDatabase database;

    public EmployeeManager()
    {

        this.database = new EmployeeDatabase();

    }

    public void addEmployee(int employeeId, String firstName, String lastName, String email, String userType) throws Exception
    {
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        String password = new String(array, Charset.forName("UTF-8"));

        System.out.println(password);


        database.addEmployee(employeeId, firstName, lastName, email, password, userType);
    }

    public void removeEmployee(int id) throws Exception
    {
        database.removeEmployee(id);
    }

    public void editEmployee(int id) throws Exception
    {
        database.editEmployee(id);
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

    public boolean isAdmin(int employeeId) throws Exception
    {
        ResultSet rs = database.getUserType(employeeId);
        rs.next();
        String userType = rs.getString("usertype");


        if(userType.equals("admin"))
        {
            return true;
        }

        return false;

    }

}
