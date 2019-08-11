package domain.mediator.employee;


import client.Client;
import domain.model.employee.Employee;

import java.util.ArrayList;

public class testm {

    public static void main(String args[]) throws Exception {

    Client client = new Client();
    EmployeeManager em = new EmployeeManager();
    client.removeEmployee(4);
    client.addEmployee(4, "erik", "smith", "xddd@aaaa.dk", "user");
    ArrayList<Employee> list;
    //list = client.getEmployees();
    //System.out.print(list.get(0).getFirstName());
    //System.out.print(em.verifyPassword(1, "12345"));
    //System.out.print(client.verifyPassword(1, "12345"));
        System.out.print(client.isAdmin(4));






    }
}


