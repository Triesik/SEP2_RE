package controller.login;

import client.Client;
import domain.model.loggedInEmployee.currentEmployee;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import view.login.loginView;

public class loginController {
    public loginView view;
    public Client client;

    public loginController(loginView view, Client client) {
        this.view = view;
        this.client = client;
    }

    public void loginBtnPressed(int id, String pass) throws Exception {
        System.out.println("Login Button pressed");
        Parent root;
        if (client.verifyPassword(id, pass)) {
            if (client.isAdmin(id)) {
                try {
                    currentEmployee.setID(id);
                    root = FXMLLoader.load(getClass().getResource("/view/admin/mainAdmin/mainAdminGUI.fxml"));
                    Scene scene = new Scene(root);
                    Stage primaryStage = new Stage();
                    primaryStage.setScene(scene);
                    primaryStage.getIcons().add(new Image("file:images/applicationIcon.png"));
                    primaryStage.show();
                    view.hideWindow();

                } catch (Exception e){
                    e.printStackTrace();
                }
            } else {
                try {
                    currentEmployee.setID(id);
                    root = FXMLLoader.load(getClass().getResource("/view/user/mainUser/mainUserGUI.fxml"));
                    Scene scene = new Scene(root);
                    Stage primaryStage = new Stage();
                    primaryStage.setScene(scene);
                    primaryStage.getIcons().add(new Image("file:images/applicationIcon.png"));
                    primaryStage.show();
                    view.hideWindow();

                } catch (Exception e){
                    e.printStackTrace();
                }

            }

        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Error");
            alert.setHeaderText("Incorrect credentials");
            alert.setContentText("Please try again");

            alert.showAndWait();
            view.clearInput();
        }

    }
}
