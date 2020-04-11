package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus_ex1;

public class Order_ex1 {

	private static SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date moment;
	private OrderStatus_ex1 orderStatus;
		
	private Client_ex1 client;
	private List<OrderItem_ex1> items = new ArrayList<>();
	
	public Order_ex1() {
	}
	
	public Order_ex1(Date moment, OrderStatus_ex1 orderStatus, Client_ex1 client) {
		this.moment = moment;
		this.orderStatus = orderStatus;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus_ex1 getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus_ex1 orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Client_ex1 getClient() {
		return client;
	}

	public void setClient(Client_ex1 client) {
		this.client = client;
	}

	public List<OrderItem_ex1> getItems() {
		return items;
	}

	public void addItems(OrderItem_ex1 item) {
		items.add(item);
	}
	
	public void removeItems(OrderItem_ex1 item) {
		items.remove(item);
	}

	public double total() {
		double sum = 0;
		for (OrderItem_ex1 i : items) {
			sum += i.subTotal(); 
		}
		return sum;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: " + sdf1.format(moment) + "\n");
		sb.append("Order status: " + orderStatus + "\n");
		sb.append(client.getName() + " (" + sdf2.format(client.getBirthDate()) + ") - " + client.getEmail() + "\n");
		sb.append("Order items:\n");
		for (OrderItem_ex1 i : items) {
			sb.append(i + "\n");
		}
		sb.append("Total Price: $" + total());
		return sb.toString();
	}
}