package state;

public class Product {

	int quantity;
	double price;
	
	public Product(int quantity, double price) {
		this.quantity = quantity;
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getQuantity() {
		return quantity;
	}
	
}
