package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employeelist;

public class exerlista {

	public static void main(String[] args) {
		
		List<Employeelist> list = new ArrayList<>();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		Integer qtemp = sc.nextInt();
		
		for (int i = 1 ; i <= qtemp ; i++) {
			System.out.println();
			System.out.println("Employee #" + i + ": ");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			list.add(new Employeelist(id,name,salary));	
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Employeelist el = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (el == null) {
			System.out.println("This id does not exist!!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			el.increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of Employees:");
		for (Employeelist obj : list) {
			System.out.println(obj);
		}

		sc.close();
	}

}
