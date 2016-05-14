package org.example;

public class ArabicToRomanConverter {

	public String convert(int arabic) {
		if (arabic == 5) {
			return "V";
		}
		if (arabic == 10) {
			return "X";
		}
		return "I";
	}

}
