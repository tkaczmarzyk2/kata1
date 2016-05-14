package org.example;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ArabicToRomanConverter {

	private HashMap<Integer, String> slownik = new LinkedHashMap<>();

	public ArabicToRomanConverter() {

		insertValues();
	}

	private void insertValues() {
		slownik.put(1000, "M");
		slownik.put(900, "CM");

		slownik.put(500, "D");
		slownik.put(400, "CD");

		slownik.put(100, "C");
		slownik.put(90, "XC");

		slownik.put(50, "L");
		slownik.put(40, "XL");

		slownik.put(10, "X");
		slownik.put(9, "IX");

		slownik.put(5, "V");
		slownik.put(4, "IV");

		slownik.put(1, "I");
	}

	public String convert(int arabic) {
		int remainArabic = arabic;
		String returnString = "";
		int div = 0;

		for (Map.Entry<Integer, String> entry : slownik.entrySet()) {
			if (entry.getKey() <= remainArabic) {
				div = remainArabic / entry.getKey();
				if(entry.getValue().length()==2)
				{
					div=1;
				}
				remainArabic -= entry.getKey() * div;
				for (int i = 0; i < div; i++) {
					returnString += entry.getValue();
				}
			}
		}
		return returnString;
	}
}
