package exercicios;

import java.util.Scanner;
import entities.Produto;

public class ex27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Produto[] products = new Produto[n];
		double count = 0.0;
		
		for(int i = 0; i < n; i++) {
			String name; 
			double price;
			name = sc.next();
			price = sc.nextDouble();
			products[i] = new Produto(name, price);
			
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println(products[i]);
			count += products[i].getPrice();
		}
		
		System.out.printf("AVARAGE PRICE: %.2f", count / (double)n);
		
		sc.close();
	}
}
