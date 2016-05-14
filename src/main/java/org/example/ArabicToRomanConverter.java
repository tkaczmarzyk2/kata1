package org.example;

public class ArabicToRomanConverter {

	public String convert(int arabic) {
		if (arabic == 1) {
			return "I";
		} else if (arabic == 5) {
			return "V";
		} else if (arabic == 10) {
			return "X";
		}
		return "ta liczba nie jest obsługiwana";
	}

}
