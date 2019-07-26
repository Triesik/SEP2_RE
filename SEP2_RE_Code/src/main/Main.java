package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import controller.admin.mainAdminController;
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/view/login/loginGUI.fxml"));
            Scene scene = new Scene(root);

            primaryStage.setScene(scene);
            primaryStage.getIcons().add(new Image("file:images/applicationIcon.png"));
            primaryStage.show();

        } catch (Exception e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
