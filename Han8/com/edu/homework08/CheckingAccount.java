package com.edu.homework08;

public class CheckingAccount extends BankAccount{
	
	
	
	public CheckingAccount(double initialBalance) {
		super(initialBalance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		super.deposit(amount - 1);
	}
	
	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		super.withdraw(amount + 1);
	}
	

}
