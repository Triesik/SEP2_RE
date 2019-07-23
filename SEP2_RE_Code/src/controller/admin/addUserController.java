package controller.admin;

import view.admin.addUser.addUserView;

public class addUserController {
   private addUserView view;

   public addUserController(addUserView view) {
      this.view = view;
   }

   public void addUserBtnPressed() {
      System.out.println("Button pressed from controller");
      String[] data = view.getTextFieldValues();
      for(int i = 0; i < data.length; i++) {
         System.out.println(data[i]);
      }
   }


}
