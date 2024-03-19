package roon.learn.firsttdd.money;

public class Dollar extends Money {

	public Dollar(int amount) {
		this.amount = amount;
	}

	@Override
	public Dollar times(int multiplier) {
		return new Dollar(amount * multiplier);
	}
}
