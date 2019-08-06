package client;
import domain.mediator.Employee.EmployeeManagerInterface;
import domain.mediator.Shifts.ShiftManagerInterface;

import domain.model.employees.Employee;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;

public class Client {


    //----------------------------------------EMPLOYEE-----------------------------------------------

    public Client() throws Exception {

        Registry registry = LocateRegistry.getRegistry(1098);

    }

    public void addEmployee(int employeeId, String firstName, String lastName, String email) throws Exception {


        EmployeeManagerInterface stub = (EmployeeManagerInterface) Naming.lookup("rmi://192.168.43.80:1098/addEmployee");
        stub.addEmployee(employeeId, firstName, lastName,email);

    }

    public ArrayList<Employee> getEmployees() throws Exception
    {
        EmployeeManagerInterface stub = (EmployeeManagerInterface) Naming.lookup("rmi://192.168.43.80:1098/getEmployees");
        ArrayList<Employee> list = stub.getEmployees();
        return list;
    }

    public void removeEmployee(int id) throws Exception
    {
        EmployeeManagerInterface stub = (EmployeeManagerInterface) Naming.lookup("rmi://192.168.43.80:1098/removeEmployee");
        stub.removeEmployee(id);
    }

    //-------------------------------SHIFTS------------------------------------------------------------------

    public void assignShift(int shiftId, int employeeId, int date, int startTime, int endTime, String task) throws Exception
    {
        ShiftManagerInterface stub = (ShiftManagerInterface) Naming.lookup("rmi://192.168.43.80:1098/getEmployees");
        stub.assignShift(shiftId, employeeId, date, startTime, endTime, task);
    }







}
