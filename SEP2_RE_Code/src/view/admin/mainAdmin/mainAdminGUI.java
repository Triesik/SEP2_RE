package view.admin.mainAdmin;
import controller.admin.mainAdminController;
import javafx.event.ActionEvent;
import javafx.scene.AccessibleAction;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.stage.Stage;
import controller.admin.mainAdminController;
import view.admin.addUser.addUserView;
public class mainAdminGUI implements mainAdminView {
    private mainAdminController mainAdminController;
    public Parent embeddedAddUser;
    public Tab tabMainView;
    public Tab tabAddUser;
    public Tab tabEditUser;
    public Tab tabRemoveUser;
    public Button btnLogout;
    private addUserView addUserView;

    public mainAdminGUI() {
        this.mainAdminController = new mainAdminController(this);
    }

    public void closeWindow(){
        Stage stage = (Stage) btnLogout.getScene().getWindow();
        stage.close();
    }

    public void logoutButtonPressed(ActionEvent actionEvent) {
        mainAdminController.logoutBtnPressed();
    }


}
