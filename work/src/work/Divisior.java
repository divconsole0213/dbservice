package work;

import java.util.Scanner;

public class Divisior {

	public static void main(String[] args) {
//		아래의 조건을 참고 및 추리하여 코드를 작성해보세요.
//		a. 정수 1개를 입력 받기
//		b. 그 정수의 약수를 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 1개를 입력하시면 그 정수의 약수를 출력해 드립니다.");	
		int i;
		i = sc.nextInt();
		
	    for(int n = 1; i>=n; n++) {
	    	if( i % n == 0) {
	    	System.out.println(n);
	    }
	    }
		sc.close();
	}

}
