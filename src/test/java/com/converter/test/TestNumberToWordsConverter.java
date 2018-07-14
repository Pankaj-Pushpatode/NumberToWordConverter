package com.converter.test;
import com.converter.service.NumberToWordsConverter;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestNumberToWordsConverter {
	
	NumberToWordsConverter ntwc = new NumberToWordsConverter();

	// Test for Thousand Value
	@Test
	public void testThousand() {
		int number1 = 56789;
		String result1 = ntwc.convertor(number1);
		assertEquals(result1, "fifty six Thousand seven Hundred and eighty nine");
	}
	
	// Test for Million Value
	@Test
	public void testMillion() {
		int number2 = 9456123;
		String result2 = ntwc.convertor(number2);
		assertEquals(result2, "nine Million four Hundreds and fifty six Thousand one Hundred and twenty three");
	}
	
	
	// Test for Hundred Million Value
	@Test
	public void testHundredMillion() {
		int number3 = 696585393;
		String result3 = ntwc.convertor(number3);
		assertEquals(result3, "six Hundred and ninety six Million five Hundreds and eighty five Thousand three Hundred and ninety three");
	}
}
