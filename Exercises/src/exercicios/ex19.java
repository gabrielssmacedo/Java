package exercicios;

import java.util.Scanner;

public class ex19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N, intervalo = 0, fora = 0;
		
		System.out.print("X: ");
		N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			System.out.print(" > ");
			int valor = sc.nextInt();
			if(valor >= 10 && valor <= 20) intervalo++;
			else fora++;
		}
		
		System.out.printf("%d in\n", intervalo);
		System.out.printf("%d out", fora);
		
		sc.close();
	}
}
