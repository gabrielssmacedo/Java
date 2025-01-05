package exercicios;

import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double raio;
		System.out.print("Raio: ");
		raio = sc.nextDouble();
		double pi = 3.14159;
		double areaCirculo = pi * Math.pow(raio, 2.00);
		
		System.out.printf("Area = %.4f", areaCirculo);
		
		sc.close();
	}

}
