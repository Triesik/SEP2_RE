package controller.login;

import view.login.loginView;

public class loginController {
    public loginView view;

    public loginController(loginView view) {
        this.view = view;
    }

    public void loginBtnPressed() {
        System.out.println("Login Button pressed");
    }
}
