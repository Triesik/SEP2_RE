package view.admin.editUser;

import controller.admin.editUserController;
import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class editUserGUI implements editUserView {
    private editUserController editUserController;
    public TextField txtCPR;
    public TextField txtFirstName;
    public TextField txtLastName;
    public TextField txtMobileNumber;
    public TextField txtEmail;
    public TextField txtPassword;
    public CheckBox tickMakeAsAdmin;

    public editUserGUI() {
        this.editUserController = new editUserController(this);
    }

    @Override
    public String getCPR() {
        return txtCPR.getText();
    }

    public String getFirstName() {
        return txtFirstName.getText();
    }

    @Override
    public String getLastName() {
        return txtLastName.getText();
    }

    @Override
    public String getMobileNumber() {
        return txtMobileNumber.getText();
    }

    @Override
    public String getEmail() {
        return txtEmail.getText();
    }

    @Override
    public String getPassword() {
        return txtPassword.getText();
    }

    public void editUserPressed(ActionEvent actionEvent) {
        editUserController.editUserBtnPressed();
    }
}
