package exercicios;

import java.util.Scanner;

public class ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int inicio, fim, duracao;
		
		inicio = sc.nextInt();
		fim = sc.nextInt();
		
		if(inicio > fim) duracao = (24 - inicio) + fim;
		else if(fim > inicio) duracao = fim - inicio;
		else duracao = 24;
		
		System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
		
		sc.close();
	}
}
