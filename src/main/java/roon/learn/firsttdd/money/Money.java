package roon.learn.firsttdd.money;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PACKAGE)
public class Money implements Expression {

	protected int amount;
	protected String currency;

	Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	static Money dollar(int amount) {
		return new Money(amount, "USD");
	}

	static Money won(int amount) {
		return new Money(amount, "WON");
	}

	String currency() {
		return currency;
	}

	@Override
	public Expression plus(Expression addend) {
		return new Sum(this, addend);
	}

	@Override
	public Money reduce(Bank bank, String to) {
		int rate = bank.rate(this.currency, to);
		return new Money(amount / rate, to);
	}

	@Override
	public Expression times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}

	@Override
	public boolean equals(Object obj) {
		var money = (Money) obj;

		return this.currency.equals(money.currency) &&
				this.amount == money.amount;
	}
}
