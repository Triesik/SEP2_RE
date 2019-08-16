package tests;

import client.Client;
import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ClientTest {


    @Test
    public void getEmployees() throws Exception {
        Client client = new Client();
         assertEquals("test",client.getEmployees().get(0).getFirstName());

    }


    @Test
    public void verifyPassword() throws Exception {
        Client client = new Client();
        assertEquals(true, client.verifyPassword(0, "test"));
    }

    @Test
    public void isAdmin() throws Exception {
    Client client = new Client();
    assertEquals(false, client.isAdmin(0));

    }

    @Test
    public void getOneEmployee() throws Exception {

        Client client = new Client();
        assertEquals("test", client.getOneEmployee(0).getFirstName());

    }


    @Test
    public void getWeekPlan() throws Exception {

        Client client = new Client();
        assertNotNull(client.getWeekPlan(1, Calendar.getInstance()));
    }

    @Test
    public void getShiftList() throws Exception {
    }

    @Test
    public void getStatus() throws Exception {

        Client client = new Client();
        assertEquals(true, client.getStatus(0));

    }

    @Test
    public void checkIn() throws Exception {

        Client client = new Client();
        client.checkIn(0);
        assertEquals(true, client.getStatus(0));

    }

    @Test
    public void checkOut() throws Exception {

        Client client = new Client();
        client.checkOut(0);
        assertEquals(true, client.getStatus(0));

    }

    @Test
    public void editUser() throws Exception
    {

    }


}