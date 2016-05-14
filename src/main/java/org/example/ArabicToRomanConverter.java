package org.example;

import java.util.HashMap;

public class ArabicToRomanConverter {
	
	
	private HashMap<Integer, String> dictionary = new HashMap<Integer, String>();
	
	public ArabicToRomanConverter()
	{
		dictionary.put(1, "I");
		dictionary.put(2, "II");
		dictionary.put(3, "III");
		dictionary.put(5, "V");
		dictionary.put(10, "X");
		dictionary.put(100, "C");
		dictionary.put(50, "L");
		dictionary.put(500, "D");
		dictionary.put(1000, "M");
	}

	public String convert(int arabic) {
		return dictionary.get(arabic);
	}

}
