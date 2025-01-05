package exercicios;

import java.util.Scanner;

public class ex15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int senha = 2002;
		
		System.out.print("Senha: ");
		int tentativa = sc.nextInt();
		
		while(tentativa != senha) {
			System.out.println("Senha invalida");
			System.out.print("Senha: ");
			tentativa = sc.nextInt();
		}
		
		System.out.println("Acesso permitido");
		
		sc.close();
	}
}
