package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.PessoaFisica;
import entities.PessoaJuridica;
import entities.Pessoaa;

public class programContribuinte {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Pessoaa> pessoas = new ArrayList<>();
		
		System.out.println("Quantos pessoas serão lidas? ");
		int quantidadePessoas = sc.nextInt();
		
		for(int i = 0; i < quantidadePessoas; i++) {
			System.out.printf("Pagador impostos #%d:\n", i+1);
			System.out.print("Individual ou empresa (i/e)? ");
			char resp = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Renda anual: ");
			Double rendaAnual = sc.nextDouble();
			if(resp == 'i') {
				System.out.print("Gastos saude: ");
				Double gastosSaude = sc.nextDouble();
				pessoas.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
			}
			else if(resp == 'e') {
				System.out.print("Numero funcionarios: ");
				Integer numFuncionarios = sc.nextInt();
				pessoas.add(new PessoaJuridica(nome, rendaAnual, numFuncionarios));
			}
		}
		
		System.out.println("\nTAXAS PAGAS:");
		Double soma = 0.0;
		for(Pessoaa p : pessoas) {
			System.out.println(p);
			soma += p.calcularImposto();
		}
		
		System.out.printf("\nTOTAL TAXES: $ %.2f", soma);
		
		
		sc.close();
	}
}
