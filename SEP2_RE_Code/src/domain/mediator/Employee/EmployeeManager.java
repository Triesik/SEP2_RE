package domain.mediator.Employee;


import java.rmi.Remote;

public class EmployeeManager implements Remote {

    EmployeeDatabase database;

    public EmployeeManager()
    {

        this.database = new EmployeeDatabase();

    }

    public void addEmployee(int employeeId, String firstName, String lastName, String email) throws Exception
    {

        database.addEmployee(employeeId, firstName, lastName, email);
    }

    public void removeEmployee(int id) throws Exception
    {
        database.removeEmployee(id);
    }

    public void editEmployee(int id) throws Exception
    {
        database.editEmployee(id);
    }


}
