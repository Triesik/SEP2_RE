package domain.mediator.shift;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ShiftsDatabase {
    Connection conn;

        public ShiftsDatabase() {

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

        public void assignShift(int shiftid, int employeeId, String date, String startTime, String endTime, String task) throws Exception
        {
            Statement stmt;
            stmt = conn.createStatement();
            String sql = "INSERT INTO sep2.shift (shiftid ,employeeid ,date, startTime, endTime, task) VALUES ("+shiftid+","+ + +employeeId+","+ "'" + date+ "'" + "," + "'" + startTime + "'" + "," + "'" + endTime + "'" +","+ "'" + task + "'" + ");";
            stmt.execute(sql);
        }

        public void removeShift(int shiftId) throws Exception
        {
            Statement stmt;
            stmt = conn.createStatement();
            String sql = "DELETE FROM sep2.shift where (shiftid) = "+shiftId+"";
            stmt.execute(sql);
        }

        public void editShift(int shiftId) throws Exception
        {
            Statement stmt;
            stmt = conn.createStatement();
            String sql = "";
            stmt.execute(sql);
        }

        public ResultSet getWeekPlan(int employeeId, String date) throws Exception
        {
            Statement stmt;
            stmt = conn.createStatement();
            String sql = "SELECT * from sep2.shift WHERE date = '" + date + "'" + "and employeeId = " + employeeId;
            ResultSet rs = stmt.executeQuery(sql);
            return rs;
        }

        public ResultSet getShiftList() throws Exception
        {
            Statement stmt;
            stmt = conn.createStatement();
            String sql = "SELECT * from sep2.shift";
            ResultSet rs = stmt.executeQuery(sql);
            return rs;
        }
        public ResultSet getId(int id) throws Exception
        {
            Statement stmt;
            stmt = conn.createStatement();
            String sql = "SELECT * FROM sep2.shift where shiftid = '" + id + "'";
            ResultSet rs = stmt.executeQuery(sql);
            return rs;
    }





    }


