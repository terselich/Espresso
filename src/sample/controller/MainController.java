package sample.controller;

import sample.EmailManager;
import sample.view.ViewFactory;

public abstract class MainController {
    //Member variables
    protected EmailManager emailManager;
    protected ViewFactory viewFactory;
    protected String fxmlName;

    //Member methods
    public MainController(EmailManager emailManager, ViewFactory viewFactory, String fxmlName) {
        this.emailManager = emailManager;
        this.viewFactory = viewFactory;
        this.fxmlName = fxmlName;
    }

    public String getFXMLName(){
        return fxmlName;
    };
}