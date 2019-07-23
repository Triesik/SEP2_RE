package view.admin.addUser;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import controller.admin.addUserController;

public class addUserGUI implements addUserView {
    public addUserController addUserController;
    public TextField txtCPR;
    public TextField txtFirstName;
    public TextField txtLastName;
    public TextField txtMobileNumber;
    public TextField txtEmail;
    public TextField txtPassword;


    @Override
    public void start(addUserController controller){
        this.addUserController = controller;
    }


    @Override
    public String[] getTextFieldValues() {
        String CPR = txtCPR.getText();
        String firstName = txtFirstName.getText();
        String lastName = txtLastName.getText();
        String mobileNumber = txtMobileNumber.getText();
        String email = txtEmail.getText();
        String password = txtPassword.getText();

        return new String[]{CPR, firstName, lastName, mobileNumber, email, password};
    }

    public void addUserPressed(ActionEvent actionEvent) {
        System.out.println("Button pressed, not sent to controller yet");
            addUserController.addUserBtnPressed();
    }
}
