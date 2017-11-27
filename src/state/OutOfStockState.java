package state;

public class OutOfStockState implements State {


	VendingMachine vendingMachine;
	
	public OutOfStockState(VendingMachine vendingMachine) {
		this.vendingMachine = vendingMachine;
	}

	@Override
	public void insertMoney() {
		System.out.println("You can't insert money now!");
		
	}

	@Override
	public void ejectMoney() {
		if (DepositState.allCash == 0){
			System.out.println("There is nothing to eject");
		}
		if (DepositState.allCash > 0){
			DepositState.allCash = 0;
			System.out.println("You ejected your money from VendingMachine");
			System.out.println("Current balance: " + DepositState.allCash);
		}
	}
			

	@Override
	public void pickProduct() {
		System.out.println("There are no products!");
		
	}

	@Override
	public void dispense() {
	
	}

}
