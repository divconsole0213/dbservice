package work;

import java.util.Scanner;

public class Multiple_1 {

	public static void main(String[] args) {
//		a. 3자리 양의 정수 1개를 입력 받기 (limitNum)
//		b. 크기가 다른 1자리 양의 정수 2개를 입력 받기(a, b)
//		c. limitNum안의 a와b의 배수 개수 출력
Scanner sc = new Scanner(System.in);
int limitNum = 0;
System.out.println("3자리 양의 정수 1개를 입력하시오");
limitNum = sc.nextInt();
System.out.println("크기가 다른 1자리의 양의 정수 2개를 입력하시오");
System.out.println("a를 입력하시오");
int a = 0;
a = sc.nextInt();
System.out.println("b를 입력하시오");
int b = 0;
b = sc.nextInt();
System.out.println("limitNum안의 a배수의 개수와 b배수의 개수입니다");
int x = limitNum/a;
int y = limitNum/b;
System.out.println(limitNum/a);
System.out.println(limitNum/b);
sc.close();

	}





}
