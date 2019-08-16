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
                                "postgres", "4265");
                System.out.println("Opened database successfully");
            } catch (Exception e) {
                System.err.println(e.getClass().getName() + ": " + e.getMessage());
                System.exit(0);
            }

        }

        public void addEmployee(int employeeId, String firstName, String lastName, String email, String password, String userType) throws Exception
        {
            Statement stmt = null;
            stmt = conn.createStatement();
            String sql = "INSERT INTO sep2.employee (employeeid ,firstname, lastname, email, password, usertype) " +
                    "VALUES ( "+employeeId+","+"'" + firstName+"'" + ","+"'" + lastName +"'" + ","+"'" + email+ "'" +
                    ","+"'" + password + "'" + "," + "'" + userType + "'" +  ");";
            stmt.execute(sql);
        }

        public void removeEmployee(int employeeId) throws Exception
        {
            Statement stmt = null;
            stmt = conn.createStatement();
            String sql = "DELETE FROM sep2.employee where (employeeid) = "+employeeId+"";
            stmt.execute(sql);
        }


        public ResultSet getEmployees() throws Exception
        {

            Statement stmt = null;
            stmt = conn.createStatement();
            String sql = "SELECT * FROM sep2.employee ORDER BY (employeeid) ASC";
            ResultSet rs = stmt.executeQuery(sql);
            return rs;
        }

        public ResultSet getPassword(int employeeId) throws Exception
        {
            Statement stmt = null;
            stmt = conn.createStatement();
            String sql = "SELECT password FROM sep2.employee WHERE (employeeid) = "+employeeId+"";
            ResultSet rs = stmt.executeQuery(sql);
            return rs;
        }

        public ResultSet getUserType(int employeeId) throws Exception
        {
            Statement stmt = null;
            stmt = conn.createStatement();
            String sql = "SELECT usertype FROM sep2.employee WHERE (employeeid) = "+employeeId+"";
            ResultSet rs = stmt.executeQuery(sql);
            return rs;
        }

        public ResultSet getOneEmployee(int employeeId) throws Exception
        {
            Statement stmt = null;
            stmt = conn.createStatement();
            String sql = "SELECT * FROM sep2.employee WHERE (employeeid) = "+employeeId+"";
            ResultSet rs = stmt.executeQuery(sql);
            return rs;
        }

        public void editEmployee(int employeeId, String firstName, String lastName, String email, String password) throws Exception
        {
            Statement stmt;
            stmt = conn.createStatement();
            String sql = "UPDATE sep2.employee SET firstname = " + "'" + firstName + "'" + "," +
                    "lastname = "+ "'" + lastName + "'" + "," + "email = '" + email + "'" +
                    "," + "password = '" + password + "'" + " WHERE employeeid = "+ "'" + employeeId + "'";
            stmt.execute(sql);
        }


        public ResultSet getEmail(String email) throws Exception
        {
            Statement stmt;
            stmt = conn.createStatement();
            String sql = "SELECT * FROM sep2.employee where email = '" + email + "'";
            ResultSet rs = stmt.executeQuery(sql);
            return rs;
        }

    public ResultSet getId(int id) throws Exception
    {
        Statement stmt;
        stmt = conn.createStatement();
        String sql = "SELECT * FROM sep2.employee where employeeid = '" + id + "'";
        ResultSet rs = stmt.executeQuery(sql);
        return rs;
    }


}




