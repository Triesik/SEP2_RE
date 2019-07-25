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

    exports main to javafx.graphics;
    exports controller.admin to javafx.fxml;
    exports view.admin.mainAdmin to javafx.fxml;
    exports view.admin.addUser to javafx.fxml;
    exports view.admin.editUser to javafx.fxml;

    opens main to javafx.fxml;
    opens view.admin.addUser to javafx.fxml;
    opens view.admin.editUser to javafx.fxml;
    opens view.admin.mainAdmin to javafx.fxml;
}