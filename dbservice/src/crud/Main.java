package crud;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("어떤 서비스를  이용하시겠습니까?");
		System.out.println("1. sql/ 2.oracle");
		Scanner sc = new Scanner(System.in);
		int n;
		n=sc.nextInt();
		System.out.println("1. 입력 / 2. 조회 / 3. 수정 / 4. 삭제");
		int num;
		num = sc.nextInt();
		switch(n) {
		case 1 :
			 MySql sql = new MySql(); 
			 sql.MySql();
			 break;
		case 2 : 
			Oracle or = new Oracle();
	        or.Oracle();
	        break;
	     default :
	    	 System.out.println("잘못누르셨습니다");
		     break;
		}
		
	 DbService db = new DbService();
	 switch(num) {
	
	 case 1 : db.create();
	 break;
	 case 2 :  db.read();
	 break;
	 case 3 : db.update();
	 break;
	 case 4 : db.delete();
	 break;
	 default :
		 System.out.println("잘못 누르셨습니다");
		 break;
	 }

sc.close();

	}

}
