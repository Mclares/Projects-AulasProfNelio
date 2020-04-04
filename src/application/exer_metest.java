package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class exer_metest {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double vDollar = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double qtDollar = sc.nextDouble();
		
		double result = CurrencyConverter.Converter(vDollar,qtDollar);
		
		System.out.printf("Amount to be paid in reais = %.2f%n", result);
		
		sc.close();
	}

}
