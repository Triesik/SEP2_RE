package view.admin.editUser;

import client.Client;
import controller.admin.editUserController;
import domain.model.employee.Employee;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class editUserGUI implements editUserView {
    public Button btnEditUser;
    private editUserController editUserController;
    public TextField txtId;
    public TextField txtFirstName;
    public TextField txtLastName;
    public TextField txtEmail;
    public TextField txtPassword;
    public Client client;

    public editUserGUI() throws Exception {
        client = new Client();
        this.editUserController = new editUserController(this, client);
    }

    @FXML
    public void initialize() throws Exception{
        editUserController.loadEmployeeValues();
    }

    @Override
    public String getId() {
        return txtId.getText();
    }

    @Override
    public String getFirstName() {
        return txtFirstName.getText();
    }

    @Override
    public String getLastName() {
        return txtLastName.getText();
    }

    @Override
    public String getEmail() {
        return txtEmail.getText();
    }

    @Override
    public String getPassword() {
        return txtPassword.getText();
    }

    public void insertEmployeeValues(Employee employee){
        txtId.setText(Integer.toString(employee.getEmployeeId()));
        txtFirstName.setText(employee.getFirstName());
        txtLastName.setText(employee.getLastName());
        txtEmail.setText(employee.getEmail());
        txtPassword.setText(employee.getPassword());
    }

    public void editUserPressed(ActionEvent actionEvent) throws Exception {
        editUserController.editUserBtnPressed();
    }

    public void closeWindow() {
        Stage stage = (Stage) btnEditUser.getScene().getWindow();
        stage.close();
    }
}
