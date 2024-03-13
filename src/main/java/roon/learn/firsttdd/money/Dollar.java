package roon.learn.firsttdd.money;

public class Dollar extends Money{

	public Dollar(int amount) {
		this.amount = amount;
	}

	public Dollar times(int multiplier) {
		return new Dollar(amount * multiplier);
	}

	@Override
	public boolean equals(Object obj) {
		var dolloar = (Dollar) obj;
		return amount == dolloar.amount;
	}
}
