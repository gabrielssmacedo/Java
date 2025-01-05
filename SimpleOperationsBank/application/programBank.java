package application;

import java.util.Scanner;
import entities.BankAccount;

public class programBank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankAccount customer;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is there a initial deposit (y/n)? ");
		char resp = sc.next().charAt(0);
		
		
		if(resp == 'y') {
			System.out.print("Enter initial deposit: $");
			double initialVal = sc.nextDouble();
			customer = new BankAccount(number, name, initialVal);
		}
		else {
			customer = new BankAccount(number, name);
		}
		
		
		System.out.print("\nWhat do you want?\n[1] DEPOSIT\n[2] WITHDRAW\n[3] BALANCE\nEXIT: any\n\n>> ");
		int response = sc.nextInt();
			
		while(response > 0 && response < 4) {
			
			switch(response) {
			case 1: 
				System.out.print("Enter a deposit value: $");
				double valDeposit = sc.nextDouble();
				customer.deposit(valDeposit);
				break;
			case 2:
				System.out.print("Enter a withdraw value: $");
				double valWithdraw = sc.nextDouble();
				customer.withdraw(valWithdraw);
				break;
			case 3: 
				System.out.println("\nAccount data:");
				System.out.println(customer);
				break;
			}
			System.out.print("What do you want?\n[1] DEPOSIT\n[2] WITHDRAW\n[3] BALANCE\nEXIT: any\n\n>> ");
			response = sc.nextInt();
		}
		
		System.out.println("\nThank you for using our services");
		
		sc.close();
	}
}
