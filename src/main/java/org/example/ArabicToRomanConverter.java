package org.example;

import java.util.HashMap;
import java.util.Map;

public class ArabicToRomanConverter {
	
	private Map<Integer, String> mapping = new HashMap<>();
	
	

	public String convert(int arabic) {
		
		mapping.put(1, "I");
		mapping.put(5, "V");
		mapping.put(10, "X");
		
		return mapping.get(arabic);
		
		/*if (arabic==1)
			return "I";
		if (arabic==5)
			return "V";
		if (arabic==10)
			return "X";
		return "I";
		*/
	}

}
