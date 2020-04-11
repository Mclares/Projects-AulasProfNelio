package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client_ex1;
import entities.OrderItem_ex1;
import entities.Order_ex1;
import entities.Product_ex1;
import entities.enums.OrderStatus;
import entities.enums.OrderStatus_ex1;

public class Program_ex1 {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter Client Data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth Date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		Client_ex1 client = new Client_ex1(name, email, birthDate);
		
		System.out.println();
		System.out.println("Enter Order Data:");
		System.out.print("Status: ");
		OrderStatus_ex1 orderStatus = OrderStatus_ex1.valueOf(sc.next());
		Date moment = new Date();
		Order_ex1 order = new Order_ex1(moment, orderStatus, client);
		
		System.out.print("How many itens to these order? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String nameProduct = sc.nextLine();
			System.out.print("Product price: ");
			double price = sc.nextDouble();
			Product_ex1 product = new Product_ex1(nameProduct, price);
			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			OrderItem_ex1 orderItem = new OrderItem_ex1(quantity, price, product);
			order.addItems(orderItem);
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
		
		sc.close();
	}

}
