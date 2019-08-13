package domain.mediator.employee;


import domain.model.employee.Employee;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Random;


public class EmployeeManager implements EmployeeManagerInterface {

    EmployeeDatabase database;

    public EmployeeManager()
    {

        this.database = new EmployeeDatabase();

    }

    public void addEmployee(String firstName, String lastName, String email, String userType) throws Exception
    {
        String password = generatePassword();
        int employeeId = firstName.length() + userType.length();


        database.addEmployee(employeeId, firstName, lastName, email, password, userType);
    }

    public void removeEmployee(int id) throws Exception
    {
        database.removeEmployee(id);
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

    public String generatePassword()
    {
        String SALTCHARS = "abcdefghijklmnoprstuwxvyz1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 8) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }

    public Employee getOneEmployee(int employeeId) throws Exception
    {
        ResultSet rs = database.getOneEmployee(employeeId);
        rs.next();
        int employeeid = rs.getInt("employeeid");
        String firstName = rs.getString("firstname");
        String lastName = rs.getString("lastname");
        String email = rs.getString(("email"));

        // Setting the values
        Employee employee = new Employee();
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employee.setEamil(email);
        employee.setEmployeeId(employeeid);

        return employee;
    }

    public void editEmployee(int employeeId, String firstName, String lastName, String email, String password) throws Exception
    {
        database.editEmployee(employeeId, firstName, lastName, email, password);
    }


}
