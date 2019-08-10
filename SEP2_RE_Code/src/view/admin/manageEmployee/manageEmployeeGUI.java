package view.admin.manageEmployee;

import client.Client;
import controller.admin.manageEmployeeController;
import domain.model.employee.Employee;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class manageEmployeeGUI implements manageEmployeeView {
    public manageEmployeeController manageEmployeeController;
    public Client client;
    @FXML
    public TableColumn<Employee, String> fNameColumn;
    @FXML
    public TableColumn<Employee, String>lNameColumn;
    @FXML
    public TableColumn<Employee, Integer> idColumn;
    @FXML
    public TableColumn<Employee, String> emailColumn;
    @FXML
    public TableView<Employee> tbData;
    public Button assignShiftBtn;
    public Button removeEmployeeBtn;
    public Button editEmployeeBtn;
    public Button addEmployeeBtn;



    public manageEmployeeGUI() throws Exception {
        client = new Client();
        this.manageEmployeeController = new manageEmployeeController(this, client);
        System.out.println("Employee management started");
        fNameColumn = new TableColumn("First Name");
        fNameColumn.setCellValueFactory(new PropertyValueFactory<>("FirstName"));
        lNameColumn = new TableColumn("Last Name");
        lNameColumn.setCellValueFactory(new PropertyValueFactory<>("LastName"));
        idColumn = new TableColumn("ID");
        idColumn.setCellValueFactory(new PropertyValueFactory<>("EmployeeId"));
        emailColumn = new TableColumn("Email");
        emailColumn.setCellValueFactory(new PropertyValueFactory<>("Email"));

        ObservableList<Employee> employees = manageEmployeeController.getTableData();

        for (Employee employee:employees) {
            tbData.getColumns().addAll(fNameColumn,lNameColumn,idColumn,emailColumn);

        }


    }





}
