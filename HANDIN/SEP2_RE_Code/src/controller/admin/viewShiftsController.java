package controller.admin;

import client.Client;
import domain.model.shift.Shift;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import view.admin.viewShifts.viewShiftsView;

public class viewShiftsController {
    public viewShiftsView view;
    public Client client;

    public viewShiftsController(viewShiftsView view, Client client) {
        this.view = view;
        this.client = client;
    }


    public ObservableList<Shift> getTableData() throws Exception {
        ObservableList<Shift> shiftList = FXCollections.observableArrayList(client.getShiftList());

        return shiftList;
    }

    public void removeShift(int id) throws Exception {
        client.removeShift(id);
    }
}
