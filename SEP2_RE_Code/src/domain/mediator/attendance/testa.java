package domain.mediator.attendance;


import client.Client;

public class testa {

    public static void main(String args[]) throws Exception {

        AttendanceDatabase ad = new AttendanceDatabase();
        Client client = new Client();
        client.checkIn(1);
        client.checkOut(1);










    }
}