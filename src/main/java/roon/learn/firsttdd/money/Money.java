package roon.learn.firsttdd.money;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PACKAGE)
public class Money {

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

	public Money times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}

	@Override
	public boolean equals(Object obj) {
		var money = (Money) obj;

		return this.currency.equals(money.currency) &&
				this.amount == money.amount;
	}
}
