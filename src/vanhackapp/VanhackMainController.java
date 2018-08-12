package vanhackapp;

import MySql_Jdbc.lib.Connector;
import java.sql.*;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author Abdullahi Rilwan (abbaril@gmail.com)
 */
public class VanhackMainController implements Initializable {

    private double xoffset = 0;
    private double yoffset = 0;

    @FXML
    private AnchorPane parent;

    @FXML
    private Pane contentArea;
    @FXML
    private JFXTextField email;
    @FXML
    private JFXPasswordField password;
    @FXML
    private JFXButton loginBtn;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        makeStageDragable();

    }

    /*
     * Drage and drop the entire stage
     * while on dragging, the entire stage changes opacity
     */
    public void makeStageDragable() {
        //press here
        parent.setOnMousePressed((event) -> {

            xoffset = event.getSceneX();
            yoffset = event.getSceneY();
        });

        //Drag here
        parent.setOnMouseDragged((event) -> {

            VanhackApp.stage.setX(event.getScreenX() - xoffset);
            VanhackApp.stage.setY(event.getScreenY() - yoffset);
            VanhackApp.stage.setOpacity(0.7f);
        });

        //Drop drag here
        parent.setOnDragDone((e) -> {

            VanhackApp.stage.setOpacity(1.0f);

        });

        //Release here
        parent.setOnMouseReleased((e) -> {

            VanhackApp.stage.setOpacity(1.0f);
        });
    }

    /*
     * Talent link, which switch scene to
     * company TalentRegistrationUi
     */
    @FXML
    private void talentRegistration(MouseEvent event) throws IOException {

        Parent regRoot = FXMLLoader.load(getClass().getResource("TalentRegistrationUi.fxml"));
        contentArea.getChildren().removeAll();
        contentArea.getChildren().setAll(regRoot);

    }

    /*
     * Company link, which switch scene to
     * company CompanyRegistrationUi
     */
    @FXML
    private void companyRegistraion(MouseEvent event) throws IOException {

        Parent companyRoot = FXMLLoader.load(getClass().getResource("CompanyRegistrationUi.fxml"));
        contentArea.getChildren().removeAll();
        contentArea.getChildren().setAll(companyRoot);

    }
    

    /*
     * This the MainApp login button
     * it authenticate the credentials supply
     * if they match the fields in our database
     * user get access to their account
     */
    @FXML
    private void userLogin(ActionEvent event) throws SQLException, IOException {
        //Database and user authentication here.....

        ((Node) event.getSource()).getScene().getWindow().hide();

        Stage stage = new Stage();
        stage.setTitle("VanHack");

        FXMLLoader loader = new FXMLLoader();
        Parent profile = FXMLLoader.load(getClass().getResource("ProfileUi.fxml"));
        ProfileController control = (ProfileController) loader.getController();

        Scene scene = new Scene(profile);
        stage.setScene(scene);
        stage.show();

        /*String sql_email = email.getText().trim();
        String sql_password = password.getText().trim();

        try (Connection connect = Connector.connectToDb()) {

            //check if email and password are not empty
            //process, if email and password are correct then open user profile UI
            if (sql_email.isEmpty() && sql_password.isEmpty()) {

                //report error here
                AlertBox.errorBox("VanHack", "Fill all fields!");

            } else try {

                String sql = ("SELECT id FROM user_in WHERE email = ? AND password = ?");
                PreparedStatement preparedStatement = connect.prepareStatement(sql);
                preparedStatement.setString(1, sql_email);
                preparedStatement.setString(2, sql_password);
                ResultSet result = preparedStatement.executeQuery();

                //if email and password do not match? alert the user
                if (!result.next()) {

                    //report error here
                    AlertBox.errorBox("VanHack", "Enter correct email and password");

                } else {
                    //if all is correct, open profile Ui
                    ((Node) event.getSource()).getScene().getWindow().hide();
                     Stage stage = new Stage();
                     stage.setTitle("VanHack");
        
                     FXMLLoader loader = new FXMLLoader();
                     Parent profile = FXMLLoader.load(getClass().getResource("ProfileUi.fxml"));
                     ProfileController control = (ProfileController) loader.getController();
        
                     Scene scene = new Scene(profile);
                     stage.setScene(scene);
                     stage.show();
                    
                }

                preparedStatement.close();
                result.close();

            } catch (SQLException e) {
                System.err.println(e);
            }


            connect.close();

        } catch (SQLException e) {
            System.err.println("Database Connection failed!");
        }*/
    }
    
    //Top right icon that exit the mainApp
    @FXML
    private void closeApp(MouseEvent event) {

        //Exit the whole App
        System.exit(0);
    }

}
