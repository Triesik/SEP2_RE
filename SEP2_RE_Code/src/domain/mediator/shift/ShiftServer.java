package domain.mediator.shift;


import domain.mediator.shift.*;


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
            ShiftManagerInterface stub = (ShiftManagerInterface) UnicastRemoteObject.exportObject(obj, 1099);
            System.out.println("Registry started...");

            registry.bind("assignShift", stub);
            registry.bind("removeShift", stub);
            registry.bind("editShift", stub);
            registry.bind("getWeekPlan", stub);
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