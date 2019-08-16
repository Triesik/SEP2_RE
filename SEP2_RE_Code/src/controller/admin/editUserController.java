package controller.admin;

import client.Client;
import domain.model.employee.Employee;
import domain.model.employeeMenuSelection.employeeMenuSelection;
import javafx.scene.control.Alert;
import view.admin.editUser.editUserView;

public class editUserController {

    private editUserView view;
    public Client client;

    public editUserController(editUserView view, Client client) {
        this.view = view;
        this.client = client;
    }

    public void loadEmployeeValues() throws Exception {
        Employee employee = client.getOneEmployee(employeeMenuSelection.getId());
        view.insertEmployeeValues(employee);
    }

    public void editUserBtnPressed() throws Exception {
        System.out.println("Edit button pressed");
        if (client.checkEmail(view.getEmail())) {
            client.editEmployee(Integer.parseInt(view.getId()), view.getFirstName(), view.getLastName(), view.getEmail(), view.getPassword());
            view.closeWindow();
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Error");
            alert.setHeaderText("User already exists!");
            alert.setContentText("Please try again");

            alert.showAndWait();
        }
    }
}
