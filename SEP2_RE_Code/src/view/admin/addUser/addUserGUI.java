package view.admin.addUser;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import controller.admin.addUserController;

public class addUserGUI implements addUserView {
    private addUserController addUserController;
    public TextField txtCPR;
    public TextField txtFirstName;
    public TextField txtLastName;
    public TextField txtMobileNumber;
    public TextField txtEmail;
    public TextField txtPassword;

    public addUserGUI(){
        this.addUserController = new addUserController(this);
        System.out.println("Controller from constructor " + addUserController);
    }



    @Override
    public void start(addUserController controller){

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
        addUserController.addUserBtnPressed();
    }
}
