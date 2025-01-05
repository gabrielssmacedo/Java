package exercicios;

import java.util.Scanner;

public class ex13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float X, Y;
		X = sc.nextFloat();
		Y = sc.nextFloat();
		
		if(X > 0 && Y > 0) System.out.println("Q1");
		else if(X < 0 && Y > 0) System.out.println("Q2");
		else if(X < 0 && Y < 0) System.out.println("Q3");
		else if(X > 0 && Y < 0) System.out.println("Q4");
		else if(X == 0 && Y == 0) System.out.println("Origem");
		else if(X == 0 ) System.out.println("Eixo X");
		else if(Y == 0 ) System.out.println("Eixo Y");
		
		
		
		
		sc.close();
	}
}
