package domain.mediator.shift;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ShiftsDatabase {
    Connection conn;

        public ShiftsDatabase() {

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

        public void assignShift(int shiftid, int employeeId, int date, int startTime, int endTime, String task) throws Exception
        {
            Statement stmt = null;
            stmt = conn.createStatement();
            String sql = "INSERT INTO sep2.shift (shiftid ,employeeid ,date, startTime, endTime, task) VALUES ("+shiftid+","+ + +shiftid+","+ + date+ "," + startTime + "," + endTime +","+ "'" + task + "'" + ");";
            stmt.execute(sql);
        }

        public void removeShift(int shiftId) throws Exception
        {
            Statement stmt = null;
            stmt = conn.createStatement();
            String sql = "DELETE FROM sep2.shift where (shiftid) = "+shiftId+"";
            stmt.execute(sql);
        }

        public void editShift(int shiftId) throws Exception
        {
            Statement stmt = null;
            stmt = conn.createStatement();
            String sql = "";
            stmt.execute(sql);
        }

    }


