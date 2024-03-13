package roon.learn.firsttdd.money;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PACKAGE)
public class Money {

	protected int amount;

	Money(int amount) {
		this.amount = amount;
	}

	@Override
	public boolean equals(Object obj) {
		var money = (Money) obj;

		return this.amount == money.amount;
	}
}
