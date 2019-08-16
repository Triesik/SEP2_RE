package domain.mediator.shift;

import domain.model.shift.Shift;

import java.rmi.Remote;
import java.util.ArrayList;
import java.util.Calendar;

public interface ShiftManagerInterface extends Remote {

    void assignShift(int employeeId, String date, String startTime, String endTime, String task) throws Exception;
    void removeShift(int shiftId) throws Exception;
    void editShift(int shiftId) throws Exception;
    ArrayList<Shift> getWeekPlan(int employeeId, Calendar date) throws Exception;
    ArrayList getShiftList() throws Exception;

}
