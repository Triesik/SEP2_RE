package domain.mediator.employee;


import client.Client;
import domain.model.employee.Employee;

public class testm {

    public static void main(String args[]) throws Exception {

    Client client = new Client();
    Employee employee = client.getOneEmployee(4);
    System.out.print(employee.getFirstName());
    client.editEmployee(4, "ludy", "shwartz", "aa@ff.dd", "kjk1212");
    employee = client.getOneEmployee(4);
    System.out.print(employee.getFirstName());






    }
}


