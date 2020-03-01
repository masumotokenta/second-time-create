package application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;



public class ListViewer {
	@FXML
	 private TableView<ListData> ListView;

	 @FXML
	 public  void listWork(ActionEvent e) {
		 ObservableList<ListData> list = ListView.getItems();								//detaの追加
			list.add(new ListData(Time.nowStart1, Time.nowStop2,Time.timeDiff));


	 }

	 @FXML
	 public static void listFinish(ActionEvent e) {
		 Time.timeSet2();


	 }
}
