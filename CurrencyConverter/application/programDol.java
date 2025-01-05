package application;

import java.util.Scanner;
import util.CurrencyConverter;

public class programDol {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double price, quantity;
		
		System.out.print("What is the dollar price: ");
		price = sc.nextDouble();
		System.out.print("How many dollars will be bought: ");
		quantity = sc.nextDouble();
		
		double result = CurrencyConverter.converter(price, quantity);
		
		System.out.printf("\nAmout to be paid in reais = %.2f", result);

		sc.close();
	}
}
