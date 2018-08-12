package vanhackapp;

import MySql_Jdbc.lib.Connector;
import com.jfoenix.controls.JFXButton;
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
 * @author user
 */
public class CompanyRegistrationController implements Initializable {

    @FXML
    private AnchorPane companyPane;

    @FXML
    private JFXTextField firstName;

    @FXML
    private JFXTextField lastName;

    @FXML
    private JFXTextField phone;

    @FXML
    private JFXTextField website;

    @FXML
    private JFXTextField email;

    @FXML
    private JFXTextField confirmEmail;

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
     *   if the credentials supply are corect and all fields are not
     *   empty, then company get registered.
     */
    @FXML
    private void registrationBtn(ActionEvent event) throws SQLException {

        /*String sqlFirstName = firstName.getText().trim();
        String sqlLastName = lastName.getText().trim();
        String sqlPhone = phone.getText().trim();
        String sqlWebsite = website.getText().trim();
        String sqlEmail = email.getText().trim();
        String sqlConfirmEmail = confirmEmail.getText().trim();

        try (Connection connect = Connector.connectDB()) {

            //check if all fields are not empty
            if (sqlFirstName.isEmpty() && sqlLastName.isEmpty() && sqlPhone.isEmpty() && sqlWebsite.isEmpty() && sqlEmail.isEmpty() && sqlConfirmEmail.isEmpty()) {

                //report an error
                AlertBox.errorBox("VanHack", "Fill all fields!");
            } else {
                try (
                        //create a statement to register a new user
                        Statement statement = connect.createStatement()) {
                    String sql = ("INSERT INTO company (firstName, lastName, phone, website, email, confirmEmail) VALUES('" + sqlFirstName + "', '" + sqlLastName + "',  '" + sqlPhone + "', '" + sqlWebsite + "', '" + sqlEmail + "', '" + sqlConfirmEmail + "')");
                    statement.executeUpdate(sql);
                }
                AlertBox.correctBox("VanHack", "Register successful");
                regBtn.setText("Register Successful!");

                //close db connection
                connect.close();

                //clear all fields
                clearFields();

            }

        } catch (SQLException e) {
            //an error occure within the database 
            System.err.println("Database Connection failed!");
        }*/

    }

    //clear all fields after registration
    private void clearFields() {
        firstName.clear();
        lastName.clear();
        phone.clear();
        website.clear();
        email.clear();
        confirmEmail.clear();
        regBtn.setDisable(true);
    }

    //Top right icon that exit the app
    @FXML
    private void closeApp(MouseEvent event) {
        System.exit(0);
    }

}
