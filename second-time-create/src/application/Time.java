package application;
import java.util.Date;

public class Time{
	 static Date data1;																						//勤務ボタン実行時の日時(date型)
	 static Date data2;																						//退勤ボタン実行時の日時(date型)
	static long nowStart1;																				//勤務ボタン実行時の日時（long型)
	static long nowStop2;																				//退勤ボタン実行時の日時（long型)
    static long timeDiff;
	 public static long timer(long nowStart, long nowStop ) {

	    nowStart1 =  data1.getTime();
	    nowStop2 =  data2.getTime();

		timeDiff = (nowStop - nowStart);

		 return timeDiff;																			//勤務時間


	 }

	 public static long timeSet1() {

       return nowStart1;
        	}

	 public static long timeSet2() {

		 return nowStop2;
	  }

	 }




