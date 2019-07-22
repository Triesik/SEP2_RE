package domain.mediator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class EmployeeDatabase {

    Connection conn = null;

    public EmployeeDatabase() {

        Connection conn = null;
        try {
            conn = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/postgres",
                            "root", "root");
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }


    }

    public void addEmployee()
    {

        Statement stmt = null;
        stmt = con.createStatement();
        String sql = "INSERT INTO users (id ,firstname, lastname, password)" +
                "VALUES ("+ id + "," + firstName +";";
        stmt.execute(sql);

    }




}
