package exercicios;

import java.util.Scanner;

public class ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cdg, qtd;
		cdg = sc.nextInt();
		qtd = sc.nextInt();

//		if(cdg == 1) {
//			System.out.printf("Total: R$ %.2f", qtd * 4.00);
//		}
//		else if(cdg == 2) {
//			System.out.printf("Total: R$ %.2f", qtd * 4.50);
//		}
//		else if(cdg == 3) {
//			System.out.printf("Total: R$ %.2f", qtd * 5.00);
//		}
//		else if(cdg == 4) {
//			System.out.printf("Total: R$ %.2f", qtd * 2.00);
//		}
//		else if(cdg == 5) {
//			System.out.printf("Total: R$ %.2f", qtd * 1.50);
//		}
//		else System.out.println("Código inválido");

		// Com Switch case

		switch (cdg) {
		case 1:
			System.out.printf("Total: R$ %.2f", qtd * 4.00);
			break;
		case 2:
			System.out.printf("Total: R$ %.2f", qtd * 4.50);
			break;
		case 3:
			System.out.printf("Total: R$ %.2f", qtd * 5.00);
			break;
		case 4:
			System.out.printf("Total: R$ %.2f", qtd * 2.00);
			break;
		case 5:
			System.out.printf("Total: R$ %.2f", qtd * 1.50);
			break;
		default:
			System.out.println("Código inválido");
			break;
		}

		sc.close();
	}
}
