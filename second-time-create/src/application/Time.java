package application;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Time{
	 static Date date1;																						//勤務ボタン実行時の日時(date型)
	 static Date date2;																						//退勤ボタン実行時の日時(date型)
	static long nowStart1;																				//勤務ボタン実行時の日時（long型)
	static long nowStop2;																				//退勤ボタン実行時の日時（long型)

	 public static long timer(long nowStart, long nowStop ) {

	    nowStart1 =  date1.getTime();
	    nowStop2 =  date2.getTime();

		long timeDiff = (nowStop - nowStart);

		 return timeDiff;																			//勤務時間


	 }

	 public static void timeSet1() {

		  date1 = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd/ HH:mm:ss");
        System.out.println(sdf1.format(date1));



        	}

	public static void timeSet2() {

		 date2 = new Date();
		 SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		 System.out.println(sdf2.format(date2));

		 long timeDiff = timer(nowStart1, nowStop2);					//timerメソッドの戻り値
		 System.out.println(timeDiff);
	 }


	 }




