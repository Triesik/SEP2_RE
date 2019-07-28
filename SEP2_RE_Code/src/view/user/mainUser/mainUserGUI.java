package view.user.mainUser;

import controller.user.mainUserController;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class mainUserGUI implements mainUserView {
    private mainUserController mainUserController;
    public Button btnLogout;

    public mainUserGUI() {
        this.mainUserController = new mainUserController(this);
    }

    public void closeWindow() {
        Stage stage = (Stage) btnLogout.getScene().getWindow();
        stage.close();
    }

    public void logoutButtonPressed(ActionEvent actionEvent) {
        mainUserController.logoutButtonPressed();
    }
}
