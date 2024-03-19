package roon.learn.firsttdd.money;

public abstract class Money {

	protected int amount;
	protected String currency;

	public Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	public static Dollar dollar(int amount) {
		return new Dollar(amount, "USD");
	}

	public static Won won(int amount) {
		return new Won(amount, "WON");
	}

	String currency() {
		return currency;
	}

	public abstract Money times(int multiplier);

	public boolean equals(Object obj) {
		Money money = (Money) obj;
		return this.amount == money.amount && this.getClass().equals(money.getClass());
	}
}
