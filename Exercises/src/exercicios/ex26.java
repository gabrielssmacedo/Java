package exercicios;

import java.util.Scanner;

public class ex26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("N: ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		double count = 0;
		
		for(int i = 0; i < n; i++) {
			double val = sc.nextDouble();
			vect[i] = val;
		}
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Person %d: %.2f\n", i+1, vect[i]);
			count += vect[i];
		}
		
		System.out.printf("\nAvarage height people: %.2f", count / (double)n);
		sc.close();
	}
}
