package visitor;

public class Alcohol implements Visitable {
	
	private double price;

	public Alcohol(double item) {
		price = item;
	}

	public double accept(Visitor visitor) {
		return visitor.visit(this);
	}

	public double getPrice() {
		return price;
	}
	
}