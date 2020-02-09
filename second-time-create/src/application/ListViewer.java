package application;
import Time;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class ListViewer {
	@FXML
	    private ListView<?> ListView;

	 @FXML
	 public static void onList1(ActionEvent e) {
		 Time.timeSet1();


	 }

	 @FXML
	 public static void onList2(ActionEvent e) {
		 Time.timeSet2();


	 }
}
