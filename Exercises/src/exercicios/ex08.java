package exercicios;

import java.util.Scanner;

public class ex08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int num = sc.nextInt();
		
		if(num % 2 == 1)System.out.printf("%d é impar", num);
		else System.out.printf("%d é par", num);
		
		sc.close();
	}
}
