package entities;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double porcentage) {
		grossSalary += grossSalary * (porcentage/100);
	}
	
	public String toString(double netSalary) {
		return  name + ", $ " + 
				String.format("%.2f", netSalary);
	}
}
