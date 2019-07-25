package controller.admin;

import view.admin.editUser.editUserView;

public class editUserController {

    private editUserView view;

    public editUserController(editUserView view) {
        this.view = view;
    }

    public void editUserBtnPressed() {
        System.out.println("Edit button pressed");

    }
}
