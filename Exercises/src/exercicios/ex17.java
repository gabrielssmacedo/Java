package exercicios;

import java.util.Scanner;

public class ex17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite: 1(Alcool); 2(Gasolina); 3(Diesel); 4(Sair)");
		
		int alcool = 0, gasolina = 0, diesel = 0, combustivel = 0;
		
	//meu código
//		while(combustivel != 4) {
//			System.out.print("Combustivel: ");
//			combustivel = sc.nextInt();
//			
//			if(combustivel == 1) alcool++;
//			else if(combustivel == 2) gasolina++;
//			else if(combustivel == 3) diesel++;
//			
//			while(combustivel < 1 || combustivel > 4) {
//				System.out.println("Combustivel invalido");
//				System.out.print("	Combustivel: ");
//				combustivel = sc.nextInt();
//			}
//		}
		
		//versão com Do While
		do {
			System.out.print("Combustivel: ");
			combustivel = sc.nextInt();
			
			while(combustivel < 1 || combustivel > 4) {
				System.out.println("Combustivel invalido");
				System.out.print("	Combustivel: ");
				combustivel = sc.nextInt();
			}
			if(combustivel == 1) alcool++;
			else if(combustivel == 2) gasolina++;
			else if(combustivel == 3) diesel++;
			} while(combustivel != 4);
		
		//correção
//		System.out.print("Combustivel: ");
//		combustivel = sc.nextInt();
//		while(combustivel != 4) {
//			if(combustivel == 1) alcool++;
//			else if(combustivel == 2) gasolina++;
//			else if(combustivel == 3) diesel++;
//			else System.out.println("Combustivel invalido");
//			
//			System.out.print("Combustivel: ");
//			combustivel = sc.nextInt();
//		}
		
		System.out.println("\nMUITO OBRIGADO");
		System.out.printf("Alcool: %d\n", alcool);
		System.out.printf("Gasolina: %d\n", gasolina);
		System.out.printf("Diesel: %d\n", diesel);
		
		
		
		
		sc.close();
	}
}
