package vanhackapp;

import MySql_Jdbc.lib.Connector;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Abdullahi Rilwan (abbaril@gmail.com)
 */
public class TalentRegistrationController implements Initializable {

    @FXML
    private AnchorPane pane;

    @FXML
    private Label error_label;

    @FXML
    private JFXTextField firstName;

    @FXML
    private JFXTextField lastName;

    @FXML
    private JFXTextField email;

    @FXML
    private JFXPasswordField password;

    @FXML
    private JFXButton regBtn;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    //Top left icon that switch scene to mainUi
    @FXML
    private void backToMain(MouseEvent event) throws IOException {
        Parent mainRoot = FXMLLoader.load(getClass().getResource("VanhackMainUi.fxml"));
        VanhackApp.stage.getScene().setRoot(mainRoot);

    }

    /*
     *   Registeration Button 
     *   When cliked, btn will preocess and check 
     *   if the credentials supply, if all fields are not
     *   empty, then user get registered.
     */
    @FXML
    private void registrationBtn(ActionEvent event) throws SQLException {

        /*String sqlFirstName = firstName.getText().toString().trim();
        String sqlLastName = lastName.getText().toString().trim();
        String sqlEmail = email.getText().toString().trim();
        String sqlPassword = password.getText().toString().trim();

        try (Connection connect = Connector.connectDB()) {

            //check if all fields are not empty
            if (sqlFirstName.isEmpty() && sqlLastName.isEmpty() && sqlEmail.isEmpty() && sqlPassword.isEmpty()) {

                //report an error
                AlertBox.errorBox("VanHack", "Fill all fields!");

            } else {
                try (
                        //create a statement to register a new user
                        Statement statement = connect.createStatement()) {
                    String sql = ("INSERT INTO talent_user (firstName, lastName, email, password) VALUES('" + sqlFirstName + "', '" + sqlLastName + "',  '" + sqlEmail + "', '" + sqlPassword + "')");
                    statement.executeUpdate(sql);
                }

                //correct report here
                AlertBox.correctBox("VanHack", "Register successful!");
                regBtn.setText("Register Successful!");

                //close db connection
                connect.close();

                //clear all fields
                clearFields();

                System.out.println("Sign up...");
            }

        } catch (SQLException e) {
            //an error occure within the database 
            System.err.println("Database Connection failed!");
        }*/

    }

    //Clear fields after registration
    private void clearFields() {
        firstName.clear();
        lastName.clear();
        email.clear();
        password.clear();
        regBtn.setDisable(true);
    }

    //Top right icon that exit the app
    @FXML
    private void closeApp(MouseEvent event) {
        System.exit(0);
    }
}
