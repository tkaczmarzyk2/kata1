package org.example;

import static org.assertj.core.api.Assertions.*;
import org.junit.Test;

public class ArabicToRomanConverterTest {

	ArabicToRomanConverter converter = new ArabicToRomanConverter();

	@Test
	public void shouldConvertSingleSymbol() {
		assertThat(converter.romanToArabic(1)).isEqualTo("I");
		assertThat(converter.romanToArabic(5)).isEqualTo("V");
		assertThat(converter.romanToArabic(10)).isEqualTo("X");
	}
}
