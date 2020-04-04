package util;

public class CurrencyConverter {
	
	public static final double TAX = 6.0; 
	
	public static double Converter(double vDollar, double qtDollar) {
		return vDollar * qtDollar + ((vDollar * qtDollar) * TAX/100) ;
	}
	
}
