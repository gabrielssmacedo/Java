package entities;

public class OrderItem {
	private Integer quantity;
	private Double price;
	private Productt product;
	
	public OrderItem() {
	}

	public OrderItem(Integer quantity, Productt product) {
		this.quantity = quantity;
		this.price = product.getPrice();
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Productt getProduct() {
		return product;
	}

	public void setProduct(Productt product) {
		this.product = product;
	}

	public double subTotal() {
		return quantity * price;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(product + ", Quantity: ");
		sb.append(quantity + ", Subtotal: $" + String.format("%.2f", subTotal()));
		return sb.toString();
	}
	
	
}
