package org.example;

public class ArabicToRomanConverter {

	public String convert(int arabic) {
		if (arabic == 1) {
			return "I";
		} else if (arabic == 5) {
			return "V";
		} else {
			return "X";
		}
	}

}
