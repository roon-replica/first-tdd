package roon.learn.firsttdd.money;

public class Won {

	private int amount;

	public Won(int amount) {
		this.amount = amount;
	}

	public Won times(int multiplier) {
		return new Won(amount * multiplier);
	}

	@Override
	public boolean equals(Object obj) {
		var won = (Won) obj;
		return amount == won.amount;
	}
}
