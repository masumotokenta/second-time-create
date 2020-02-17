package application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.chart.BarChart;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;



public class ListViewer {
	@FXML
	 private TableView<ListData> ListView;

	 @FXML
	 public static void listWork(ActionEvent e) {
		 TabelViewController.initialize(java.net.URL location, java.util.ResourceBundle resources);


	 }

	 @FXML
	 public static void listFinish(ActionEvent e) {
		 Time.timeSet2();


	 }
}
