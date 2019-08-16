package view.admin.assignShift;

import client.Client;
import controller.admin.assignShiftController;
import domain.model.employeeMenuSelection.employeeMenuSelection;
import domain.model.loggedInEmployee.currentEmployee;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class assignShiftGUI implements assignShiftView {
    public DatePicker datePicker;
    public TextField startTimeTextField;
    public TextField endTimeTextField;
    public TextField taskTextField;
    public Button assignShiftBtn;
    private assignShiftController assignShiftController;
    public Client client;

    public assignShiftGUI() throws Exception {
        client = new Client();
        this.assignShiftController = new assignShiftController(this, client);
    }


    public void datePicked(ActionEvent actionEvent) throws Exception {
        System.out.println(datePicker.getValue());
    }


    public void assignShiftBtnPressed() throws Exception {
        client.assignShift(employeeMenuSelection.getId(), datePicker.getValue().toString(), startTimeTextField.getText(), endTimeTextField.getText(), taskTextField.getText());
        System.out.println("button pressed");
        closeWindow();
    }


    public void closeWindow() {
        Stage stage = (Stage) assignShiftBtn.getScene().getWindow();
        stage.close();
    }
}
