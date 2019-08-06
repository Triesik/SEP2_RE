package domain.mediator.Employee;

import com.sun.deploy.util.Waiter;
import domain.mediator.Employee.EmployeeDatabase;
import domain.mediator.Employee.EmployeeManager;
import domain.mediator.Employee.EmployeeManagerInterface;


import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

public class EmployeeServer extends EmployeeManager {
    public EmployeeServer() throws Exception {}
    public static void main(String args[]) {

        try {
            EmployeeManager obj = new EmployeeManager();



            Registry registry= LocateRegistry.createRegistry(1098);
            EmployeeManagerInterface stub = (EmployeeManagerInterface) UnicastRemoteObject.exportObject(obj, 1098);
            System.out.println("Registry started...");

            registry.bind("addEmployee", stub);
            registry.bind("removeEmployee", stub);
            registry.bind("editEmployee", stub);
            registry.bind("getEmployees", stub);
            System.out.print("server rdy");

        } catch(Exception e)
        {
            System.out.print("not rdy " + e.toString());
            e.printStackTrace();

        }


        Scanner input = new Scanner(System.in);
        input.nextLine();

    }






}