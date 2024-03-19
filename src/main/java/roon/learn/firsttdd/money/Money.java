package roon.learn.firsttdd.money;

public class Money implements Expression {

	protected int amount;
	protected String currency;

	public Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	public static Money dollar(int amount) {
		return new Money(amount, "USD");
	}

	public static Money won(int amount) {
		return new Money(amount, "WON");
	}

	@Override
	public Money reduce(String currency) {
		return this;
	}

	public Expression plus(Money addend) {
		return new Sum(this, addend);
	}

	String currency() {
		return currency;
	}

	public Money times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}

	public boolean equals(Object obj) {
		Money money = (Money) obj;
		return this.amount == money.amount && this.currency.equals(money.currency);
	}
}
