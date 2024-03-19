package roon.learn.firsttdd.money;

public class Dollar extends Money {

	public Dollar(int amount, String currency) {
		super(amount,currency);
	}

	@Override
	public Dollar times(int multiplier) {
		return Money.dollar(amount * multiplier);
	}

}
