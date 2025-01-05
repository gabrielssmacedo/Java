package exercicios;

import java.util.Scanner;

public class ex25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res; 
		
		do {
			System.out.print("\nDigite a temperatura em Celsius: ");
			float temp = sc.nextFloat();
			temp = (9*temp) / 5 + 32;
			System.out.printf("\nEquivalente em Farenheit: %.1f\n", temp);
			System.out.print("\nDeseja repetir (s/n)? ");
			res = sc.next().charAt(0);
		} while(res != 'n');
		
		System.out.println("znFim do programa");
		sc.close();
	}
}
