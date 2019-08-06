package main;

import java.io.IOException;

import domain.mediator.employee.*;
import domain.mediator.shift.*;



public class mainServer {

    public static void main(String args[]) throws Exception {
        EmployeeServer employeeServer = new EmployeeServer();
		ShiftServer shiftServer = new ShiftServer();
		

        System.out.println("Server is Started....");
    }

}