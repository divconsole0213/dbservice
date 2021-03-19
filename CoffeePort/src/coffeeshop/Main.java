package coffeeshop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Coffee coffee = new Coffee();
		coffee.portSwitch();
		Scanner sc = new Scanner(System.in);
		
		int switchOn = 0;
		 switchOn = sc.nextInt();
		
		if(switchOn == 1) {
			System.out.println("포트가 켜집니다");
			coffee.portSound();
		    System.out.println(coffee.coffeeCup(2)+"잔 따를 수 있습니다.");
		    System.out.println("커피잔의 색 : ");
		    coffee.portColor();
		}
		else if(switchOn == 2) {
			System.out.println("포트가 꺼집니다");
		}
		else {
			System.out.println("잘못 누르셨습니다 다시 눌러주시길 바랍니다");
		}
		
		
		sc.close();

	}

}
