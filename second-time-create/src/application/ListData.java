package application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.LongProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleLongProperty;


public class ListData {
	private SimpleLongProperty L1;
	private SimpleLongProperty L2;
	private SimpleIntegerProperty L3;
	
	
	;

		public ListData(long xx, long  yy, int zz) {
			L1 = new SimpleLongProperty(xx);
	        L2 = new SimpleLongProperty(yy);
	        L3 = new SimpleIntegerProperty(zz);
			


		}
		public  LongProperty L1Property() {
			
			return L1;
		}


		public LongProperty L2Property() {
			return L2;
		}
		
		public  IntegerProperty L3Property() {
			return L3;
		}
	}

