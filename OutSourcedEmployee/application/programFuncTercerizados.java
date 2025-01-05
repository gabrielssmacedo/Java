package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employeee;
import entities.OutsourcedEmployee;

public class programFuncTercerizados {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of employees: ");
		int quantityEmployee = sc.nextInt();
		List<Employeee> employees = new ArrayList<>();
		
		for(int i = 0; i < quantityEmployee; i++) {
			System.out.printf("Employee #%d data:\n", i+1);
			System.out.print("Outsourced (y/n):");
			char resp = sc.next().charAt(0);
			if(resp == 'y') {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Hours: ");
				Integer hours = sc.nextInt();
				System.out.print("Value per Hour: ");
				Double valuePerHour = sc.nextDouble();
				System.out.print("Additional charge: ");
				Double additionalCharge = sc.nextDouble();
				Employeee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				employees.add(emp);
			} else {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Hours: ");
				Integer hours = sc.nextInt();
				System.out.print("Value per Hour: ");
				Double valuePerHour = sc.nextDouble();
				Employeee emp = new Employeee(name, hours, valuePerHour);
				employees.add(emp);
				
			}
		}
		
		System.out.println("\nPAYMENTS:");
		
		for(Employeee emp : employees) {
			System.out.printf(emp + "\n");
		}
		
		
		
		sc.close();
	}
}
