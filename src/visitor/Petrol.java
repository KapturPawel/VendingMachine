package visitor;

public class Petrol implements Visitable {
	
	private double price;

	public Petrol(double item) {
		price = item;
	}

	public double accept(Visitor visitor) {
		return visitor.visit(this);
	}

	public double getPrice() {
		return price;
	}
	
}