package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.controller.LoginController;
import sample.controller.MainController;
import sample.view.ViewFactory;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        ViewFactory view = new ViewFactory(new EmailManager());
        view.showLoginFrame();
        //view.showMainFrame();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
