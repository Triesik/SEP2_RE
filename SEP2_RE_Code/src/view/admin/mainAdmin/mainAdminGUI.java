package view.admin.mainAdmin;
import controller.admin.addUserController;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Tab;
import view.admin.addUser.addUserGUI;
import view.admin.addUser.addUserView;
public class mainAdminGUI {
    public Parent embeddedAddUser;
    public Tab tabMainView;
    public Tab tabAddUser;
    public Tab tabEditUser;
    public Tab tabRemoveUser;
    private addUserView addUserView;


    public void addUserSelection(Event event) {
        if(tabAddUser.isSelected()) {
            //Test code just in case you do have to start controller, turns out one is made as soon as the program starts as it's included in the main fxml
            //addUserController controller = null;
            //addUserGUI view = new addUserGUI();
            //controller = new addUserController(view);
            //view.start(controller);
            // Outputs for testing if the controllers are the same amongst instantiated fxml tabs
            //System.out.println(controller);
            //System.out.println("Add tab clicked");
            //System.out.println(embeddedAddUser);
            //System.out.println(view);
        }
    }
}
