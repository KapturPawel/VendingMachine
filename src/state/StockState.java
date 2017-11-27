package state;

import java.util.Scanner;

public class StockState implements State {
	public int towar;
	
	VendingMachine vendingMachine;
	
	int zapasCola = 3;
	int zapasBaton = 3;
	int zapasGuma = 3;
	int zapas;
	
	public StockState(VendingMachine vendingMachine) {
		this.vendingMachine = vendingMachine;
	}
	
	//COLA
	public void setZapasCola(int zapasCola) {
		this.zapasCola = zapasCola;
	}
	public int getZapasCola(){
		return zapasCola;
	}
	
	//BATON
	public void setZapasBaton(int zapasBaton) {
		this.zapasBaton = zapasBaton;
	}
	public int getZapasBaton(){
		return zapasBaton;
	}
	
	//GUMA
	public void setZapasGuma(int zapasGuma) {
		this.zapasGuma = zapasGuma;
	}
	public int getZapasGuma(){
		return zapasGuma;
	}
	

	
	
	@Override
	public void insertMoney() {
		vendingMachine.setState(vendingMachine.depositState);
		vendingMachine.insertMoney();
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
			vendingMachine.setState(vendingMachine.depositState);
		}
		
		
	}
	
	Product product = new Product(0,0);
	Product cola = new Product(getZapasCola(), 2.50);
	Product baton = new Product(getZapasBaton(), 1.00);
	Product guma = new Product(getZapasGuma(), 0.50);
	
	@Override
	public void pickProduct() {
	    System.out.println("pick your product: 1 - cola, 2 - baton, 3 - guma");    
        Scanner scanner2 = new Scanner(System.in);
    	int firstProduct = scanner2.nextInt();  
    	towar = firstProduct;
		if (towar == 1) {
			if (DepositState.allCash >= cola.getPrice()) {
				dispense();
			} else {
				System.out.println("Not enough money. Insert more money");
				vendingMachine.insertMoney();
			}
		}
		else if (towar == 2) {
			if (DepositState.allCash >= baton.getPrice()) {
				dispense();
			} else {
				System.out.println("Not enough money. Insert more money");
				vendingMachine.insertMoney();
			}
		}
		else if (towar == 3) {
			if (DepositState.allCash >= guma.getPrice()) {
				dispense();
			} else {
				System.out.println("Not enough money. Insert more money");
				vendingMachine.insertMoney();
			}
		}
		else {
			System.out.println("There is no such item!");
			vendingMachine.pickProduct();
		}
		
	}

	@Override
	public void dispense() {
		if (towar == 1) {
			if (cola.getQuantity() > 0) {
					cola.setQuantity(cola.getQuantity() - 1);
					DepositState.allCash = DepositState.allCash - cola.getPrice();
					System.out.println("Stock: " + cola.getQuantity());
					System.out.println("Current balance: " + DepositState.allCash);
					if (cola.getQuantity() + baton.getQuantity() + guma.getQuantity() == 0){
						System.out.println("Mahine is out of stock!");
						vendingMachine.setState(vendingMachine.getOutOfStockState());						
					}
				} else {
					System.out.println("Out of stock.");

				}
		}
		else if (towar == 2) {
			if (baton.getQuantity() > 0) {
					baton.setQuantity(baton.getQuantity() - 1);
					DepositState.allCash = DepositState.allCash - baton.getPrice();
					System.out.println("Stock: " + baton.getQuantity());
					System.out.println("Current balance: " + DepositState.allCash);
					if (cola.getQuantity() + baton.getQuantity() + guma.getQuantity() == 0){
						System.out.println("Mahine is out of stock!");
						vendingMachine.setState(vendingMachine.getOutOfStockState());						
					}
				} else {
					System.out.println("Out of stock.");
				}
		}
		if (towar == 3) {
			if (guma.getQuantity() > 0) {
					guma.setQuantity(guma.getQuantity() - 1);
					DepositState.allCash = DepositState.allCash - guma.getPrice();
					System.out.println("Stock: " + guma.getQuantity());
					System.out.println("Current balance: " + DepositState.allCash);
					if (cola.getQuantity() + baton.getQuantity() + guma.getQuantity() == 0){
						System.out.println("Mahine is out of stock!");
						vendingMachine.setState(vendingMachine.getOutOfStockState());						
					}
				} else {
					System.out.println("Out of stock.");;
				}
		}
		
	}

}
