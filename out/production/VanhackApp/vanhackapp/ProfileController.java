package vanhackapp;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;

/**
 *
 * @author user
 */
public class ProfileController implements Initializable {

    @FXML
    private AnchorPane userPane;

    @FXML
    private ChoiceBox<String> choiceBox;
    @FXML
    private Circle center_circle;
    @FXML
    private Circle left_circle;
    @FXML
    private HBox personal_pane;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        choiceBox.getItems().removeAll(choiceBox.getItems());
        choiceBox.getItems().addAll("Female", "Male", "Prefer not to say");
        choiceBox.getSelectionModel().select("Prefer not to say");

        center_circle.setStroke(Color.BLUE);
        Image image = new Image("vanhackapp/vanhack.jpg", false);
        center_circle.setFill(new ImagePattern(image));
        center_circle.setEffect(new DropShadow(+25d, 0d, +2d, Color.WHITE));

        left_circle.setStroke(Color.BLUE);
        left_circle.setFill(new ImagePattern(image));
        left_circle.setEffect(new DropShadow(+25d, 0d, +2d, Color.WHITE));
        

    }

    @FXML
    private void show_personal_info(MouseEvent event) throws IOException {
        
        Parent personal = FXMLLoader.load(getClass().getResource("PersonalInfoUi.fxml"));
        personal_pane.getChildren().removeAll();
        personal_pane.getChildren().setAll(personal);
        
       
    }

    @FXML
    private void sho_proInfo(MouseEvent event) throws IOException {
        /*Parent pro = FXMLLoader.load(getClass().getResource("ProfessionaInfoUi.fxml"));
        personal_pane.getChildren().removeAll();
        personal_pane.getChildren().setAll(pro);*/
    }

    @FXML
    private void show_education(MouseEvent event) throws IOException {
        Parent edu = FXMLLoader.load(getClass().getResource("EducationUi.fxml"));
        personal_pane.getChildren().removeAll();
        personal_pane.getChildren().setAll(edu);
    }

    @FXML
    private void show_skills(MouseEvent event) throws IOException {
        Parent skills = FXMLLoader.load(getClass().getResource("SkillsUi.fxml"));
        personal_pane.getChildren().removeAll();
        personal_pane.getChildren().setAll(skills);
    }

    @FXML
    private void show_goals_location(MouseEvent event) throws IOException {
        Parent goal = FXMLLoader.load(getClass().getResource("SkillsUi.fxml"));
        personal_pane.getChildren().removeAll();
        personal_pane.getChildren().setAll(goal);
    }

    @FXML
    private void show_visa_status(MouseEvent event) throws IOException {
        Parent goal = FXMLLoader.load(getClass().getResource("VisaUi.fxml"));
        personal_pane.getChildren().removeAll();
        personal_pane.getChildren().setAll(goal);
    }

    @FXML
    private void show_resume(MouseEvent event) throws IOException {
        Parent goal = FXMLLoader.load(getClass().getResource("ResumeVS.fxml"));
        personal_pane.getChildren().removeAll();
        personal_pane.getChildren().setAll(goal);
    }

}
