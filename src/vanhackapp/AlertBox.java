package vanhackapp;

import javafx.scene.control.Alert;
import javafx.stage.Modality;

/**
 *
 * @author Abdullahi Rilwan (abbaril@gmail.com)
 */
public class AlertBox {

    public static void errorBox(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.initModality(Modality.APPLICATION_MODAL);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setHeaderText(message);
        alert.showAndWait();
    }

    public static void correctBox(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.initModality(Modality.APPLICATION_MODAL);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setHeaderText(message);
        alert.showAndWait();
    }
}
