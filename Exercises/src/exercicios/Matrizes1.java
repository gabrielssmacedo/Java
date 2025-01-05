package exercicios;

import java.util.Scanner;

public class Matrizes1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] numeros = new int[n][n];
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.printf("\n[ %d ]\n", i);
			for(int j = 0; j < numeros.length; j++) {
				System.out.printf("");
				numeros[i][j] = sc.nextInt();
			}
		}
		System.out.print("Diagonal: ");
		for(int i = 0; i < numeros.length; i++) {
			System.out.printf("%d ", numeros[i][i]);
		}
		
		
		
		sc.close();
	}
}
