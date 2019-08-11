package view.admin.dashBoard;

import client.Client;
import controller.admin.dashBoardController;
import domain.model.loggedInEmployee.currentEmployee;
import domain.model.shift.Shift;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;
import java.util.Calendar;

public class dashBoardGUI implements dashBoardView {
    public Client client;
    public dashBoardController dashBoardController;
    public TextArea monTextField;
    public TextArea tuesTextField;
    public TextArea wedTextField;
    public TextArea thursTextField;
    public TextArea friTextField;
    public TextArea satTextField;
    public TextArea sunTextField;
    public GridPane weekGridpane;

    public dashBoardGUI() throws Exception {
        client = new Client();

        this.dashBoardController = new dashBoardController(this, client);

    }

    @FXML
    public void initialize() throws Exception {
        System.out.println("Started writing shifts");
        ArrayList<Shift> shifts = client.getWeekPlan(currentEmployee.getId(), Calendar.getInstance());
        for (int i = 0; i < shifts.size(); i++) {
            switch (i) {
                case 0:
                    monTextField.setText(shifts.get(i).toString());
                    break;
                case 1:
                    tuesTextField.setText(shifts.get(i).toString());
                    break;
                case 2:
                    wedTextField.setText(shifts.get(i).toString());
                    break;
                case 3:
                    thursTextField.setText(shifts.get(i).toString());
                    break;
                case 4:
                    friTextField.setText(shifts.get(i).toString());
                    break;
                case 5:
                    satTextField.setText(shifts.get(i).toString());
                    break;
                case 6:
                    sunTextField.setText(shifts.get(i).toString());
                    break;
            }
        }
        System.out.println("Done writing shifts");
    }





}
