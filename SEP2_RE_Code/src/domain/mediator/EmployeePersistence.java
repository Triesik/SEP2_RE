package mediator;

public interface EmployeePersistence {

    public void addEmployee(int id, String firstname, String lastname, String password) throws Exception;
    public void removeEmployee(int id) throws Exception;



}
