package roon.learn.firsttdd.money;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

class MoneyTest {

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
		assertEquals(new Dollar(5), new Dollar(5));
		assertNotEquals(new Dollar(1), new Won(1));
	}

}
