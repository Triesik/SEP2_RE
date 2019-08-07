package domain.mediator.employee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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

        public void addEmployee(int employeeId, String firstName, String lastName, String email, String password) throws Exception
        {
            Statement stmt = null;
            stmt = conn.createStatement();
            String sql = "INSERT INTO sep2.employee (employeeid ,firstname, lastname, email, password) VALUES ( "+employeeId+","+"'" + firstName+"'" + ","+"'" + lastName +"'" + ","+"'" + email+ "'" +","+"'" + password + "'" + ");";
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

        public ResultSet getEmployees() throws Exception
        {

            Statement stmt = null;
            stmt = conn.createStatement();
            String sql = "SELECT * FROM sep2.employee";
            ResultSet rs = stmt.executeQuery(sql);
            return rs;
        }
}




