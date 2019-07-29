package domain.mediator.Employee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class EmployeeDatabase {
    Connection conn;

    public EmployeeDatabase() {

        this.conn = null;

            try {
                conn = DriverManager
                        .getConnection("jdbc:postgresql://localhost:5432/company",
                                "root", "root");
                System.out.println("Opened database successfully");
            } catch (Exception e) {
                System.err.println(e.getClass().getName() + ": " + e.getMessage());
                System.exit(0);
            }

        }

        public void addEmployee(int employeeId, String firstName, String lastName, String email) throws Exception
        {
            Statement stmt = null;
            stmt = conn.createStatement();
            String sql = "INSERT INTO sep2.employee (employeeid ,firstname, lastname, email) VALUES ( "+employeeId+","+"'" + firstName+"'" + ","+"'" + lastName +"'" + ","+"'" + email+ "'" + ");";
            stmt.execute(sql);
        }

        public void removeEmployee(int employeeId) throws Exception
        {
            Statement stmt = null;
            stmt = conn.createStatement();
            String sql = "DELETE FROM sep2.employee where (employeeid) = "+employeeId+"";
            stmt.execute(sql);
        }

        public void editEmployee(int employeeId) throws Exception
        {
            Statement stmt = null;
            stmt = conn.createStatement();
            String sql = "";
            stmt.execute(sql);
        }

    }


