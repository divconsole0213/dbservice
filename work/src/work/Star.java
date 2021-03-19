package work;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
//		a. 한 라인에 출력할 별의 개수(양의 정수) 입력 받기
//		b. 출력할 라인의 개수(양의 정수) 입력 받기
//		c. 입력한 정보 만큼 별 출력
Scanner sc = new Scanner(System.in);
System.out.println("*의 개수를 입력하시오");
int i ;
i = sc.nextInt();
System.out.println("출력할 줄의 길이 입력하시오");
int j;
j = sc.nextInt();
  for(int y = 0; y < j; y++) {
	 for(int x = 0; x <i; x++) {
		 System.out.print("*");
}
	 System.out.println();
	}
System.out.println();
	//반복문을 돌릴때 세로가 아웃도어다 그 이유는 줄이 개수를 감싸기 때문이다.
sc.close();
}
}