package coffeeshop;

public class Coffee extends CoffeePort {
	public  void  portSwitch() {
	
	 System.out.println("포트의 스위치를 작동시키려면 1을 눌러주시길 바랍니다");
		System.out.println("포트를 중단하시려면 2를 눌러주시길 바랍니다");
	 
	}

	
	public void portSound() {
		System.out.println("물이 다 끓었습니다!");
	}

	public int coffeeCup(int a) {
	return a;}
}
