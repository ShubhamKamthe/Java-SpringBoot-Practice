package com.java.basics.oop;

//Think of an ATM machine.
//You interact with it to withdraw money,
//check your balance, etc.,
//without needing to know how it processes
//transactions internally.


abstract class ATM{
	abstract void withdrawMoney();
	abstract void checkBalance();
	
}

class HDFC extends ATM{

	@Override
	void withdrawMoney() {
		// TODO Auto-generated method stub
		System.out.println("Money Withrawn from HDFC");
		
	}

	@Override
	void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("Balance Checked from HDFC");

		
	}
	
}
public class AbstractionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ATM obj = new HDFC();
		obj.checkBalance();
		obj.withdrawMoney();

	}

}
