package application;

public class Id {
	final String id_1= "akinobu satou";                                                   //アカウントID（佐藤）
	final String id_2= "kenta masumoto";                                              //アカウントID（増本）
	
	void id() {
	     System.out.println("Your ID");
	     String ID =new java.util.Scanner( System.in ).nextLine();    		 // IDを入力

	     switch (ID) {																				//アカウントの検索
	     case  id_1:
	    	 System.out.println("akinobu satou");
	         break;

	     case  id_2:
	    	 System.out.println("kenta masumoto");
	    	 break;

	     default:
	    	 System.out.println("IDが不正です");
	    	 break;

	     }

	}
}
