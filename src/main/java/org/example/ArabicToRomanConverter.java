package org.example;

import java.util.HashMap;
import java.util.Map;

public class ArabicToRomanConverter {

private Map<Integer,String> myMap = new HashMap<Integer,String>();

public ArabicToRomanConverter(){
	
	
}
	public String convert(int arabic) {
		myMap.put(1, "I");
		myMap.put(5, "V");
		myMap.put(10, "X");
		
		return myMap.get(arabic);
		

	}
 
}
