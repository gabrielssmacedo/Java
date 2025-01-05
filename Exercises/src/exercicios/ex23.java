package exercicios;

import java.util.Scanner;

public class ex23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Num: ");
		int cont1 = 0, cont2 = 0;
		int X, Y; 
		X = sc.nextInt();
		Y = sc.nextInt();
		
		for (int i = 1; i <= X; i++) {
			if (X % i == 0) {
				cont1++;
			}
			
		}
		
		for (int i = 1; i <= Y; i++) {
			if (Y % i == 0) {
				cont2++;
			}
			
		}
		
		System.out.printf("Divisores %d: %d\n", X, cont1);
		System.out.printf("Divisores %d: %d", Y, cont2);
		
		sc.close();
	}
}
