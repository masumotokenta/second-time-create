package application;

import java.net.URL;
import java.util.ResourceBundle;

import Botton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableView;

public class MainPage {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<?> ListView;

    @FXML
    private TabPane Tab;

    @FXML
    private BarChart<?, ?> BarChart;

    @FXML
    private Button BWork;

    @FXML
    private Tab TabChat;

    @FXML
    private Tab TabHome;

    @FXML
    private Button BFinish;

    @FXML
    void onWork(ActionEvent event) {
     Botton.onClick1(event);

    }
    @FXML
    void onClick2(ActionEvent event) {
     Botton.onClick2(event);

    }

    @FXML
    void initialize() {
        assert ListView != null : "fx:id=\"ListView\" was not injected: check your FXML file 'MainPage.fxml'.";
        assert Tab != null : "fx:id=\"Tab\" was not injected: check your FXML file 'MainPage.fxml'.";
        assert BarChart != null : "fx:id=\"BarChart\" was not injected: check your FXML file 'MainPage.fxml'.";
        assert BWork != null : "fx:id=\"BWork\" was not injected: check your FXML file 'MainPage.fxml'.";
        assert TabChat != null : "fx:id=\"TabChat\" was not injected: check your FXML file 'MainPage.fxml'.";
        assert TabHome != null : "fx:id=\"TabHome\" was not injected: check your FXML file 'MainPage.fxml'.";
        assert BFinish != null : "fx:id=\"BFinish\" was not injected: check your FXML file 'MainPage.fxml'.";

    }
}
