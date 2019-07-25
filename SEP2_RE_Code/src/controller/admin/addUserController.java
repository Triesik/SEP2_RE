package controller.admin;

import domain.model.Admin;
import view.admin.addUser.addUserView;

public class addUserController {
   private addUserView view;

   public addUserController(addUserView view) {
      this.view = view;
   }

   // Controller action for when the add button is pressed
   public void addUserBtnPressed() {
      System.out.println("Button pressed from controller");
      String[] data = view.getTextFieldValues();
      if (view.getCheckedValue()) {
        Admin admin = new Admin(Integer.parseInt(data[0]), data[1], data[2], data[3], data[4], data[5]);
         System.out.println(admin.toString());
      }
      view.clearInput();
   }


}
