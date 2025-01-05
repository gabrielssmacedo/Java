package application;

import java.util.Scanner;

import entities.Student;

public class programStudent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Enter to student datas (name, n1, n2, n3):");
		
		student.name = sc.nextLine();
		student.n1 = sc.nextDouble();
		student.n2 = sc.nextDouble();
		student.n3 = sc.nextDouble();
		
		student.calculeScoreMedia();
		String isPass = student.isPass();
		
		System.out.printf("FINAL GRADE = %.2f", student.scoreMedia);
		System.out.printf(isPass);
		
		
		
		sc.close();
	}
}
