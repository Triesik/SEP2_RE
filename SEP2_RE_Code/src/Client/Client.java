package domain.mediator.Employee;

import domain.model.employees.Employee;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;

public class Client {


    public Client() throws Exception {

        Registry registry = LocateRegistry.getRegistry(1098);

    }

    public void addEmployee(int employeeId, String firstName, String lastName, String email) throws Exception {


        EmployeeManagerInterface stub = (EmployeeManagerInterface) Naming.lookup("rmi://192.168.1.108:1098/addEmployee");
        stub.addEmployee(employeeId, firstName, lastName,email);

    }

    public ArrayList<Employee> getEmployees() throws Exception
    {
        EmployeeManagerInterface stub = (EmployeeManagerInterface) Naming.lookup("rmi://192.168.1.108:1098/getEmployees");
        ArrayList<Employee> list = stub.getEmployees();
        return list;
    }

    public void removeEmployee(int id) throws Exception
    {
        EmployeeManagerInterface stub = (EmployeeManagerInterface) Naming.lookup("rmi://192.168.1.108:1098/removeEmployee");
        stub.removeEmployee(id);
    }



}
