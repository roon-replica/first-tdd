package roon.learn.firsttdd.money;

public class Won extends Money {

	public Won(int amount, String currency) {
		super(amount, currency);
	}

	public Money times(int multiplier) {
		return Money.won(amount * multiplier);
	}
}
