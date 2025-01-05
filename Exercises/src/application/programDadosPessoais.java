package application;

import java.util.Scanner;

import entities.Pessoa;

public class programDadosPessoais {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		Pessoa[] pessoas = new Pessoa[n];
		
		for(int i = 0; i < pessoas.length; i++) {
			System.out.printf("Altura da %da pessoa: ", i+1);
			double altura = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", i+1);
			char genero = sc.next().charAt(0);
			pessoas[i] = new Pessoa(altura, genero);
		}
		
		double maiorAltura = pessoas[0].getAltura();
		double menorAltura = pessoas[0].getAltura();
		double mediaAlturaM = 0.0;
		double mediaAlturaH = 0.0;
		int numHomens = 0;
		int numMulheres = 0;
		
		for(int i = 0; i < pessoas.length; i++) {
			if(maiorAltura < pessoas[i].getAltura()) maiorAltura = pessoas[i].getAltura();
			if(menorAltura > pessoas[i].getAltura()) menorAltura = pessoas[i].getAltura();
			
			if(pessoas[i].getGenero() == 'F') {
				mediaAlturaM += pessoas[i].getAltura();
				numMulheres++;
			}
			else {
				mediaAlturaH += pessoas[i].getAltura();
				numHomens++;
			}
		}
		
		mediaAlturaM /= numMulheres;
		mediaAlturaH /= numHomens;
		
		System.out.printf("\nMenor altura = %.2f\n", menorAltura);
		System.out.printf("Maior altura = %.2f\n", maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f\n", mediaAlturaM);
		System.out.printf("Media das alturas das homens = %.2f\n", mediaAlturaH);
		System.out.printf("Numero de homens = %d\n", numHomens);
		System.out.printf("Numero de mulheres = %d\n", numMulheres);
		
		
		sc.close();	
	}
}
