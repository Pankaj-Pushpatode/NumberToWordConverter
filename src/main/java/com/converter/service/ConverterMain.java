package com.converter.service;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConverterMain {

	public static void main(String[] args) {
		
		NumberToWordsConverter ntwc = new NumberToWordsConverter();
		int n;
		try{
			Scanner s=new Scanner(System.in);
		    System.out.println("Enter a number to convert into word format");
			n =s.nextInt();

			
			if(n<=0){
				System.out.println("Oops! Number should be greater than 0, Try other number");
			}
			else{
				System.out.println(n + "='" + ntwc.convertor(n) + "'");
			}
		}
		catch(InputMismatchException  e)
		{
			System.out.println("Please enter numbers between 1 and 999999999 only "+ e);
		}
	}

}
