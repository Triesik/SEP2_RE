package domain.mediator.employee;


import client.Client;
import domain.model.employee.Employee;

import java.util.ArrayList;

public class testm {

    public static void main(String args[]) throws Exception {

    Client client = new Client();
    //client.addEmployee(2, "johny", "wick", "email@mail.dd");
    ArrayList<Employee> list;
    list = client.getEmployees();
    System.out.print(list.get(0).getFirstName());





    }
}


