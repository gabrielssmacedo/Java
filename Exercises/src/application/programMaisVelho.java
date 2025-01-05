package application;

import java.util.Scanner;
import entities.Pessoa;

public class programMaisVelho {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		Pessoa[] pessoas = new Pessoa[n];
		
		for(int i = 0; i < pessoas.length; i++) {
			System.out.printf("Dados da %da pessoa\n", i+1);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			pessoas[i] = new Pessoa(name, idade);
		}
		
		String maisVelho = pessoas[0].getName();
		int maisIdade = pessoas[0].getIdade();
		
		for(int i = 0; i < pessoas.length; i++) {
			if(maisIdade < pessoas[i].getIdade()) {
				maisIdade = pessoas[i].getIdade();
				maisVelho = pessoas[i].getName();
			}
		}
		
		System.out.printf("PESSOA MAIS VELHA: %s", maisVelho);
		
		
		sc.close();
	}
}
