package work;

public class star2 {

	public static void main(String[] args) {
//		a. 아래의 형태로 별 출력
//		*****
//		****
//		***
//		**
//		*

for(int j = 5; j > 0; j--) {
	for(int i = 0; i < j; i++) {
		System.out.print("*");
}
	System.out.println();
	}


	
	for(int i = 0; i  < 5; i++) {
		for(int j = 0; j <= i ; j++) {
			System.out.print("*");
		}
		System.out.println();
	}

}
}