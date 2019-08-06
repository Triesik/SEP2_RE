package domain.mediator.shift;

import java.rmi.Remote;

public interface ShiftManagerInterface extends Remote {

    void assignShift(int shiftId, int employeeId, int date, int startTime, int endTime, String task) throws Exception;
    void removeShift(int shiftId) throws Exception;
    void editShift(int shiftId) throws Exception;

}
