package application;

import java.util.Scanner;

public class programNumPares {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros vc vai digitar? ");
		int n = sc.nextInt();
		int[] vetor = new int[n];
		int pares = 0;
		
		for(int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			int val = sc.nextInt();
			vetor[i] = val;
		}
		
		System.out.println("\nNUMEROS PARES:");
		for(int i = 0; i < n; i++) {
			if(vetor[i] % 2 == 0) {
				System.out.printf("%d ", vetor[i]);
				pares++;
			}
			
		}
		
		System.out.printf("\nQUANTIDADE DE PARES = %d", pares);		
		sc.close();
	}
}
