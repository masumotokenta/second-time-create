package application;

	import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;



	public  class TabelViewController implements javafx.fxml.Initializable {

		public TableView<ListData> ListView;
		public TableColumn<ListData, Long> listWork;
		public TableColumn<ListData, Long> listFinish;
		public TableColumn<ListData, Long> listTime;

		@Override
		public void initialize(java.net.URL location, java.util.ResourceBundle resources) {


			listWork.setCellValueFactory(new PropertyValueFactory<ListData, Long>("value1"));
			listFinish.setCellValueFactory(new PropertyValueFactory<ListData, Long>("value2"));
			listTime.setCellValueFactory(new PropertyValueFactory<ListData, Long>("value3"));


			ObservableList<ListData> list = ListView.getItems();								//detaの追加
			list.add(new ListData(Time.nowStart1, Time.nowStop2,Time.timeDiff));
		}
	}

