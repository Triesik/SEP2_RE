package view.admin.removeUser;

import controller.admin.removeUserController;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class removeUserGUI implements removeUserView {
    private removeUserController removeUserController;
    public TextField txtCPR;


    public removeUserGUI() {
        this.removeUserController = new removeUserController(this);
    }
    
    public String getCPR() {
        return txtCPR.getText();
    }

    public void clearInput() {
        txtCPR.setText("");
    }
    
    

    public void removeUserPressed(ActionEvent actionEvent) {
        removeUserController.removeUserBtnPressed();
    }
}
