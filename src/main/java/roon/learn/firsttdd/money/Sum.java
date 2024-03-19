package roon.learn.firsttdd.money;

public class Sum implements Expression {

	Money augend;
	Money addend;

	Sum(Money augend, Money addend) {
		this.augend = augend;
		this.addend = addend;
	}

	@Override
	public Money reduce(String currency) {
		int amount = augend.amount + addend.amount;
		return new Money(amount, currency);
	}

}
