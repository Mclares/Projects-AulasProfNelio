package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Room;

public class exerroom {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		int qtdisp = 10;
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		Room[] vect = new Room[qtdisp];
		
		for (int i = 1; i <= n; i++) {
			
			sc.nextLine();
			System.out.println();
			System.out.println("Rent#" + i);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			vect[room] = new Room(name,email,room);			
	 	}
		
		System.out.println();
		System.out.println();
		System.out.println("Busy rooms: ");
		
		for (int i = 0; i <vect.length ; i++) {
			
			if (vect[i] != null ) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();
	}

}
