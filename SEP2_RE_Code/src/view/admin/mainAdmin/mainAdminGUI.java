package view.admin.mainAdmin;
import controller.admin.addUserController;
import javafx.event.Event;
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
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../addUser/addUserGUI.fxml"));
            //addUserGUI view = loader.<addUserGUI>getController();
            //addUserController controller = new addUserController(view);
            //view.start(new addUserController(controller));
            //System.out.println(controller);
            System.out.println("Add tab clicked");
            System.out.println(embeddedAddUser);
            System.out.println(addUserView);
        }
    }
}
