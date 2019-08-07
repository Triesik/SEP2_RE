package domain.mediator.shift;

import domain.mediator.employee.EmployeeManager;
import domain.model.Date.Date;
import domain.model.employee.*;
import client.Client;
import domain.model.shift.Shift;

import java.util.ArrayList;
import java.util.Calendar;

public class test {

    public static void main(String args[]) throws Exception {

        ArrayList<Shift> list = new ArrayList<>();
        ShiftManager sm = new ShiftManager();
        list = sm.getWeekPlan(1, Calendar.getInstance());
        System.out.print(list.get(0).getDate());






    }
}