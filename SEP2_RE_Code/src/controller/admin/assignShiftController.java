package controller.admin;

import client.Client;
import view.admin.assignShift.assignShiftView;
public class assignShiftController {

    private assignShiftView view;
    private Client client;

    public assignShiftController(assignShiftView view, Client client) {
        this.client = client;
        this.view = view;
    }

}
