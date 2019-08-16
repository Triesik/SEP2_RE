package view.admin.viewShifts;

import client.Client;
import controller.admin.viewShiftsController;
import domain.model.shift.Shift;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class viewShiftsGUI implements viewShiftsView {
    public Client client;
    private viewShiftsController viewShiftsController;
    @FXML
    public TableColumn<Shift, Integer> shiftIdColumn;
    @FXML
    public TableColumn<Shift, String> employeeIdColumn;
    @FXML
    public TableColumn<Shift, String> dateColumn;
    @FXML
    public TableColumn<Shift, String> startTimeColumn;
    @FXML
    public TableColumn<Shift, String> endTimeColumn;
    @FXML
    public TableColumn<Shift, String> taskColumn;
    @FXML
    public TableView<Shift> tbData;

    public viewShiftsGUI() throws Exception{
        client = new Client();
        this.viewShiftsController = new viewShiftsController(this, client);
        tbData = new TableView<>();
        tbData.getColumns().clear();
        shiftIdColumn = new TableColumn<>("Shift Id");
        shiftIdColumn.setCellValueFactory(new PropertyValueFactory<>("ShiftId"));
        employeeIdColumn = new TableColumn<>("Employee Id");
        employeeIdColumn.setCellValueFactory(new PropertyValueFactory<>("EmployeeId"));
        dateColumn = new TableColumn<>("Date");
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("Date"));
        startTimeColumn = new TableColumn<>("Start Time");
        startTimeColumn.setCellValueFactory(new PropertyValueFactory<>("StartTime"));
        endTimeColumn = new TableColumn<>("End Time");
        endTimeColumn.setCellValueFactory(new PropertyValueFactory<>("EndTime"));
        taskColumn = new TableColumn<>("Task");
        taskColumn.setCellValueFactory(new PropertyValueFactory<>("Task"));
    }

    @FXML
    public void initialize() throws Exception {
        System.out.println("Attempting to initialize viewShift");
        ObservableList<Shift> shifts = viewShiftsController.getTableData();
        tbData.setItems(shifts);
        tbData.getColumns().clear();
        for (Shift shift:shifts) {
            tbData.getColumns().clear();
            tbData.getColumns().addAll(shiftIdColumn,employeeIdColumn,dateColumn,startTimeColumn,endTimeColumn,taskColumn);
        }
    }

    public void refreshShiftTable() throws  Exception {
        System.out.println("Attempting to initialize viewShift");
        ObservableList<Shift> shifts = viewShiftsController.getTableData();
        tbData.setItems(shifts);
        tbData.getColumns().clear();
        for (Shift shift:shifts) {
            tbData.getColumns().clear();
            tbData.getColumns().addAll(shiftIdColumn,employeeIdColumn,dateColumn,startTimeColumn,endTimeColumn,taskColumn);
        }
    }


    public void onMouseEntered(MouseEvent mouseEvent) throws Exception {
        refreshShiftTable();
    }

    public void removeShiftBtnPressed(ActionEvent actionEvent) throws Exception {
        Shift selected = tbData.getSelectionModel().getSelectedItem();
        viewShiftsController.removeShift(selected.getShiftId());
        refreshShiftTable();
    }
}
