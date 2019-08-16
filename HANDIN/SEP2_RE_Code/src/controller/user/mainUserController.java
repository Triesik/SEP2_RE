package controller.user;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import view.user.mainUser.mainUserView;

public class mainUserController {
    mainUserView view;

    public mainUserController(mainUserView view) {
        this.view = view;
    }

    public void logoutButtonPressed() {
        System.out.println("Logout button pressed");
        view.closeWindow();
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/view/login/loginGUI.fxml"));
            Scene scene = new Scene(root);
            Stage primaryStage = new Stage();
            primaryStage.setScene(scene);
            primaryStage.getIcons().add(new Image("file:images/applicationIcon.png"));
            primaryStage.show();

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
