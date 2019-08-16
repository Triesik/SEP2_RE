package domain.mediator.shift;

import client.Client;
import domain.model.shift.Shift;

import java.util.ArrayList;

public class test {

    public static void main(String args[]) throws Exception {

        Client client = new Client();
        client.assignShift(1, "2019-05-06", "15:30", "13:22", "dunnolol");
        ArrayList<Shift> a = client.getShiftList();
        System.out.print(a.get(0).getDate());
        client.removeShift(6);






    }
}