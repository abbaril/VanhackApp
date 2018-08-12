package vanhackapp;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Abdullahi Rilwan (abbaril@gmail.com)
 */
public class VanhackApp extends Application {

    public static Stage stage = null;

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("VanhackMainUi.fxml"));
        
        
        Scene scene = new Scene(root);
        stage.setTitle("VanHack");
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene(scene);
        VanhackApp.stage = stage;
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
