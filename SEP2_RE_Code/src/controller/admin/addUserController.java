package controller.admin;

import view.admin.addUser.addUserView;

public class addUserController {
   private addUserView view;

   public addUserController(addUserView view) {
      this.view = view;
   }

   public void addUserBtnPressed() {
      System.out.println("Button pressed");
   }


}
