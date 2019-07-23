package view.admin.addUser;

import controller.admin.addUserController;
import domain.model.Employee;

public interface addUserView {
    public void start(addUserController controller);

    public String[] getTextFieldValues();

    public boolean getCheckedValue();

    public void clearInput();


}
