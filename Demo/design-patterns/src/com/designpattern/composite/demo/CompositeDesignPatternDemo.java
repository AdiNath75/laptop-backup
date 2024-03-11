package com.designpattern.composite.demo;

import java.util.ArrayList;
import java.util.List;

abstract class Account{
	public abstract float getBalance();
}

class DepositeAccount extends Account{

	private String accountNo;
	private float accountBalance;
	
	
	public DepositeAccount(String accountNo, float accountBalance) {
		this.accountNo = accountNo;
		this.accountBalance = accountBalance;
	}

	@Override
	public float getBalance() {
		return accountBalance;
	}
}

class SavingAccount extends Account{

	private String accountNo;
	private float accountBalance;
	
	
	public SavingAccount(String accountNo, float accountBalance) {
		this.accountNo = accountNo;
		this.accountBalance = accountBalance;
	}

	@Override
	public float getBalance() {
		return accountBalance;
	}
}
class CompositeAccount extends Account{

	private float totalBalance;
	private List<Account> accountList = new ArrayList<>();
	
	@Override
	public float getBalance() {
		totalBalance = 0;
		for (Account acc : accountList) {
			totalBalance = totalBalance + acc.getBalance();
		}
		return totalBalance;
		
	}
	
	public void addAccount(Account acc) {
		accountList.add(acc);
	}
	
	public void removeAccount(Account Acc) {
		accountList.remove(Acc);
	}
}


public class CompositeDesignPatternDemo {
	
	public static void main(String[] args) {
		CompositeAccount component = new CompositeAccount();
		
		component.addAccount(new DepositeAccount("DA001", 150));
		component.addAccount(new DepositeAccount("DA002", 100));
		component.addAccount(new DepositeAccount("SA001", 123));
		
		float totalBalance = component.getBalance();
		System.out.println("Total Balance : " + totalBalance );
		
	}

}
