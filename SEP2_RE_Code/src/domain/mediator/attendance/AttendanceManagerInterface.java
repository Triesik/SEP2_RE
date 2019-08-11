package domain.mediator.attendance;

import java.rmi.Remote;

public interface AttendanceManagerInterface extends Remote {

    void checkIn(int employeeId) throws Exception;
    void checkOut(int shiftid);
    void removeEntry(int shiftId) throws Exception;
    boolean getStatus(int employeeId) throws Exception;

}
