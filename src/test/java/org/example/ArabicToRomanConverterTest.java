package org.example;
import static org.assertj.core.api.Assertions.*;
import org.junit.Test;

public class ArabicToRomanConverterTest {

	ArabicToRomanConverter converter = new ArabicToRomanConverter();
	
	@Test
	public void shouldConvertSingleSymbol() {
		String roman = converter.convert(1);
		
		assertThat(roman).isEqualTo("I");
	}
}
