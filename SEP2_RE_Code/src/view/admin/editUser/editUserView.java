package view.admin.editUser;

import domain.model.employee.Employee;

public interface editUserView {

    String getId();
    String getFirstName();
    String getLastName();
    String getEmail();
    String getPassword();
    void insertEmployeeValues(Employee employee);
    void closeWindow();

}
