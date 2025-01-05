package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Productt;
import entities.enums.OrderStatus;

public class programOrders {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		List<Order> orders = new ArrayList<>();
		char resp;

		do {
			System.out.println("\nEnter cliente data:");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Birth date (DD/MM/YYYY): ");
			String birthDate = sc.next();
			System.out.println("Enter order data:");
			System.out.print("Status:");
			String status = sc.next();

			LocalDate date = LocalDate.parse(birthDate, fmt);
			// System.out.println(date);

			Order order = new Order(Instant.now(), OrderStatus.valueOf(status), new Client(name, email, date));

			System.out.print("How many items to this order? ");
			int quantityItems = sc.nextInt();

			for (int i = 0; i < quantityItems; i++) {
				System.out.printf("Enter #%d item data:\n", i + 1);
				System.out.print("Product name: ");
				sc.nextLine();
				String nameProduct = sc.nextLine();
				System.out.print("Product price: ");
				Double productPrice = sc.nextDouble();
				System.out.print("Quantity: ");
				int quantity = sc.nextInt();
				order.addItem(new OrderItem(quantity, new Productt(nameProduct, productPrice)));

			}
			orders.add(order);

			System.out.println("\n---------------- ORDER SUMMARY ------------------\n");
			for (Order o : orders) {
				System.out.println(o);
				System.out.println();
			}
			
			System.out.print("\nDo you want to add a new order (y/n)? ");
			resp = sc.next().charAt(0);
			sc.nextLine();

		} while (resp != 'n');
		
		System.out.println("\nOb'rigado por pedir o_-!");

		sc.close();
	}
}
