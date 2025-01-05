package application;

import java.util.Scanner;

import entities.Aluno;

public class programAprovados {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		Aluno[] alunos = new Aluno[n];
		
		for(int i = 0; i < alunos.length; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", i+1);
			sc.nextLine();
			String nome = sc.nextLine();
			float n1 = sc.nextFloat();
			float n2 = sc.nextFloat();
			alunos[i] = new Aluno(nome,n1,n2);
		}
		
		System.out.println("Alunos aprovados:");
		
		for(int i = 0; i < alunos.length; i++) {
			double media = (alunos[i].getN1() + alunos[i].getN2()) / 2.0;
			if(media >= 6.0) System.out.println(alunos[i].getNome());
		}
		
		sc.close();
	}
}
