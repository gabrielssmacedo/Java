package application;

import java.util.Scanner;

public class programMaiorPosicao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros vc vai digitar? ");
		int n = sc.nextInt();
		float[] vetor = new float[n];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			float val = sc.nextInt();
			vetor[i] = val;
		}
		
		float maior = vetor[0];
		int posicao = 0;
		
		for(int i = 1; i < vetor.length; i++) {
			if(maior < vetor[i]) {
				maior = vetor[i];
				posicao = i;
			}
		}
		
		System.out.printf("\nMAIOR VALOR = %.1f", maior);
		System.out.printf("\nPOSICAO DO MAIOR VALOR = %d", posicao);
		
		sc.close();
	}
}
