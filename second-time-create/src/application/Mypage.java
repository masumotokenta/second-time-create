package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Mypage {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField textField1;


    @FXML
    void initialize() {
        assert textField1 != null : "fx:id=\"textField1\" was not injected: check your FXML file 'Mypage.fxml'.";

    }
}

