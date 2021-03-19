package work;

import java.util.Scanner;

public class Min {

	public static void main(String[] args) {
		//min에 입력받음 분을
		//0종료
		//~시간 몇분인지 나타냄
		Scanner sc = new Scanner(System.in);
		int min = 0;
		System.out.println("계산하고 싶은 minute을 입력하시오");
		min = sc.nextInt();
		System.out.println(min/60 + "시간"+min%60 + "분");
		sc.close();
	}

}
