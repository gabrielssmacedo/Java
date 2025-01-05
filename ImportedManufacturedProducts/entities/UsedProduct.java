package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public final class UsedProduct extends Producttt {
	private LocalDate manufactureDate;
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public UsedProduct() {
		super();
	}
	public UsedProduct(String name, Double price,LocalDate manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	public LocalDate getManufactureDate() {
		return manufactureDate;
	}
	
	
	@Override
	public String priceTag() {
		return name + " (used) $ " + 
				String.format("%.2f", price) +
			   " (Manufacture date: " + fmt.format(manufactureDate) +
			   ")";
	}
	
	
}
