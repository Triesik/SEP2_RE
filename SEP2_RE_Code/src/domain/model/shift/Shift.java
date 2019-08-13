package domain.model.shift;

public class Shift implements java.io.Serializable {

    private int shiftId;
    private int employeeId;
    private String date;
    private String startTime;
    private String endTime;
    String task;

    public Shift(int employeeId,String date, String startTime, String endTime, String task)
    {
        this.date = date;
        this.employeeId = employeeId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.task = task;
    }

    public Shift()
    {

    }

    public void setShiftId(int shiftId){this.shiftId = shiftId;}

    public void setemployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setDate(String date) {
        this.date = date;
    }



    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setTask(String task) {
        this.task = task;
    }


    public int getShiftId(){return shiftId;}

    public int getEmployeeId() {
        return employeeId;
    }


    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getDate() {return date;}

    public String getTask() {
        return task;
    }

    public String toString() { return getStartTime() + " - " + getEndTime() + " " + getTask(); }

}
