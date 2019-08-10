package controller.admin;

import client.Client;
import domain.model.employee.Employee;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;
import view.admin.manageEmployee.manageEmployeeView;

public class manageEmployeeController {
    private manageEmployeeView view;
    private Client client;

    public manageEmployeeController(manageEmployeeView view, Client client) {
        this.view = view;
        this.client = client;
    }


    public ObservableList<Employee> getTableData() throws Exception {
        ObservableList<Employee> employeeList = FXCollections.observableArrayList(client.getEmployees());
        for (Employee employee:employeeList) {
            System.out.println(employee.getFirstName());
        }

        return employeeList;
    }




}
