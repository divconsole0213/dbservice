package work;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        int a = 2;
        System.out.println("곱셈하고 싶은 단을 입력하시오");
        a = sc.nextInt();
        	for( int j = 1; j < 10; j++) {
        		System.out.println(a*j);
        	}
        
        sc.close();
	}


	

}
