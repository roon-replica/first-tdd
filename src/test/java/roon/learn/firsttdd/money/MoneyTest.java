package roon.learn.firsttdd.money;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

class MoneyTest {

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
