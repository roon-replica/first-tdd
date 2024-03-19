package roon.learn.firsttdd.money;

public class Won extends Money {

	public Won(int amount) {
		this.amount = amount;
	}

	public Won times(int multiplier) {
		return new Won(amount * multiplier);
	}
}
