package com.converter.service;

public class NumberToWordsConverter {
	
	public static final String[] ones = { "", "one", "two", "three", "four",
		"five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve",
		"thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
		"eighteen", "nineteen" };

	public static final String[] tens = { 
		"", 		// Index 0
		"",		    // Index 1
		"twenty", 	// Index 2
		"thirty", 	// Index 3
		"forty", 	// Index 4
		"fifty", 	// Index 5
		"sixty", 	// Index 6
		"seventy",	// Index 7
		"eighty", 	// Index 8
		"ninety" 	// Index 9
};

	public String convertor(final int n) {
	
		//Input is less than 20
		if (n < 20) {
			return ones[n];
		}
		
		//Input is less than Hundred
		if (n < 100) {
			return tens[n / 10] + ((n % 10 != 0) ? " " : "") + ones[n % 10];
		}
		
		//Input is less than Thousand
		if (n < 1000) {
			return ones[n / 100] + " Hundred" + ((n % 100 != 0) ? " and "+ convertor(n % 100): "") ;
		}
		
		//Input is less than Hundred Thousand
		if (n < 100000) {
			return convertor(n / 1000) + " Thousand" + ((n % 10000 != 0) ? " " + convertor(n % 1000) : "");
		}
		
		//Input is less than Million
		if (n < 1000000) {
			return convertor(n / 100000) + " Hundreds" + ((n % 10000 != 0) ? " and " + convertor(n % 100000) : "");
		}
		
		//Input is less than Hundred Million
		if (n < 100000000) {
			return convertor(n / 1000000) + " Million" + ((n % 100000 != 0) ? " "+ convertor(n % 1000000) : "") ;
		}
		
		//Input is Greater than Hundred Million
		return convertor(n / 100000000) + " Hundred" + ((n % 10000000 != 0) ? " and "+ convertor(n % 100000000) : "") ;
	}
   }