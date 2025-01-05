package entities;

public class Produto {
	private String name;
	private double price;
	
	public Produto(String name, double price){
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}
	
	public String toString() {
		return  getName() + 
			   ": " +
			   String.format("%.2f", getPrice());
	}
}
