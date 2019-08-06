/**
 *
 */
/**
 * @author Balkis
 *
 */
module SEP2_RE {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires java.sql;
    requires java.rmi;

    exports main to javafx.graphics;
    exports controller.admin to javafx.fxml;
    exports view.admin.mainAdmin to javafx.fxml;
    exports view.admin.addUser to javafx.fxml;
    exports view.admin.editUser to javafx.fxml;
    exports view.admin.removeUser to javafx.fxml;
    exports view.login to javafx.fxml;
    exports view.user.mainUser to javafx.fxml;
    exports view.admin.dashBoard to javafx.fxml;
    exports view.user.dashBoard to javafx.fxml;
    exports view.admin.assignShift to javafx.fxml;
    exports domain.mediator.employee to java.rmi;
    exports domain.mediator.shift to java.rmi;



    opens main to javafx.fxml;
    opens view.login to javafx.fxml;
    opens view.admin.addUser to javafx.fxml;
    opens view.admin.editUser to javafx.fxml;
    opens view.admin.removeUser to javafx.fxml;
    opens view.admin.mainAdmin to javafx.fxml;
    opens view.user.mainUser to javafx.fxml;
    opens view.admin.dashBoard to javafx.fxml;
    opens view.user.dashBoard to javafx.fxml;
    opens view.admin.assignShift to javafx.fxml;

}