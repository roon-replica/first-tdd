package roon.learn.firsttdd.money;

public class Bank {

	public Money reduce(Expression source, String to) {
		if (source instanceof Money money) {
			return money;
		}
		
		Sum sum = (Sum) source;
		return sum.reduce(to);
	}
}
