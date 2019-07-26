package controller.admin;

import view.admin.removeUser.removeUserView;

public class removeUserController {
    private removeUserView view;

    public removeUserController(removeUserView view) {
        this.view = view;
    }

    public void removeUserBtnPressed() {
        System.out.println("Remove user button pressed, user to remove has CPR of : " + view.getCPR());
        view.clearInput();

    }


}
