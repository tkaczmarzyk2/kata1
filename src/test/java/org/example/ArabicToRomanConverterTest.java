package org.example;
import static org.assertj.core.api.Assertions.*;
import org.junit.Test;

public class ArabicToRomanConverterTest {

	ArabicToRomanConverter converter = new ArabicToRomanConverter();
	
	@Test
	public void shouldRepeatASymbol() {
		assertThat(converter.convert(3)).isEqualTo("III");
		assertThat(converter.convert(20)).isEqualTo("XX");
		assertThat(converter.convert(21)).isEqualTo("XXI");
		assertThat(converter.convert(22)).isEqualTo("XXII");
		assertThat(converter.convert(23)).isEqualTo("XXIII");
		assertThat(converter.convert(12)).isEqualTo("XII");
		assertThat(converter.convert(14)).isEqualTo("XIV");
		assertThat(converter.convert(34)).isEqualTo("XXXIV");
		assertThat(converter.convert(39)).isEqualTo("XXXIX");
		assertThat(converter.convert(4)).isEqualTo("IV");
	}
	
	@Test
	public void shouldConvertSingleSymbol() {
		assertThat(converter.convert(1)).isEqualTo("I");
		assertThat(converter.convert(5)).isEqualTo("V");
		assertThat(converter.convert(10)).isEqualTo("X");
		assertThat(converter.convert(50)).isEqualTo("L");
		assertThat(converter.convert(100)).isEqualTo("C");
		assertThat(converter.convert(500)).isEqualTo("D");
		assertThat(converter.convert(1000)).isEqualTo("M");
	}
}
