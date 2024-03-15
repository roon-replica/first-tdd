package roon.learn.firsttdd.money;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PACKAGE)
public abstract class Money {

	protected int amount;

	Money(int amount) {
		this.amount = amount;
	}

	static Money dollar(int amount) {
		return new Dollar(amount);
	}

	static Money won(int amount) {
		return new Won(amount);
	}

	abstract String currency();

	abstract Money times(int amount);

	@Override
	public boolean equals(Object obj) {
		var money = (Money) obj;

		return this.getClass().equals(money.getClass()) &&
				this.amount == money.amount;
	}
}
