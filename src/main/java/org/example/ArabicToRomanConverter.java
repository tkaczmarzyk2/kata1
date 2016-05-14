package org.example;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ArabicToRomanConverter {

	private HashMap<Integer, String> dictionary = new LinkedHashMap<>();
	private HashMap<Integer, String> restDictionary = new HashMap<>();

	public ArabicToRomanConverter() {

		insertValues();
	}

	private void insertValues() {

		dictionary.put(1000, "M");
		dictionary.put(500, "D");
		dictionary.put(100, "C");
		dictionary.put(50, "L");
		dictionary.put(10, "X");
		dictionary.put(6, "VI");
		dictionary.put(5, "V");
		dictionary.put(4, "IV");
		dictionary.put(1, "I");
		restDictionary.put(1, "I");
		restDictionary.put(2, "II");
		restDictionary.put(3, "III");
		restDictionary.put(4, "IV");
		restDictionary.put(6, "VI");
		restDictionary.put(7, "VII");
		restDictionary.put(8, "VIII");
		restDictionary.put(9, "IX");

	}

	public String convert(int arabic) {
		for (Map.Entry<Integer, String> entry : dictionary.entrySet()) {
			if (entry.getKey() <= arabic) {
				int howMuch = arabic / entry.getKey();
				int rest = (arabic % entry.getKey());
				if (rest == 0) {
					return repeat(entry.getValue(), howMuch);
				} else {
					String value = repeat(entry.getValue(), howMuch);
					String restOfValue = restDictionary.get(rest);
					return value + restOfValue;
				}
			}
		}
		throw new IllegalArgumentException();
	}

	private String repeat(String value, int howMuch) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < howMuch; i++) {
			builder.append(value);
		}
		return builder.toString();
	}
}
