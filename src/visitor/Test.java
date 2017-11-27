package visitor;

public class Test {
	
	public static void main(String[] args) {
		
		TaxVisitor taxCalc = new TaxVisitor();
		LowerTaxVisitor lowerTaxCalc = new LowerTaxVisitor();
		
		Necessity milk = new Necessity(2.5);
		Alcohol vodka = new Alcohol(29.99);
		Tobacco cigars = new Tobacco(9.99);
		Petrol gas = new Petrol(5.2);
		
		System.out.println(milk.accept(taxCalc));
		System.out.println(vodka.accept(taxCalc));
		System.out.println(cigars.accept(taxCalc));
		System.out.println(gas.accept(taxCalc) + "\n");
		
		System.out.println("Lower Taxes Day");

		System.out.println(milk.accept(lowerTaxCalc));
		System.out.println(vodka.accept(lowerTaxCalc));
		System.out.println(cigars.accept(lowerTaxCalc));
		System.out.println(gas.accept(lowerTaxCalc));
	}
}