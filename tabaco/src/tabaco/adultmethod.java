package tabaco;

public class adultmethod {
 protected static void Age(int a) {
	 if( a < 18) {
		 System.out.println("No");
	 }
	 else if ( a == 18) {
		 System.out.println("18세부터 담배를 필수 있으나 권장사항은 아닙니다");
	 }
	 else {
		 System.out.println("담배를 사실 수 있습니다");
	 }
 }
}
