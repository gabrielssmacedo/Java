package application;

import java.util.Scanner;

import entities.Rectangle;

public class ProgramRectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height:");
		rectangle.height = sc.nextDouble();
		rectangle.width = sc.nextDouble();
		
		double area = rectangle.area();
		double perimeter = rectangle.perimeter();
		double diagonal = rectangle.diagonal();
		
		System.out.printf("AREA: %.2f\n", area);
		System.out.printf("PERIMETER: %.2f\n", perimeter);
		System.out.printf("DIAGONAL: %.2f\n", diagonal);
		
		
		
		sc.close();
	}
}
