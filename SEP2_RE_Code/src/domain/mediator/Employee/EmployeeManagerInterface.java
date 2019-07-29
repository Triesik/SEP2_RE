package domain.mediator.Employee;

import java.rmi.Remote;

public interface EmployeeManagerInterface extends Remote {

    public void addEmployee(int employeeId, String firstName, String lastName, String email) throws Exception;
    public void removeEmployee(int employeeId) throws Exception;
    public void editEmployee(int employeeId) throws Exception;

}
