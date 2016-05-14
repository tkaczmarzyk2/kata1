package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ArabicToRomanConverter {

	private Map<Integer, String> mapping = new HashMap<>();

	public ArabicToRomanConverter() {
		mapping.put(1, "I");
		mapping.put(5, "V");
		mapping.put(10, "X");
	}

	public String convert(int arabic) {

		for (Entry<Integer, String> wartosc : mapping.entrySet()) {

			if (arabic == wartosc.getKey())
				return wartosc.getValue();
		}

		return null;
	}

}
