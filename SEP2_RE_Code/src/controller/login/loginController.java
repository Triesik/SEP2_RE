package controller.login;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import view.login.loginView;

public class loginController {
    public loginView view;

    public loginController(loginView view) {
        this.view = view;
    }

    public void loginBtnPressed() {
        System.out.println("Login Button pressed");
        Parent root;
        if (view.getCPR().equals("Admin")) {
            try {
                root = FXMLLoader.load(getClass().getResource("/view/admin/mainAdmin/mainAdminGUI.fxml"));
                Scene scene = new Scene(root);
                Stage primaryStage = new Stage();
                primaryStage.setScene(scene);
                primaryStage.getIcons().add(new Image("file:images/applicationIcon.png"));
                primaryStage.show();

            } catch (Exception e){
                e.printStackTrace();
            }

        } else {
            try {
                root = FXMLLoader.load(getClass().getResource("/view/user/mainUser/mainUserGUI.fxml"));
                Scene scene = new Scene(root);
                Stage primaryStage = new Stage();
                primaryStage.setScene(scene);
                primaryStage.getIcons().add(new Image("file:images/applicationIcon.png"));
                primaryStage.show();

            } catch (Exception e){
                e.printStackTrace();
            }

        }

        view.hideWindow();
    }
}
