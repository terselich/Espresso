package sample.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.EmailManager;
import sample.view.ViewFactory;

public class LoginController extends MainController {

    @FXML
    private Button loginID;

    @FXML
    private TextField emailAddressID;

    @FXML
    private TextField passwordID;

    public LoginController(EmailManager emailManager, ViewFactory viewFactory, String fxmlName) {
        super(emailManager, viewFactory, fxmlName);
    }

    @FXML       //when user presses log in (credentials etc..)
    void loginAction() {
        viewFactory.showMainFrame();
        //get stage casting pretty bad way but threre is no other way
        Stage st = (Stage)loginID.getScene().getWindow();
        viewFactory.closeStage(st);
    }

}
