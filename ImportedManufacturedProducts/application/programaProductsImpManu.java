package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class programaProductsImpManu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Producttt> products = new ArrayList<>();
		 DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.print("Enter the number of products: ");
		int numberProducts = sc.nextInt();
		
		for(int i = 0; i < numberProducts; i++) {
			System.out.printf("Product #%d data:\n", i+1);
			System.out.print("Common, used or imported (c/u/i)? ");
			char type = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			if(type == 'u') {
				System.out.print("Manufacture Date (DD/MM/YYYY): ");
				String date = sc.next();
				products.add(new UsedProduct(name, price, LocalDate.parse(date,fmt)));
			}
			else if(type == 'i') {
				System.out.print("Customs fee: ");
				Double fee = sc.nextDouble();
				products.add(new ImportedProduct(name, price, fee));
			}
			else {
				products.add(new Producttt(name, price));
			}
		}
		
		System.out.println("\nPRICES TAGS:");		
		for(Producttt p : products) {
			System.out.println(p.priceTag());
		}
		
		sc.close();
	}
}
