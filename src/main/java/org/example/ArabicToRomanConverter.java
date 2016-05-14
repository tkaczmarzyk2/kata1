package org.example;

import java.util.HashMap;
import java.util.Map;

public class ArabicToRomanConverter {
	
	private Map<Integer, String> hm = new HashMap<>();

	public String convert(int arabic) {
		
		hm.put(1, "I");
	    hm.put(5, "V");
	    hm.put(10, "X");
		
	    return hm.get(arabic);
	}

}
