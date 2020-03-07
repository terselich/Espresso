package sample.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.EmailManager;
import sample.controller.LoginController;
import sample.controller.MainController;
import sample.controller.MainFrameController;

import java.net.URL;

import java.io.IOException;

public class ViewFactory {
    //Member variables
    private EmailManager emailManager;

    //Member methods
    public ViewFactory(EmailManager emailManager) {
        this.emailManager = emailManager;
    }

    public void showLoginFrame(){
        //create main controller to pass the FXML file
        MainController theController = new LoginController(emailManager, this, "Login.fxml");
        //call init to render
        initStage(theController);
    }

    public void showMainFrame(){
        //create main controller to pass the FXML file
        MainController theController = new MainFrameController(emailManager, this, "MainFrame.fxml");
        //call init to render
        initStage(theController);
    }

    public void closeStage(Stage stageToClose){
        //close stage (frame)
        stageToClose.close();
    }

    private void initStage(MainController mainController){
        FXMLLoader loaderFXML= new FXMLLoader(getClass().getResource(mainController.getFXMLName()));
        //load FXML file (Login.FXML)
        loaderFXML.setController(mainController);
        //parent frame..
        Parent parent;
        try {
            parent = loaderFXML.load();
        }catch(IOException e){
            e.printStackTrace();
            return;
        }
        //create a new scene and set the scene in the new stage of the program
        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
}
