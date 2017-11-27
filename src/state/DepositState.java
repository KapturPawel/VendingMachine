package state;

import java.util.Scanner;

public class DepositState implements State {
	public static double money;
	public static double allCash;
	
	VendingMachine vendingMachine;
	
	public DepositState(VendingMachine vendingMachine) {
		this.vendingMachine = vendingMachine;
	}
	
	@Override
	public void insertMoney() {
		System.out.println("Insert money.");
		Scanner scanner = new Scanner(System.in);
		money = scanner.nextDouble();
		allCash += money;
		System.out.println("Current balance: " + allCash);
		if (allCash > 0){
			vendingMachine.setState(vendingMachine.getStockState());
		}
		else{
			System.out.println("There is no money in Vending Machine!");
		}
		
	}

	@Override
	public void ejectMoney() {
		System.out.println("There is no money to eject");
	}

	@Override
	public void pickProduct() {

		System.out.println("Insert some money first!");
	}

	@Override
	public void dispense() {

	}

	
}
