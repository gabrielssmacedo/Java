package application;

import java.util.Scanner;

public class programMediaPares {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float media = 0f;
		int countPares = 0;
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		int[] vetor = new int[n];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}
		
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] % 2 == 0) {
				media += vetor[i];
				countPares++;
			}
		}
		
		media /= countPares;
		
		if(countPares == 0) System.out.println("NENHUM NUMERO PAR");
		else System.out.printf("MEDIA DOS PARES = %.1f", media);
		
		
		
		
		sc.close();
	}
}
