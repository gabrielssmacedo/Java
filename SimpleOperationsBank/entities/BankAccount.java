package entities;

public class BankAccount {
	private int number;
	private String name;
	private double balance;
	
	public BankAccount(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public BankAccount(int number, String name, double balance) {
		this.number = number;
		this.name = name;
		deposit(balance);
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNumber() {
		return number;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double val) {
		balance += val;
		System.out.printf("\nYou just deposited $ %.2f\n\n", val);
	}
	
	public void withdraw(double val) {
		if(val > balance) System.out.println("\nInsufficient balance");
		else {
			balance = balance - val - 5;
			System.out.printf("\nYou just withdrew $ %.2f\n\n", val);
		}
		
	}
	
	public String toString() {
		return "Account " + number + ", Holder: " +
				name + ", Balance: $ " + 
				String.format("%.2f\n", balance);
	}
}
