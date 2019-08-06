package domain.mediator.shift;



import java.rmi.Remote;

public class ShiftManager implements ShiftManagerInterface {

    ShiftsDatabase database;

    public ShiftManager()
    {

        this.database = new ShiftsDatabase();

    }

    public void assignShift(int shiftId, int employeeId, int date, int startTime, int endTime, String task) throws Exception
    {

        database.assignShift(shiftId, employeeId, date, startTime, endTime, task);
    }

    public void removeShift(int shiftId) throws Exception
    {
        database.removeShift(shiftId);
    }

    public void editShift(int shiftId) throws Exception
    {
        database.editShift(shiftId);
    }


}
