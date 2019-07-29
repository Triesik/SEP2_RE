package domain.mediator.Employee;

import domain.model.employees.Employee;

public class testm {

    public static void main(String args[]) {

    EmployeeDatabase e = new EmployeeDatabase();
        try {
            e.removeEmployee(2);
        } catch (Exception e1) {
            e1.printStackTrace();
        }


    }
}


