package domain.model.attendance;

public class Attendance {

    String startDate;
    String endDate;
    String startTime;
    String endTime;
    int shiftId;
    int employeeId;

    public Attendance(int shiftId, int employeeId, String startDate, String endDate, String startTime, String endTime)
    {
        this.startDate = startDate;
        this.endDate = endDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.shiftId = shiftId;
        this.employeeId = employeeId;
    }

    public void setStartDate(String date)
    {
        this.startDate = date;
    }

    public void setEndDate(String date)
    {
        this.endDate = date;
    }

    public void setShiftid(int shiftid)
    {
        this.shiftId = shiftId;
    }

    public void setEmployeeId(int employeeId)
    {
        this.employeeId = employeeId;
    }

    public void setStartTime(String time)
    {
        this.startTime = startTime;
    }

    public void setEndTime(String endTime)
    {
        this.endTime = endTime;
    }







}
