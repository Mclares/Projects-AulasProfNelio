package application;

import java.util.Locale;
import java.util.Scanner;

import entities.mediaTrimestre;

public class exercicio_tres {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		mediaTrimestre x = new mediaTrimestre();
		
		System.out.print("Name: ");
		x.name = sc.nextLine();
		System.out.print("First: ");
		x.n1 = sc.nextDouble();
		System.out.print("Second: ");
		x.n2 = sc.nextDouble();
		System.out.print("Third: ");
		x.n3 = sc.nextDouble();
		
		System.out.println();
		System.out.println("Final Grade: = " + x.mediaPonderada());
				
		if(x.mediaPonderada() >= 60.0) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Failed");
			System.out.printf("Missing %.2f Points",x.faltou());
		}
		
		sc.close();
	}

}
