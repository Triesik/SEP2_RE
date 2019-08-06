package view.admin.assignShift;

import controller.admin.assignShiftController;

public class assignShiftGUI implements assignShiftView {
    private assignShiftController assignShiftController;

    public assignShiftGUI() {
        this.assignShiftController = new assignShiftController(this);
    }

}
