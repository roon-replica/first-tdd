package roon.learn.firsttdd.money;

public class Dollar {

	private final int amount;

	public Dollar(int amount) {
		this.amount = amount;
	}

	public Dollar times(int multiplier) {
		return new Dollar(amount * multiplier);
	}

	@Override
	public boolean equals(Object obj) {
		Dollar dollar = (Dollar) obj;
		return this.amount == dollar.amount;
	}
}
