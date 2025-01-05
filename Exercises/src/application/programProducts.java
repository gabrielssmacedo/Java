package application;

import java.util.Scanner;
import entities.Product;

public class programProducts {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write the product datas (name, price and quantity): ");
		
		Product product = new Product();
		
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity: ");
		product.quantity = sc.nextInt();
		
		double total = product.totalValueInStock();
		System.out.printf("Product Data: %s, $%.2f, %d units, Total: $%.2f\n", product.name, product.price, product.quantity, total);
				
		System.out.print("Enter a quantity to be added in stock: ");
		int qtd = sc.nextInt();
		product.addProducts(qtd);
		total = product.totalValueInStock();
		
		System.out.printf("Updated data: %s, $%.2f, %d units, Total: $%.2f\n", product.name, product.price, product.quantity, total);
		
		System.out.print("Enter a quantity to be removed from stock: ");
		qtd = sc.nextInt();
		product.removeProducts(qtd);
		total = product.totalValueInStock();
		
		System.out.printf("Updated data: %s, $%.2f, %d units, Total: $%.2f\n", product.name, product.price, product.quantity, total);
		
		sc.close();
	}
}
