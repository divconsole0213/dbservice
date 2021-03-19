package coffeeshop;

public abstract class CoffeePort {

	public abstract void portSwitch();
	public abstract void portSound();
	public void portColor() {
		System.out.println("white");
	}
}