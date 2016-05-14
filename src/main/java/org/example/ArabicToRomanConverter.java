package org.example;

import java.util.HashMap;

public class ArabicToRomanConverter {

	private HashMap<Integer, String> slownik = new HashMap<>();

	public ArabicToRomanConverter() {

		insertValues();
	}

	private void insertValues() {

		slownik.put(1, "I");
		slownik.put(2, "II");
		slownik.put(3, "III");
		slownik.put(4, "IV");
		slownik.put(5, "v");
		slownik.put(10, "X");
		slownik.put(50, "L");
		slownik.put(100, "C");
		slownik.put(500, "D");
		slownik.put(1000, "M");
	}

	public String convert(int arabic) {
		return slownik.get(arabic);
	}
}
