package entities;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private Instant moment;
	private OrderStatus status;
	private Client client;
	private List<OrderItem> items = new ArrayList<>();
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
	
	public Order() {
	}

	public Order(Instant date, OrderStatus status, Client client) {
		this.moment = date;
		this.status = status;
		this.client = client;
	}

	public Instant getDate() {
		return moment;
	}

	public void setDate(Instant date) {
		this.moment = date;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public Double total() {
		Double valueTotal = 0.0;
		for(OrderItem i : items) {
			valueTotal += i.subTotal();
		}
		
		return valueTotal;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: " + fmt.format(moment) + "\n");
		sb.append("Order status: " + status + "\n");
		sb.append("Client: " + client + "\n");
		sb.append("Order items:" + "\n");
		for(OrderItem i : items) {
			sb.append(i + "\n");
		}
	
		sb.append("Total price: $" + String.format("%.2f", total()));
		return sb.toString();
	}
	
	
	
}
