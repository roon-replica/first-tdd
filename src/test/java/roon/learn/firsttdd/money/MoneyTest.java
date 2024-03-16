package roon.learn.firsttdd.money;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

class MoneyTest {

	@Test
	void testReduceMoney() {
		Bank bank = new Bank();
		Money result = bank.reduce(Money.dollar(1), "USD");
		assertEquals(result, Money.dollar(1));
	}

	@Test
	void testReduceSum() {
		Expression sum = new Sum(Money.dollar(3), Money.dollar(4));
		Bank bank = new Bank();
		Money result = bank.reduce(sum, "USD");
		assertEquals(Money.dollar(7), result);
	}

	@Test
	void testPlusReturnsSum() {
		Money five = Money.dollar(5);
		Expression result = five.plus(five);
		Sum sum = (Sum) result;
		assertEquals(five, sum.augend);
		assertEquals(five, sum.augend);
	}

	@Test
	void testSameCurrencyAddition() {
		Money five = Money.dollar(5);
		Expression sum = five.plus(five);
		Bank bank = new Bank();
		Money reduced = bank.reduce(sum, "USD");
		assertEquals(Money.dollar(10), reduced);
	}

	@Test
	void testCurrency() {
		assertEquals("USD", Money.dollar(1).currency());
		assertEquals("WON", Money.won(1).currency());
	}

	@Test
	void testMultiplication() {
		Money five = Money.dollar(5);

		Money product = five.times(2);
		assertEquals(Money.dollar(10), product);

		product = five.times(3);
		assertEquals(Money.dollar(15), product);
	}

	@Test
	void testWonMultiplication() {
		var five = Money.won(5);

		Money product = five.times(2);
		assertEquals(Money.won(10), product);

		product = five.times(3);
		assertEquals(Money.won(15), product);
	}

	@Test
	void testEquality() {
		assertEquals(Money.dollar(5), Money.dollar(5));
		assertNotEquals(Money.dollar(1), Money.won(1));
	}

}
