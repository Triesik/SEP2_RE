package domain.mediator.employee;

import domain.model.employee.Employee;

import java.rmi.Remote;
import java.util.ArrayList;

public interface EmployeeManagerInterface extends Remote {

    void addEmployee(String firstName, String lastName, String email, String userType) throws Exception;
    void removeEmployee(int employeeId) throws Exception;
    ArrayList<Employee> getEmployees() throws Exception;
    boolean verifyPassword(int employeeId, String inputPassword) throws Exception;
    boolean isAdmin(int employeeId) throws Exception;
    Employee getOneEmployee(int employeeId) throws Exception;
    void editEmployee(int employeeId, String firstName, String lastName, String email, String password) throws Exception;
    boolean checkEmail(String email) throws Exception;

}
