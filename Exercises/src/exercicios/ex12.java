package exercicios;

import java.util.Scanner;

public class ex12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Num: ");
		double num = sc.nextDouble();
		
		if(num >= 0 && num <= 25) System.out.println("Intervalo [0, 25]");
		else if(num > 25 && num <= 50) System.out.println("Intervalo (25, 50]");
		else if(num > 50 && num <= 75) System.out.println("Intervalo (50, 75]");
		else if(num > 75 && num <= 100) System.out.println("Intervalo (75, 100]");
		else System.out.println("Fora de intervalo");
		
		sc.close();
	}
}
