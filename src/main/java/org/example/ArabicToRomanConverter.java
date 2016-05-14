package org.example;

import java.util.HashMap;
import java.util.Map;

public class ArabicToRomanConverter {

	private Map<Integer, String> mapping = new HashMap<>();

	public ArabicToRomanConverter() {
		super();
		mapping.put(1, "I");
		mapping.put(5, "V");
		mapping.put(10, "X");
	}

	public String convert(int arabic) {
		return mapping.get(arabic);
	}

}
