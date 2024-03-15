package roon.learn.firsttdd.money;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PACKAGE)
public abstract class Money {

	protected int amount;
	protected String currency;

	Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	static Money dollar(int amount) {
		return new Dollar(amount, "USD");
	}

	static Money won(int amount) {
		return new Won(amount, "WON");
	}

	String currency() {
		return currency;
	}

	abstract Money times(int amount);

	@Override
	public boolean equals(Object obj) {
		var money = (Money) obj;

		return this.getClass().equals(money.getClass()) &&
				this.amount == money.amount;
	}
}
