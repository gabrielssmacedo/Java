package exercicios;

import java.util.Scanner;

public class programNegativos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N: ");
		int n = sc.nextInt();
		while(n < 0 || n > 10) {
			System.out.println("Numero deve ser positivo e no máximo 10!");
			System.out.print("N: ");
		    n = sc.nextInt();
		}
		
		int[] negativos = new int[n];
		
		for(int i = 0; i < negativos.length; i++) {
			System.out.print("Digite um numero: ");
			int val = sc.nextInt();
			negativos[i] = val;
		}
		
		System.out.println("Numeros Negativos:");
		
		for(int i = 0; i < negativos.length; i++) {
			if(negativos[i] < 0) System.out.println(negativos[i]);
		}
		
		sc.close();
	}
}
