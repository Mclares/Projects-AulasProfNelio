package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Operador_conta;

public class exer_sob_enc {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Operador_conta op;
			
		System.out.print("Enter Account Number: ");
		int account_number = sc.nextInt();
		
		System.out.print("Enter Account Holder: ");
		sc.nextLine();
		String account_holder = sc.nextLine();
		
		System.out.print("Is There An Initial Deposit (y/n) ?: ");
		char yon = sc.next().charAt(0);
		
		if (yon == 'y') {
			System.out.print("Enter Initial Deposit Value: ");
			double inideposit = sc.nextDouble();
			op = new Operador_conta(account_number,account_holder,inideposit);
		}
		else {
			op = new Operador_conta(account_number,account_holder);
		}
	
		System.out.println();
		System.out.println("Account Data: ");
		System.out.print(op);
		
		System.out.println();
		System.out.print("Enter a Deposit Value: ");
		double deposit = sc.nextDouble();
		op.addmoney(deposit);
		System.out.println("Updated Account Data: ");
		System.out.print(op);
		
		System.out.println();
		System.out.print("Enter a Withdraw Value: ");
		deposit = sc.nextDouble();
		op.subtractmoney(deposit);
		System.out.println("Updated Account Data: ");
		System.out.print(op);
		
		sc.close();
	}

}
