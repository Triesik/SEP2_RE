package controller.admin;

import client.Client;
import view.admin.dashBoard.dashBoardView;

public class dashBoardController {
    public dashBoardView view;
    public Client client;


    public dashBoardController(dashBoardView view, Client client) {
        this.view = view;
        this.client = client;
    }
}
