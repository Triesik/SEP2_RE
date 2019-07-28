package mediator;

import domain.model.employees.worker;

import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import domain.model.employees.worker;


public class ServerEmployeeManager extends UnicastRemoteObject implements RemoteStaffClinicModel {

    //private EmployeeList list;
    private EmployeePersistence persistence;
    private worker worker;

    public ServerStaffClinicModelManager() throws IOException, ClassNotFoundException {
        this.persistence = new EmployeeDatabase();

        Registry reg = LocateRegistry.createRegistry(1099);
        reg.rebind("StaffServer", this);

    }

    public addEmployee()
    {

    }

    protected ServerEmployeeManager() throws RemoteException {
    }
}
