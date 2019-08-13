package client;
import domain.mediator.attendance.AttendanceManagerInterface;
import domain.mediator.employee.EmployeeManagerInterface;
import domain.mediator.shift.ShiftManagerInterface;
import domain.model.employee.Employee;
import domain.model.shift.Shift;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.Calendar;

public class Client {


    //----------------------------------------EMPLOYEE-PORT: 1097----------------------------------------------

    public Client() throws Exception {

        Registry registry = LocateRegistry.getRegistry(1098);

    }

    public void addEmployee(int employeeId, String firstName, String lastName, String email, String userType) throws Exception {


        EmployeeManagerInterface stub = (EmployeeManagerInterface) Naming.lookup("rmi://localhost:1097/addEmployee");
        stub.addEmployee(employeeId, firstName, lastName,email, userType);

    }

    public ArrayList<Employee> getEmployees() throws Exception
    {
        EmployeeManagerInterface stub = (EmployeeManagerInterface) Naming.lookup("rmi://localhost:1097/getEmployees");
        ArrayList<Employee> list = stub.getEmployees();
        return list;
    }

    public void removeEmployee(int id) throws Exception
    {
        EmployeeManagerInterface stub = (EmployeeManagerInterface) Naming.lookup("rmi://localhost:1097/removeEmployee");
        stub.removeEmployee(id);
    }

    public boolean verifyPassword(int employeeId, String inputPassword) throws Exception
    {
        EmployeeManagerInterface stub = (EmployeeManagerInterface) Naming.lookup("rmi://localhost:1097/verifyPassword");
        boolean verification = stub.verifyPassword(employeeId, inputPassword);
        return verification;

    }

    public boolean isAdmin(int employeeId) throws Exception
    {
        EmployeeManagerInterface stub = (EmployeeManagerInterface) Naming.lookup("rmi://localhost:1097/isAdmin");
        boolean check = stub.isAdmin(employeeId);
        return check;
    }

    //-------------------------------SHIFTS--PORT:1099----------------------------------------------------------------

    public void assignShift(int employeeId, String date, String startTime, String endTime, String task) throws Exception
    {
        ShiftManagerInterface stub = (ShiftManagerInterface) Naming.lookup("rmi://localhost:1099/assignShift");
        stub.assignShift(employeeId, date, startTime, endTime, task);
    }

    public ArrayList<Shift> getWeekPlan(int employeeId, Calendar date) throws Exception
    {
        ShiftManagerInterface stub = (ShiftManagerInterface) Naming.lookup("rmi://localhost:1099/getWeekPlan");
        ArrayList<Shift> list = stub.getWeekPlan(employeeId, date);
        return list;
    }

    //----------------------------ATTENDANCE--PORT:1098-----------------------------------------------------------------

    public void checkIn(int employeeId) throws Exception
    {
        AttendanceManagerInterface stub = (AttendanceManagerInterface) Naming.lookup("rmi://localhost:1098/checkIn");
        stub.checkIn(employeeId);
    }

    public void checkOut(int employeeId) throws Exception
    {
        AttendanceManagerInterface stub = (AttendanceManagerInterface) Naming.lookup("rmi://localhost:1098/checkOut");
        stub.checkOut(1);
    }

    public boolean getStatus(int employeeId) throws Exception
    {
        AttendanceManagerInterface stub = (AttendanceManagerInterface) Naming.lookup("rmi://localhost:1098/getStatus");
        boolean status = stub.getStatus(employeeId);
        return status;
    }








}
