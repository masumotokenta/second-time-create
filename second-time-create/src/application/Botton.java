import application.ListViewer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;


public class Botton {

	@FXML
    private Button BWork;

	@FXML
	public static void onClick1(ActionEvent e) {
		ListViewer.onList1(e);

	}
		@FXML
		public static void onClick2(ActionEvent e) {
			ListViewer.onList2(e);

	}
}
