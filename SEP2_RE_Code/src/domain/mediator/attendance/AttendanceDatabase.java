package domain.mediator.attendance;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class AttendanceDatabase {
    Connection conn;

    public AttendanceDatabase() {

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

    public void checkIn(int employeeId, String shiftId, String startDate, String startTime) throws Exception
    {
        Statement stmt = null;
        stmt = conn.createStatement();
        String sql = "INSERT INTO sep2.attendance (employeeid ,shiftid, startdate, starttime) VALUES ( "+employeeId+","+ "'" + shiftId + "'" + ","+"'" + startDate +"'" + ","+"'" + startTime+ "'" + ");";
        stmt.execute(sql);
    }

    public void checkOut(String shiftId ,String endDate, String endTime) throws Exception
    {
        Statement stmt = null;
        stmt = conn.createStatement();
        String sql = "UPDATE sep2.attendance SET enddate = " + "'" + endDate + "'" + ","  + "endtime = " + "'" + endTime + "'" + " WHERE shiftid = "+ "'" + shiftId + "'";
        stmt.execute(sql);
    }



    public void removeEmployee(int employeeId) throws Exception
    {
        Statement stmt = null;
        stmt = conn.createStatement();
        String sql = "DELETE FROM sep2.employee where (employeeid) = "+employeeId+"";
        stmt.execute(sql);
    }



    public ResultSet getStatus(int employeeId) throws Exception
    {

        Statement stmt = null;
        stmt = conn.createStatement();
        String sql = "SELECT status FROM sep2.employee where (employeeid) = "+employeeId+";";
        ResultSet rs = stmt.executeQuery(sql);
        return rs;
    }

    public void setStatus(int employeeId, String status) throws Exception
    {
        Statement stmt = null;
        stmt = conn.createStatement();
        String sql = "UPDATE sep2.employee SET status = " + "'" + status + "'" + " WHERE employeeid = "+ employeeId +";";
        stmt.execute(sql);


    }



}




