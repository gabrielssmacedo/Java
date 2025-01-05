package exercicios;

import java.util.Scanner;

public class ex09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A: ");
		int A = sc.nextInt();
		System.out.print("B: ");
		int B = sc.nextInt();
		
		if(A % B == 0 || B % A == 0)System.out.println("São multiplos");
		else System.out.println("Não são multiplos");
		
		sc.close();
	}
}
