package visitor;

public interface Visitable {

	//visitor moze przekazac obiekt zeby wykonano na nim jego opodatkowanie
	//potem idzie do metody visitora dla danego obiektu
	public double accept(Visitor visitor);
	
}