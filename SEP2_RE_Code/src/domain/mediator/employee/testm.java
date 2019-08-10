package domain.mediator.employee;


import client.Client;
import domain.model.employee.Employee;

import java.util.ArrayList;
import java.util.Calendar;

public class testm {

    public static void main(String args[]) throws Exception {

    Client client = new Client();
    EmployeeManager em = new EmployeeManager();
    //client.addEmployee(2, "johny", "wick", "email@mail.dd");
    ArrayList<Employee> list;
    //list = client.getEmployees();
    //System.out.print(list.get(0).getFirstName());
    //System.out.print(em.verifyPassword(1, "12345"));
    //System.out.print(client.verifyPassword(1, "12345"));
        System.out.print(client.isAdmin(1));






    }
}


