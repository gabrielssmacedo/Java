package exercicios;

import java.util.Scanner;

public class programSomaVetor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N: ");
		int n = sc.nextInt();
		float soma = 0f;
		float[] array = new float[n];
		
		for(int i = 0; i < array.length; i++) {
			System.out.print("Digite um numero: ");
			float val = sc.nextFloat();
			array[i] = val;
		}
		
		for(int i = 0; i < array.length; i++) {
			System.out.print("VALORES =");
			System.out.printf(" %.1f", array[i]);
			soma += array[i];
		}
		
		System.out.printf("\nSOMA = %.1f\n", soma);
		System.out.printf("MEDIA = %.1f\n", soma / (double)array.length);
		
		sc.close();
	}
}
