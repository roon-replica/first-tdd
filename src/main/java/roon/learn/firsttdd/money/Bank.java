package roon.learn.firsttdd.money;

public class Bank {

	public Money reduce(Expression source, String to) {
		return source.reduce(to);
	}
}
