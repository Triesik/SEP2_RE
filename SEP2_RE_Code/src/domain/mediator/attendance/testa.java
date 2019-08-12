package domain.mediator.attendance;


import client.Client;

public class testa {

    public static void main(String args[]) throws Exception {

        AttendanceDatabase ad = new AttendanceDatabase();
        Client client = new Client();

        client.checkOut(1);
        //ad.checkIn(1, "12345", "2019-02-03", "13:30");
        //ad.setStatus(1, "xd");








    }
}