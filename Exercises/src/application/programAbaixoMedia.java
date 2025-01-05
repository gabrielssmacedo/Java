package application;

import java.util.Scanner;

public class programAbaixoMedia {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		float[] vetor = new float[n];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			float val = sc.nextFloat();
			vetor[i] = val;
		}
		
		double media = 0.0;
		
		for(int i = 0; i < vetor.length; i++) {
			media += vetor[i];
		}
		
		media = media / vetor.length;
		
		System.out.printf("MEDIA DO VETOR = %.3f\n", media);
		
		System.out.println("\nELEMENTOS ABAIXO DA MEDIA:");
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] < media) System.out.println(vetor[i]);
		}
		sc.close();
	}
}
