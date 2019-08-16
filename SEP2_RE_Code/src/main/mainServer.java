package main;

import domain.mediator.attendance.AttendanceServer;
import domain.mediator.employee.EmployeeServer;
import domain.mediator.shift.ShiftServer;

public class mainServer {


    public static void main(String args[]) throws Exception {

        Thread thread1 = new Thread(new EmployeeServer());
        thread1.start();
        Thread thread2 = new Thread((new AttendanceServer()));
        thread2.start();
        Thread thread3 = new Thread((new ShiftServer()));
        thread3.start();

    }

}