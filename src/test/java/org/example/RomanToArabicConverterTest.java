package org.example;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;


public class RomanToArabicConverterTest {

	RomanToArabicConverter converter = new RomanToArabicConverter();
	
	@Test
	public void convertsSingleSymbol() {
		assertThat(converter.convertToArabic("I")).isEqualTo(1);
	}
}
