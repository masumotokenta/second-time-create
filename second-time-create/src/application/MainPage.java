package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
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
    private TableColumn<?, ?> listFinish;

    @FXML
    private BarChart<?, ?> BarChart;

    @FXML
    private Button BWork;

    @FXML
    private TableColumn<?, ?> listWork;

    @FXML
    private Tab TabChat;

    @FXML
    private Tab TabHome;

    @FXML
    private Button BFinish;

    @FXML
    private TableColumn<?, ?> listTime;

    @FXML
    void onWork(ActionEvent event) {
    	 ListViewer.listWork(event);
    }

    @FXML
    void onFinish(ActionEvent event) {
    	ListViewer.listFinish(event);
    }

    @FXML
    void initialize() {
        assert ListView != null : "fx:id=\"ListView\" was not injected: check your FXML file 'MainPage.fxml'.";
        assert Tab != null : "fx:id=\"Tab\" was not injected: check your FXML file 'MainPage.fxml'.";
        assert listFinish != null : "fx:id=\"listFinish\" was not injected: check your FXML file 'MainPage.fxml'.";
        assert BarChart != null : "fx:id=\"BarChart\" was not injected: check your FXML file 'MainPage.fxml'.";
        assert BWork != null : "fx:id=\"BWork\" was not injected: check your FXML file 'MainPage.fxml'.";
        assert listWork != null : "fx:id=\"listWork\" was not injected: check your FXML file 'MainPage.fxml'.";
        assert TabChat != null : "fx:id=\"TabChat\" was not injected: check your FXML file 'MainPage.fxml'.";
        assert TabHome != null : "fx:id=\"TabHome\" was not injected: check your FXML file 'MainPage.fxml'.";
        assert BFinish != null : "fx:id=\"BFinish\" was not injected: check your FXML file 'MainPage.fxml'.";
        assert listTime != null : "fx:id=\"listTime\" was not injected: check your FXML file 'MainPage.fxml'.";

    }
}





