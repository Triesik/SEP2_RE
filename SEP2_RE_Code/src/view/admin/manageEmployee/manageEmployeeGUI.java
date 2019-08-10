package view.admin.manageEmployee;

import client.Client;
import controller.admin.manageEmployeeController;
import domain.model.employee.Employee;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import java.io.IOException;

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
    public Button loadEmployeesBtn;
    public AnchorPane manageEmployeePane;

    FocusListener focusListener = new FocusListener() {
        @Override
        public void focusGained(FocusEvent focusEvent) {
            System.out.println(focusEvent);
        }

        @Override
        public void focusLost(FocusEvent focusEvent) {
            System.out.println(focusEvent);
        }
    };


    public manageEmployeeGUI() throws Exception {
        client = new Client();
        this.manageEmployeeController = new manageEmployeeController(this, client);
        System.out.println("Employee management started");
        tbData = new TableView<>();
        tbData.getColumns().clear();
        fNameColumn = new TableColumn<>("First Name");
        fNameColumn.setCellValueFactory(new PropertyValueFactory<>("FirstName"));
        lNameColumn = new TableColumn<>("Last Name");
        lNameColumn.setCellValueFactory(new PropertyValueFactory<>("LastName"));
        idColumn = new TableColumn<>("ID");
        idColumn.setCellValueFactory(new PropertyValueFactory<>("EmployeeId"));
        emailColumn = new TableColumn<>("Email");
        emailColumn.setCellValueFactory(new PropertyValueFactory<>("Email"));

    }

    @FXML
    public void initialize() throws Exception {
        ObservableList<Employee> employees = manageEmployeeController.getTableData();
        tbData.setItems(employees);
        tbData.getColumns().clear();
        for (Employee employee:employees) {
            tbData.getColumns().clear();
            tbData.getColumns().addAll(fNameColumn,lNameColumn,idColumn,emailColumn);

        }
    }

    @FXML
    public void ifFocused(Event e) throws Exception {
        if (manageEmployeePane.isFocused()) {
            refreshEmployeeTable();
        }
    }

    public void refreshEmployeeTable() throws Exception {
        System.out.println("Refreshed Table View");
        ObservableList<Employee> employees = manageEmployeeController.getTableData();
        tbData.setItems(employees);
        tbData.getColumns().clear();
        for (Employee employee:employees) {
            tbData.getColumns().clear();
            tbData.getColumns().addAll(fNameColumn,lNameColumn,idColumn,emailColumn);

        }

    }


    public void loadEmployeesBtnPressed(ActionEvent actionEvent) throws Exception {
        ObservableList<Employee> employees = manageEmployeeController.getTableData();
        tbData.setItems(employees);
        for (Employee employee:employees) {
            tbData.getColumns().clear();
            tbData.getColumns().addAll(fNameColumn,lNameColumn,idColumn,emailColumn);

        }
    }

    public void addEmployeeBtnPressed(ActionEvent actionEvent) throws IOException {
        Parent root;
        root = FXMLLoader.load(getClass().getResource("/view/admin/addUser/addUserGUI.fxml"));
        Scene scene = new Scene(root);
        Stage primaryStage = new Stage();
        primaryStage.setScene(scene);
        primaryStage.getIcons().add(new Image("file:images/applicationIcon.png"));
        primaryStage.show();
    }

    public void onMouseEntered(MouseEvent mouseEvent) throws Exception {
        refreshEmployeeTable();
    }
}
