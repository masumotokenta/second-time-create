package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.Window;

public class SampleController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Butten;

    @FXML
    void ButtenOnAction1(ActionEvent event) {Scene s = ((Node)event.getSource()).getScene();
	Window window = s.getWindow();
	window.hide();

	try {
		Parent parent = FXMLLoader.load(getClass().getResource("MainPage.fxml"));
		Scene scene = new Scene(parent);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.setTitle("Mypage");
		stage.show();
	}catch(IOException e) {
		e.printStackTrace();
	}

    }

    @FXML
    void initialize() {
        assert Butten != null : "fx:id=\"Butten\" was not injected: check your FXML file 'Sample.fxml'.";

    }
}
