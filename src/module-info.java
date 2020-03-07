module DeskTerseEmail
{
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.web;
    requires activation;
    requires java.mail;
    
    opens sample.view;
    opens sample.controller;
}