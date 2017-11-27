package visitor;

public class TaxVisitor implements Visitor {
	
	public TaxVisitor() {
	}
	
	// liczy calkowita cene z podatkiem
	
	public double visit(Alcohol alcoholItem) {
		System.out.println("Liquor Item: Price with Tax");
		return (alcoholItem.getPrice() * .18 + alcoholItem.getPrice());
	}
	
	public double visit(Tobacco tobaccoItem) {
		System.out.println("Tobacco Item: Price with Tax");
		return (tobaccoItem.getPrice() * .32 + tobaccoItem.getPrice());
	}
	
	public double visit(Petrol petrolItem) {
		System.out.println("Petrol Item: Price with Tax");
		return (petrolItem.getPrice() * .42 + petrolItem.getPrice());
	}
		
	public double visit(Necessity necessityItem) {
		System.out.println("Necessity Item: Price with Tax");
		return (necessityItem.getPrice());
	}

}