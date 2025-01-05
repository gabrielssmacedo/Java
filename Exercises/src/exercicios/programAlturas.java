package exercicios;

import java.util.Scanner;
import entities.Pessoa;

public class programAlturas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double alturaMedia = 0.0;
		int ehJovem = 0;
		System.out.print("N: ");
		int n = sc.nextInt();
		Pessoa[] pessoas = new Pessoa[n];
		
		
		for(int i = 0; i < pessoas.length; i++) {
			System.out.printf("Dados da %d a pessoa:\n", i+1);
			System.out.printf("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.printf("Idade: ");
			int idade = sc.nextInt();
			System.out.printf("Altura: ");
			double altura = sc.nextDouble();
			pessoas[i] = new Pessoa(nome, idade, altura);
			if(idade < 16) ehJovem++;
		}
		
		String[] menos16Anos = new String[ehJovem];
		
		for(int k = 0, p = 0; k < pessoas.length; k++) {
			alturaMedia += pessoas[k].getAltura();
			if(pessoas[k].getIdade() < 16) {
				menos16Anos[p] = pessoas[k].getName();
				p++;
			}
		}
		
		alturaMedia /= pessoas.length;  
		double porcentagem = (menos16Anos.length * 100) / pessoas.length;
		
		System.out.printf("\nAltura média: %.2f\n", alturaMedia);
		System.out.printf("Pessoas com menos de 16 anos: %.2f%%\n", porcentagem);
		
		for(int x = 0; x < menos16Anos.length; x++) {
			System.out.println(menos16Anos[x]);
		}
		
		sc.close();
	}
}
