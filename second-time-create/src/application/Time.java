package application;
import java.util.Date;

public class Time{
	
	static Date date1=new Date();
	static Date date2 =new Date();
	static long  nowStart1;
	static long nowStop2;
	static long timeDiff;
	
	 public  static int timer  () {


		 date2.compareTo  (date1);
		 System.out.println( date2.compareTo  (date1));

		 return date2.compareTo  (date1);







	 }

	 public   static long timeSet1() {


		 nowStart1=date1.getTime();
       System.out.println(nowStart1);
       return nowStart1;

        	}

	 public static long timeSet2() {

		  nowStop2=date2.getTime();
		 System.out.println(nowStop2);
		 return nowStop2;

	  }

	 }




