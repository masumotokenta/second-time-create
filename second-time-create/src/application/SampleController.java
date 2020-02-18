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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.Window;

public class SampleController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    
    @FXML
    private TextField ID;

    @FXML
    private PasswordField PASS;

  


  
    
	@FXML
    void ButtenOnAction1(ActionEvent event) {
		ID.getText();
		PASS.getText();
		
		String o1 = "Akinobusato";
		String o2 = "Kentamasumoto";
		
		String o3 ="Akinobusato";
		String o4 ="Kentamasumoto";
		if( (getText1().equals(o1)&&(getText2().equals(o3))||getText1().equals(o2)&&(getText2().equals(o4)))){ 
			
    	Scene s = ((Node)event.getSource()).getScene();
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
	}
		
    




	

    
	

	private Object getText1() {
		return ID.getText();
	}


	private Object getText2() {
		return PASS.getText();
	}







	@FXML
	void initialize() {
        assert PASS != null : "fx:id=\"PASS\" was not injected: check your FXML file 'Sample.fxml'.";
        assert ID != null : "fx:id=\"ID\" was not injected: check your FXML file 'Sample.fxml'.";

    }
	}
   
    

