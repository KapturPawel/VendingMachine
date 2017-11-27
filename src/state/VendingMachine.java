package state;

public class VendingMachine {
	
	
	State stockState;
	State depositState;
	State outOfStockState;
	State state;
	double cash;
	
	
	
	public VendingMachine() {
		stockState = new StockState(this);
		depositState = new DepositState(this);
		outOfStockState = new OutOfStockState(this);
		state = depositState;
	}
	
	public void insertMoney() {
		state.insertMoney();
	}
	
	public void pickProduct() {
		state.pickProduct();
	}
	
	public void ejectMoney(){
		state.ejectMoney();
	}
	/*public void dispense(){
		state.dispense();
	}*/
	
	
	public void setState(State state) {
		this.state = state; 
	}
	public State getStockState() {
		return stockState; 
	}
	public State getDepositState() {
		return depositState; 
	}
	
	public State getOutOfStockState(){
		return outOfStockState;
	}
	
}
