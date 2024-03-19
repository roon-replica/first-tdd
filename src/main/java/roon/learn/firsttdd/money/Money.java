package roon.learn.firsttdd.money;

public class Money {
	protected int amount;

	public boolean equals(Object obj) {
		Money money = (Money) obj;
		return this.amount == money.amount;
	}
}
