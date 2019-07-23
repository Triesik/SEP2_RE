package view.admin.addUser;

import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import controller.admin.addUserController;

public class addUserGUI implements addUserView {
    public CheckBox tickMakeAsAdmin;
    private addUserController addUserController;
    public TextField txtCPR;
    public TextField txtFirstName;
    public TextField txtLastName;
    public TextField txtMobileNumber;
    public TextField txtEmail;
    public TextField txtPassword;

    public addUserGUI(){
        // For future reference, client should probably be set here or in mainAdminGUI
        // Instantiates a controller when the fxml document is first loaded and then prints out the instance of controller in terminal
        this.addUserController = new addUserController(this);
        System.out.println("Controller from constructor " + addUserController);
    }



    @Override
    public void start(addUserController controller){

    }


    // Gets the values of the text boxes from the GUI
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

    // Gets whether or not the admin checkbox is ticked
    public boolean getCheckedValue() {
        return tickMakeAsAdmin.isSelected();
    }

    // Clears inputs
    public void clearInput() {
        txtCPR.setText("");
        txtFirstName.setText("");
        txtLastName.setText("");
        txtMobileNumber.setText("");
        txtEmail.setText("");
        txtPassword.setText("");
        tickMakeAsAdmin.setSelected(false);
    }

    // Event when add user button is pressed
    public void addUserPressed(ActionEvent actionEvent) {
        addUserController.addUserBtnPressed();
    }
}
