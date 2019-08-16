package domain.mediator.shift;


import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ShiftServer extends ShiftManager implements Runnable {

    @Override
    public void run() {

        try {
            ShiftManager obj = new ShiftManager();



            Registry registry= LocateRegistry.createRegistry(1099);
            ShiftManagerInterface stub = (ShiftManagerInterface) UnicastRemoteObject.exportObject(obj, 1099);
            System.out.println("Registry started...");

            registry.bind("assignShift", stub);
            registry.bind("removeShift", stub);
            registry.bind("editShift", stub);
            registry.bind("getWeekPlan", stub);
            registry.bind("getShiftList", stub);
            System.out.print("server rdy");

        } catch(Exception e)
        {
            System.out.print("not rdy " + e.toString());
            e.printStackTrace();

        }

    }
}