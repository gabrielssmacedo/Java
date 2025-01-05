package exercicios;

import java.util.Scanner;

public class ex07 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int num = sc.nextInt();
		
		if(num < 0)System.out.printf("%d é negativo", num);
		else if(num == 0)System.out.println("O numero digitado foi zero");
		else System.out.printf("%d é positivo", num);
		
		sc.close();
	}

}
