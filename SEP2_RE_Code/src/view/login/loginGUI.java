package view.login;

import controller.login.loginController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class loginGUI implements loginView {

    public Button btnLogin;
    private controller.login.loginController loginController;
    @FXML
    private TextField txtCPR;
    @FXML
    private TextField txtPassword;

    public loginGUI() {
        this.loginController = new loginController(this);
    }


    public String getCPR() {
        return txtCPR.getText();
    }

    public String getPassword() {
        return txtPassword.getText();
    }

    public void clearInput() {
        txtCPR.setText("");
        txtPassword.setText("");
    }

    public void closeWindow() {
        Stage stage = (Stage) btnLogin.getScene().getWindow();
        stage.close();
    }

    public void hideWindow() {
        Stage stage = (Stage) btnLogin.getScene().getWindow();
        stage.hide();
    }

    public void loginBtnPressed(ActionEvent actionEvent) {
        loginController.loginBtnPressed();
    }

    public void onEnter(ActionEvent actionEvent) {
        loginController.loginBtnPressed();
    }
}


