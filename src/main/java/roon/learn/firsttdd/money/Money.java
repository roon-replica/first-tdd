package roon.learn.firsttdd.money;

public abstract class Money {

	protected int amount;

	public static Dollar dollar(int amount) {
		return new Dollar(amount);
	}

	public static Won won(int amount) {
		return new Won(amount);
	}

	public abstract Money times(int multiplier);

	public boolean equals(Object obj) {
		Money money = (Money) obj;
		return this.amount == money.amount && this.getClass().equals(money.getClass());
	}
}
