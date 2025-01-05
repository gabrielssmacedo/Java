package exercicios;

import java.util.Scanner;

public class ex21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("N: ");
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			int n1, n2;
			n1 = sc.nextInt();
			n2= sc.nextInt();
			
			if(n2 == 0) System.out.println("Divisão impossível");
			else System.out.printf("%.1f\n", (float)n1/n2);
				
			}
				
		sc.close();
	}
}
