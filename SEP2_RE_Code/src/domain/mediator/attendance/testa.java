package domain.mediator.attendance;


import client.Client;

import java.util.concurrent.TimeUnit;

public class testa {

    public static void main(String args[]) throws Exception {

        AttendanceDatabase ad = new AttendanceDatabase();

        //ad.checkIn(1, "12345", "2019-02-03", "13:30");
        //ad.setStatus(1, "xd");
       Client client = new Client();
        client.checkIn(1);
        client.checkOut(1);






    }
}