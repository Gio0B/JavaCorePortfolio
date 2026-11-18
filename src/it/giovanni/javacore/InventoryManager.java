package it.giovanni.javacore;

import java.util.ArrayList;

public class InventoryManager {
	
	private ArrayList<Product> products;
	
	public InventoryManager() {
		products = new ArrayList<>();
	}
	
	public void addProduct(Product product) {
		
		if (product == null) {
			throw new IllegalArgumentException("Add the item");
		}
		
		for (Product productItem : products) {
			
			if (productItem.getId().equals(product.getId())) {
				throw new IllegalArgumentException("Item already in the list of products");
			}
		}
		
		products.add(product);
	}
	
	public void removeProduct(String id) {
		
		if (id == null || id.isBlank()) {
			throw new IllegalArgumentException("Type a valid id");
		}
		
		Product product = findProductById(id);
		
		if (product == null) {
			throw new IllegalArgumentException("Item not found");
		}
		
		products.remove(product);
		
	}
	
	
	public Product findProductById(String id) {
		if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("Insert a valid id!");
        }
		
		for (Product productItem : products) {
			if (productItem.getId().equals(id)) {
                return productItem;
            }
		}
		
		return null;
		
	}
	
	public Product findProductByName(String name) {
		
		if (name == null || name.isBlank()) {
			throw new IllegalArgumentException("Insert a valid name!");
		}
		
		for (Product productItem : products) {
			if (productItem.getName().equals(name)) {
				return productItem;
			}
		}
		
		return null;
	}
	
	public void updateProductPrice(String id, double newPrice) {
	    if (id == null || id.isBlank()) {
	        throw new IllegalArgumentException("Invalid id");
	    }

	    if (newPrice <= 0 || !Double.isFinite(newPrice)) {
	        throw new IllegalArgumentException("Invalid price");
	    }

	    Product product = findProductById(id);

	    if (product == null) {
	        throw new IllegalArgumentException("Product not found!");
	    }

	    product.setPrice(newPrice);
	}
	
	public void updateProductQuantity(String id, int newQuantity) {
		if (id == null || id.isBlank()) {
			throw new IllegalArgumentException("Invalid id");
		}
		
		if (newQuantity < 0) {
			throw new IllegalArgumentException("Invalid quantity");
		}
		
		Product product = findProductById(id);

		if (product == null) {
		    throw new IllegalArgumentException("Product not found!");
		}

		product.setQuantity(newQuantity);
	}
	
	public int getTotalProducts() {
		return products.size();
	}
	
	public double getTotalInventoryValue() {
		
		double totalInventoryValue = 0;
		
		for (Product product : products) {
			totalInventoryValue += product.getPrice() * product.getQuantity();
		}
		
		return totalInventoryValue;
	}
	
	public ArrayList<Product> getAllProducts(){
		return new ArrayList<>(products);		
	}

}
