package roon.learn.firsttdd.money;

public class Sum implements Expression {

	Money augend;
	Money addend;

	Sum(Money augend, Money addend) {
		this.augend = augend;
		this.addend = addend;
	}

	@Override
	public Money reduce(Bank bank, String currency) {
		int rateAug = bank.rate(this.augend.currency, currency);
		int rateAdd = bank.rate(this.addend.currency, currency);

		int amount = augend.amount * rateAug + addend.amount * rateAdd;
		return new Money(amount, currency);
	}

}
