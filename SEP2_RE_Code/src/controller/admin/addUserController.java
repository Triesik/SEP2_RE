package controller.admin;

import client.Client;
import domain.model.employee.*;
import javafx.fxml.FXMLLoader;
import view.admin.addUser.addUserView;
import view.admin.manageEmployee.manageEmployeeGUI;
import view.admin.manageEmployee.manageEmployeeView;

public class addUserController {
   private addUserView view;
   private Client client;
   private manageEmployeeGUI controller;


   public addUserController(addUserView view, Client client) {
      this.view = view;
      this.client = client;
   }

   // Controller action for when the add button is pressed
   public void addUserBtnPressed() throws Exception {
      System.out.println("Button pressed from controller");
      String[] data = view.getTextFieldValues();
      if (view.getCheckedValue().equals("admin")) {
        Employee employee = new Employee((Integer.parseInt(data[0])), data[1], data[2], data[3], view.getCheckedValue());
         client.addEmployee(Integer.parseInt(data[0]), data[1], data[2], data[3], view.getCheckedValue());
      } else {
         Employee employee = new Employee((Integer.parseInt(data[0])), data[1], data[2], data[3], view.getCheckedValue());
         client.addEmployee(Integer.parseInt(data[0]), data[1], data[2], data[3], view.getCheckedValue());
      }

      view.clearInput();
      view.closeWindow();
   }


}
