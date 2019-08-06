package domain.mediator.employee;

import domain.model.employee.Employee;

import java.rmi.Remote;
import java.util.ArrayList;

public interface EmployeeManagerInterface extends Remote {

    void addEmployee(int employeeId, String firstName, String lastName, String email) throws Exception;
    void removeEmployee(int employeeId) throws Exception;
    void editEmployee(int employeeId) throws Exception;
    ArrayList<Employee> getEmployees() throws Exception;

}
