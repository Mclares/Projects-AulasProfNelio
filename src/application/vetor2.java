package application;

import java.util.Locale;
import java.util.Scanner;

import entities.productvetor2;

public class vetor2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double sum = 0.0;
		
		productvetor2[] vect = new productvetor2[n];
		
		for (int i=0; i<vect.length ;i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			 
			vect[i] = new productvetor2(name,price);
			sum += vect[i].getPrice();
		}
		
		double avg = sum / n;
		System.out.printf("Average Price = %.2f%n", avg);
		
		sc.close();
	}

}
