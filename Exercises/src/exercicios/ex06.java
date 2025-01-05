package exercicios;

import java.util.Scanner;

public class ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calcula áreas: Digite 3 valores ('A B C')\n");
		
		float A, B, C;
		
		A = sc.nextFloat();
		B = sc.nextFloat();
		C = sc.nextFloat();
		
		double aTriangulo = (A*C) / 2;
		double aCirculo = 3.14159 * Math.pow(C, 2);
		double aTrapezio = ((A+B)*C) / 2;
		double aQuadrado = Math.pow(B, 2);
		double aRetangulo = A * B;
		
		
		System.out.printf("TRIANGULO: %.3f\n", aTriangulo);
		System.out.printf("CIRCULO: %.3f\n", aCirculo);
		System.out.printf("TRAPEZIO: %.3f\n", aTrapezio);
		System.out.printf("QUADRADO: %.3f\n", aQuadrado);
		System.out.printf("RETANGULO: %.3f\n", aRetangulo);
	
		sc.close();
	}
}
