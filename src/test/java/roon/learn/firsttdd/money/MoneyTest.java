package roon.learn.firsttdd.money;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MoneyTest {

	@Test
	public void testMultiplication() {
		Dollar five = new Dollar(5);

		Dollar product = five.times(2);
		assertEquals(new Dollar(10), product);

		product = five.times(3);
		assertEquals(new Dollar(15), product);
	}

	@Test
	public void testWonMultiplication() {
		var five = new Won(5);

		Won product = five.times(2);
		assertEquals(new Won(10), product);

		product = five.times(3);
		assertEquals(new Won(15), product);
	}

	@Test
	public void testEquality() {
		assertTrue(new Dollar(5).equals(new Dollar(5)));
	}

}
