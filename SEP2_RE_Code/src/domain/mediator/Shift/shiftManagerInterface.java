package domain.model.shifts;

import java.rmi.Remote;

public interface shiftManagerInterface extends Remote {

    public void assignShift(int shiftId, int employeeId, int date, int startTime, int endTime, String task) throws Exception;
    public void removeShift(int shiftId) throws Exception;
    public void editShift(int shiftId) throws Exception;

}
