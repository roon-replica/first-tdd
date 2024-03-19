package roon.learn.firsttdd.money;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

class MoneyTest {

	@Test
	void testReduceMoneyDifferentCurrency() {
		Bank bank = new Bank();
		bank.addRate("USD", "WON", 1000);
		Money result = bank.reduce(Money.dollar(1), "WON");
		assertEquals(Money.won(1000), result);
	}

	@Test
	void testReduceMoney() {
		Bank bank = new Bank();
		Money result = bank.reduce(Money.dollar(1), "USD");
		assertEquals(Money.dollar(1), result);
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
		Money fiveDollar = Money.dollar(5);
		Expression result = fiveDollar.plus(fiveDollar);
		Sum sum = (Sum) result;
		assertEquals(fiveDollar, sum.augend);
		assertEquals(fiveDollar, sum.addend);
	}

	@Test
	void testSimpleAddition() {
		Money fiveDollar = Money.dollar(5);
		Expression sum = fiveDollar.plus(fiveDollar);
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

		assertEquals(Money.dollar(10), five.times(2));
		assertEquals(Money.dollar(15), five.times(3));
	}

	@Test
	void testEquality() {
		assertEquals(Money.dollar(5), Money.dollar(5));
		assertNotEquals(Money.dollar(5), Money.dollar(6));
		assertEquals(Money.won(5), Money.won(5));
		assertNotEquals(Money.won(5), Money.won(6));
		assertNotEquals(Money.won(5), Money.dollar(5));
	}

}
