package roon.learn.firsttdd.money;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MoneyTest {

	@Test
	void testWonMultiplication() {
		Won five = new Won(5);
		assertEquals(new Won(10), five.times(2));
		assertEquals(new Won(15), five.times(3));
	}

	@Test
	void testMultiplication() {
		Dollar five = new Dollar(5);

		assertEquals(new Dollar(10), five.times(2));
		assertEquals(new Dollar(15), five.times(3));
	}

	@Test
	void testEquality() {
		assertEquals(new Dollar(5), new Dollar(5));
	}

}
