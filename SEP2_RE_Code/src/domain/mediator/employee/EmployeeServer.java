package domain.mediator.employee;


import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

public class EmployeeServer extends EmployeeManager {
    public EmployeeServer() throws Exception {}
    public static void main(String args[]) {

        try {
            EmployeeManager obj = new EmployeeManager();



            Registry registry= LocateRegistry.createRegistry(1097);
            EmployeeManagerInterface stub = (EmployeeManagerInterface) UnicastRemoteObject.exportObject(obj, 1097);
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