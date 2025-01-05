package exercicios;

import java.util.Scanner;

public class ex18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("X: ");
		int X = sc.nextInt();
		
		while(X < 1 || X > 1000) {
			System.out.println("X deve ser >= 1 ou <= 1000");
			System.out.print("X: ");
			X = sc.nextInt();
		}
		
		for(int i = 1; i <= X; i += 2) {
			System.out.println(i);
		}
		
		sc.close();
	}
}
