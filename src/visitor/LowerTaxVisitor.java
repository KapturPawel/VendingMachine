package visitor;

public class LowerTaxVisitor implements Visitor {
	
	public LowerTaxVisitor() {
	}
	
	// liczy cene z mniejszym opodatkowaniem, jakby inna wersja
	
	public double visit(Alcohol alcoholItem) {
		System.out.println("Liquor Item: Price with Tax");
		return (alcoholItem.getPrice() * .10 + alcoholItem.getPrice());
	}
		
	public double visit(Tobacco tobaccoItem) {
		System.out.println("Tobacco Item: Price with Tax");
		return (tobaccoItem.getPrice() * .20 + tobaccoItem.getPrice());
	}
	
	public double visit(Petrol petrolItem) {
		System.out.println("Petrol Item: Price with Tax");
		return (petrolItem.getPrice() * .15 + petrolItem.getPrice());
	}
		
	public double visit(Necessity necessityItem) {
		System.out.println("Necessity Item: Price with Tax");
		return (necessityItem.getPrice());
	}

}