package view.admin.addUser;

import client.Client;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import controller.admin.addUserController;
import javafx.stage.Stage;

public class addUserGUI implements addUserView {
    public Button btnAddUser;
    private addUserController addUserController;
    public CheckBox tickMakeAsAdmin;
    public TextField txtFirstName;
    public TextField txtLastName;
    public TextField txtEmail;
    public Client client;

    public addUserGUI() throws Exception {
        client = new Client();
        // For future reference, client should probably be set here or in mainAdminGUI
        // Instantiates a controller when the fxml document is first loaded and then prints out the instance of controller in terminal
        this.addUserController = new addUserController(this, client);
        System.out.println("Controller from constructor " + addUserController);
    }



    @Override
    public void start(addUserController controller){

    }


    // Gets the values of the text boxes from the GUI
    @Override
    public String[] getTextFieldValues() {
        String firstName = txtFirstName.getText();
        String lastName = txtLastName.getText();
        String email = txtEmail.getText();

        return new String[]{firstName, lastName, email};
    }

    // Gets whether or not the admin checkbox is ticked
    public String getCheckedValue() {
        if (tickMakeAsAdmin.isSelected()) {
            return "admin";
        } else {
            return "user";
        }
    }

    // Clears inputs
    public void clearInput() {
        txtFirstName.setText("");
        txtLastName.setText("");
        txtEmail.setText("");
        tickMakeAsAdmin.setSelected(false);
    }

    // Event when add user button is pressed
    public void addUserPressed(ActionEvent actionEvent) throws Exception {
        addUserController.addUserBtnPressed();
    }

    public void closeWindow() {
        Stage stage = (Stage) btnAddUser.getScene().getWindow();
        stage.close();
    }
}
