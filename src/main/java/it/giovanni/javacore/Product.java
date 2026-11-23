package it.giovanni.javacore;

public class Product {
	
	private String id;
	private String name;
	private double price;
	private int quantity;
	
	public Product(String id, String name, double price, int quantity) {
		
		if (id == null || id.isBlank() || name == null || name.isBlank() || price <= 0 || !Double.isFinite(price) || quantity < 0) {
			throw new IllegalArgumentException("Check if all the elements of the item are right");
		}
		
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		
		if (price <=0 || !Double.isFinite(price)) {
			throw new IllegalArgumentException("the price has to be greater than 0");
		}
		
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		
		if (quantity < 0 ) {
			throw new IllegalArgumentException("Quantity cannot be negative!");
		}
		
		this.quantity = quantity;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	
	

}
