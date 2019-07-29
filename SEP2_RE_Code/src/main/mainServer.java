import java.io.IOException;

import mediator.



public class MainServer {

    public static void main(String args[]) throws IOException, ClassNotFoundException {
        EmployeeServer employeeServer = new EmployeeServer();
		ShiftServer shiftServer = new ShiftServer();
		

        System.out.println("Server is Started....");
    }

}