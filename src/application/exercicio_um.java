package application;

import java.util.Locale;
import java.util.Scanner;

import entities.retangulo;

public class exercicio_um {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		retangulo ret = new retangulo();
		
		System.out.println("Enter rectangle width and height: ");
		ret.width = sc.nextDouble();
		ret.height = sc.nextDouble();
		
		System.out.printf("Area = %.2f%n", ret.area());
		System.out.printf("Perimeter = %.2f%n", ret.perimeter());
		System.out.printf("Diagonal = %.2f%n", ret.diagonal());
	
		sc.close();
	}

}
