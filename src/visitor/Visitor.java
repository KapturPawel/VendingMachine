package visitor;

public interface Visitor {
	
	public double visit(Alcohol alcoholItem);
	
	public double visit(Tobacco tobaccoItem);
	
	public double visit(Petrol petrolItem);
	
	public double visit(Necessity necessityItem);
	
}