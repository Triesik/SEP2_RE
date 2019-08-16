package domain.mediator.employee;


import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class EmployeeServer extends EmployeeManager implements Runnable {

    @Override
    public void run() {

        try {
            EmployeeManager obj = new EmployeeManager();

            Registry registry= LocateRegistry.createRegistry(1097);
            EmployeeManagerInterface stub = (EmployeeManagerInterface) UnicastRemoteObject.exportObject(obj, 1097);
            System.out.println("Registry started...");

            registry.bind("addEmployee", stub);
            registry.bind("removeEmployee", stub);
            registry.bind("getEmployees", stub);
            registry.bind("verifyPassword", stub);
            registry.bind("isAdmin", stub);
            registry.bind("getOneEmployee", stub);
            registry.bind("editEmployee", stub);
            registry.bind("checkEmail", stub);
            System.out.print("server rdy");

        } catch(Exception e)
        {
            System.out.print("not rdy " + e.toString());
            e.printStackTrace();

        }


    }
}