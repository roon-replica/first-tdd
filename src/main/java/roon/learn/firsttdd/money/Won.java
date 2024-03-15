package roon.learn.firsttdd.money;

public class Won extends Money {

	public Won(int amount) {
		super(amount);
	}

	public Won times(int multiplier) {
		return new Won(amount * multiplier);
	}

	@Override
	String currency() {
		return "WON";
	}
}
