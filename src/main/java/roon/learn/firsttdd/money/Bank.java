package roon.learn.firsttdd.money;

import java.util.HashMap;
import java.util.Map;

public class Bank {

	Map<Pair, Integer> rates = new HashMap<>();

	record Pair(String from, String to) {

	}

	Money reduce(Expression source, String currency) {
		return source.reduce(this, currency);
	}

	void addRate(String from, String to, int rate) {
		rates.putIfAbsent(new Pair(from, to), rate);
	}

	int rate(String from, String to) {
		if (from.equals(to)) {
			return 1;
		}

		return rates.get(new Pair(from, to));
	}
}
