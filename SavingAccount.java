package bank;

import java.text.NumberFormat;

public class SavingAccount extends Account{
	private double annualInterest;
	private final double MONTH_IN_YEAR = 12;
	
	
	public void widthdraw(double amount) {
		deduct(amount);
	}
	
	public SavingAccount(String id, double balance, double annual) {
		super(id, (int) balance);
		this.annualInterest = annual;
		
	}
	@Override
	public int monthlyinterest() {
		return (int) (this.getBalance() * this.annualInterest / this.MONTH_IN_YEAR) ;
	}
	

}
