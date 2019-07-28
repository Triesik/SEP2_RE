package mediator;

import domain.model.employees.Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDatabase implements EmployeePersistence {

    Connection conn = null;

    public EmployeeDatabase() {

        this.conn = null;
        try {
            conn = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/postgres",
                            "root", "root");
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }


    }

    public void addEmployee(int id, String firstname, String lastname, String password) throws Exception
    {

        Statement stmt = null;

            stmt = conn.createStatement();


        String sql = "INSERT INTO users (id ,firstname, lastname, password)" +
                "VALUES ("+ id + "," + firstname +";";
        stmt.execute(sql);

    }

    public void removeEmployee(int id) throws Exception
    {
        Statement stmt = null;

        stmt = conn.createStatement();
        String sql = "DELETE FROM users WHERE (id) = "+id+";";
        stmt.execute(sql);
    }




}
