package bank;
import java.text.NumberFormat;

public abstract class Account {
	private String id;
	private double balance;
	
	public Account(String id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	
	public abstract int monthlyinterest();
		
	public void deposit(double amount) {
		this.balance = this.balance + amount;
	}
	
	public void deduct(double amount) {
		if(this.balance < amount) 
			throw new IllegalArgumentException("so du k du");
		this.balance -= amount;
		
	}
	
	public String getId() {
		return this.id;
	}
	
	public double getBalance() {
		return balance;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		NumberFormat formater = NumberFormat.getCurrencyInstance();
		return getId() + "\t" + formater.format(getBalance()) + formater.format(monthlyinterest());
		
	}
}
