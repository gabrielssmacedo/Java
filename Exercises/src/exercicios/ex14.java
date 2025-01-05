package exercicios;

import java.util.Scanner;

public class ex14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double imposto = 0.0;
		double salary = sc.nextDouble();
		
		if(salary >= 2000.01 && salary <= 3000.00) imposto = (salary-2000)*0.08;
		else if(salary >= 3000.0 && salary <= 4500.00) imposto = 1000*0.08 + (salary-3000)*0.18;
		else if(salary > 4500.00) imposto = 1000*0.08 + 1500*0.18 + (salary-4500)*0.28;
		
	    if(imposto != 0) System.out.printf("Imposto: R$ %.2f", imposto);
		else System.out.println("Isento");
		
	    
	
		sc.close();
	}
}
