package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Rogin {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Butten;

    @FXML
    void ButtenOnAction1(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert Butten != null : "fx:id=\"Butten\" was not injected: check your FXML file 'Sample.fxml'.";

    }
}
