package roon.learn.firsttdd.money;

public class Won {

	private final int amount;

	public Won(int amount) {
		this.amount = amount;
	}

	public Won times(int multiplier) {
		return new Won(amount * multiplier);
	}

	@Override
	public boolean equals(Object obj) {
		Won won = (Won) obj;
		return this.amount == won.amount;
	}
}
