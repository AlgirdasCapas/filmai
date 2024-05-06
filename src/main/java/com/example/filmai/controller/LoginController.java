package com.example.filmai.controller;

import com.example.filmai.MainApplication;
import com.example.filmai.utils.Validation;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class LoginController {
    @FXML
    private Label loginStatus;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;

    @FXML
    protected void onLoginButtonClick() {
        String username2 = username.getText();
        String password2 = password.getText();
        if (Validation.isValidUsername(username2)) {
            loginStatus.setText("Username is valid");
        } else {
            loginStatus.setText("Username is not valid");
        }
    }

    @FXML
    public void onRegisterButtonClick(ActionEvent event) throws IOException {
        // uzkrovimas vaizdo
        Parent root = FXMLLoader.load(MainApplication.class.getResource("register-view.fxml"));
        Stage registerStage = new Stage();
        registerStage.setTitle("Register window");
        registerStage.setScene(new Scene(root, 600, 400));
        registerStage.show();
        ((Node) (event.getSource())).getScene().getWindow().hide();
        //kodas reikalingas paslepti pries tai buvusi langa
    }
}
