package application;

import java.util.Locale;
import java.util.Scanner;

import entities.employee;

public class exercicio_dois {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		employee x = new employee();
		
		System.out.print("Name: ");
		x.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		x.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		x.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + x.name + ", $ " + x.netSalary());
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		
		double percentage = sc.nextDouble();
		x.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + x.name + ", $ " + x.netSalary());
		
		sc.close();
	}

}
