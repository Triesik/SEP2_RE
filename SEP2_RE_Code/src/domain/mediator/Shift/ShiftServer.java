package domain.model.shifts;

import com.sun.deploy.util.Waiter;
import domain.mediator.Employee.EmployeeDatabase;
import domain.mediator.Employee.EmployeeManager;
import domain.mediator.Employee.EmployeeManagerInterface;


import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

public class ShiftServer extends ShiftManager {
    public ShiftServer() throws Exception {}
    public static void main(String args[]) {

        try {
            ShiftManager obj = new ShiftManager();



            Registry registry= LocateRegistry.createRegistry(1099);
            shiftManagerInterface stub = (shiftManagerInterface) UnicastRemoteObject.exportObject(obj, 1099);
            System.out.println("Registry started...");

            registry.bind("assignShift", stub);
            registry.bind("removeShift", stub);
            registry.bind("editShift", stub);
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