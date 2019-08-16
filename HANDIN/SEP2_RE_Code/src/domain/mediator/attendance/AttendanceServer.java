package domain.mediator.attendance;


import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class AttendanceServer extends AttendanceManager implements Runnable {

    public void run() {
        try {
            AttendanceManager obj = new AttendanceManager();



            Registry registry= LocateRegistry.createRegistry(1098);
            AttendanceManagerInterface stub = (AttendanceManagerInterface) UnicastRemoteObject.exportObject(obj, 1098);
            System.out.println("Registry started...");

            registry.bind("checkIn", stub);
            registry.bind("checkOut", stub);
            registry.bind("removeEntry", stub);
            registry.bind("getStatus", stub);
            System.out.print("server rdy");

        } catch(Exception e)
        {
            System.out.print("not rdy " + e.toString());
            e.printStackTrace();

        }

    }
}