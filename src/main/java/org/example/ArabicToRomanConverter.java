package org.example;

import java.util.HashMap;
import java.util.Map;

public class ArabicToRomanConverter {

	private Map<Integer, String> mapping = new HashMap<>();

	public ArabicToRomanConverter() {
		mapping.put(1, "I");
		mapping.put(5, "V");
		mapping.put(10, "X");
		mapping.put(50, "L");
		mapping.put(100, "D");

	}

	public String romanToArabic(int wartosc) {
		return mapping.get(wartosc);
	}

}
