package application;

import java.util.Scanner;

import entities.Employee;

public class programEmployee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		double netSalary = employee.netSalary();
		System.out.printf("\nEmployee: " + employee.toString(netSalary));
		
		System.out.print("\nWhich porcentage to increase salary? ");
		double porcentage = sc.nextDouble();
		employee.increaseSalary(porcentage);
		
		netSalary = employee.netSalary();
		System.out.printf("\nUpdate data: " + employee.toString(netSalary));
		
		sc.close();
	}
}
