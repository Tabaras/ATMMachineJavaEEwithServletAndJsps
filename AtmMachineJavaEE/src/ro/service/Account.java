package ro.service;

public class Account {
	
	int userId;
	private String currency;
	private double balance;
	
	
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public double depositMoney(double amount) {
		this.balance += amount;
		return this.balance;
	}
	
	public double withdrawMoney(double amount) {
		
		if(this.balance < amount) {
			System.out.println("Insufficient funds");
		} else {
			this.balance -= amount;
		}
		
		return this.balance;
	}
	
	public double showAccountBalance() {
		
		return this.balance;
	}
	
	public String toString(){
		return "Account balance is: "+balance+" currency: "+currency;
	}
	
	
	
	

}
