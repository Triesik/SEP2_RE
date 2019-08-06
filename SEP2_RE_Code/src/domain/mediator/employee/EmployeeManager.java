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

    public void addEmployee(int employeeId, String firstName, String lastName, String email) throws Exception
    {
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        String password = new String(array, Charset.forName("UTF-8"));

        System.out.println(password);


        database.addEmployee(employeeId, firstName, lastName, email, password);
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
            int id = rs.getInt("employeeid");
            String firstName = rs.getString("firstname");
            String lastName = rs.getString("lastname");

            // Setting the values
            Employee employee = new Employee();
            employee.setFirstName(firstName);
            employee.setLastName(lastName);
            list.add(employee);
        }
        return list;
    }

}
