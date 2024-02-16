package org.example.login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML
    public TextField username;
    @FXML
    public TextField password;
    @FXML
    public Button SignIn;
    @FXML
    public TextField email;
    @FXML
    public TextField mobile;
    @FXML
    public TextField confirm;
    @FXML
    public TextField age;
    @FXML
    public TextField birthday;
    @FXML
    public TextField gender;
    @FXML
    public TextField civil;
    @FXML
    public TextField country;
    @FXML
    public TextField fname;
    @FXML
    public TextField lname;
    @FXML
    private Label welcomeText;

    public void signup (ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("signup.fxml"));

        Parent signupPane = loader.load();

        // Create a new stage for the signup pane
        Stage signupStage = new Stage();
        signupStage.setTitle("Sign Up");
        signupStage.setScene(new Scene(signupPane));
        signupStage.show();

    }

    public void clear (ActionEvent event) throws IOException {
        fname.clear();
        lname.clear();
        age.clear();
        gender.clear();
        civil.clear();
        country.clear();
        email.clear();
        mobile.clear();
        confirm.clear();
        username.clear();
        password.clear();
    }

    public void submit (ActionEvent event) throws IOException{
        System.out.println("Successfully submitted....");

    }

}