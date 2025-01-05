package exercicios;

import java.util.Scanner;

public class ex22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Fatorial: ");
		int N = sc.nextInt();
		int resultado = N;
		
		if(N == 0) resultado = 1;
		else {
			for(int i = 1; i < N; i++) {
				resultado = resultado * (N-i);
			}
		}
		System.out.printf("Resultado: %d", resultado);
		sc.close();
	}
}
