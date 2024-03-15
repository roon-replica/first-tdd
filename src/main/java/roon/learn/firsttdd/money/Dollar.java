package roon.learn.firsttdd.money;

public class Dollar extends Money {

	public Dollar(int amount) {
		super(amount);
	}

	public Dollar times(int multiplier) {
		return new Dollar(amount * multiplier);
	}

	@Override
	String currency() {
		return "USD";
	}
}
