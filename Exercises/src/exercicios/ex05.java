package exercicios;

import java.util.Scanner;

public class ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c1, n1, c2, n2;
		double p1, p2;
		
		c1 = sc.nextInt();
		n1 = sc.nextInt();
		p1 = sc.nextDouble();
		
		c2 = sc.nextInt();
		n2 = sc.nextInt();
		p2 = sc.nextDouble();
		
		System.out.printf("\nVALOR A PAGAR: R$ %.2f", n1 * p1 + n2 * p2);
		
		
		sc.close();
	}
}
