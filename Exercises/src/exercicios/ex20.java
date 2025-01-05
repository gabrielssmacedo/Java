package exercicios;

import java.util.Scanner;

public class ex20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		
		for(int i = 0; i < X; i++) {
			float n1, n2, n3;
			n1 = sc.nextFloat();
			n2 = sc.nextFloat();
			n3 = sc.nextFloat();
			
			double media = (n1 * 2 + n2 * 3 + n3 * 5) / 10;
			System.out.printf("Media: %.1f\n", media);
			
		}
		sc.close();
	}
}
