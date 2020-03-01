package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;




public class MainPage {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<ListData> ListView;





    @FXML
    private TabPane Tab;

    @FXML
    private TableColumn<ListData, Long> listFinish;

    @FXML
    private BarChart<?, ?> BarChart;

    @FXML
    private Button BWork;

    @FXML
    private TableColumn<ListData, Long> listWork;


    @FXML
    private Tab TabChat;

    @FXML
    private Tab TabHome;

    @FXML
    private Button BFinish;

    @FXML
    private TableColumn<ListData, Integer> listTime;


    @FXML
    long onWork(ActionEvent event) {
    	ObservableList<ListData> list = ListView.getItems();								//detaの追加
		list.add(new ListData(Time.timeSet1(), 0,0));
		
      return Time.timeSet1();
    }

    @FXML
    long  onFinish(ActionEvent event) {
    	ObservableList<ListData> list = ListView.getItems();								//detaの追加
		list.add(new ListData(0, Time.timeSet2(),Time.timer()));
    	Time.timeSet2();
    	return Time.timer();
    	
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

        listWork.setCellValueFactory(new PropertyValueFactory<ListData, Long>("L1"));
		listFinish.setCellValueFactory(new PropertyValueFactory<ListData, Long>("L2"));
		listTime.setCellValueFactory(new PropertyValueFactory<ListData, Integer>("L3"));


		
    }

}
