package bank;

public class CurrentPlus extends CurrentAccount{
	private double charge;
	private double balance;
	private double minimum;
	private double annualInterest;
	private final int MONTH_IN_YEAR = 12;
	
	public CurrentPlus(String id, double balance, double charge ,double minimum, double annualInterest ) {
		super(id,  balance, charge);
		this.minimum = minimum;
		this.annualInterest = annualInterest;
	}
	
	@Override
	public int monthlyinterest() {
		
		if(getBalance() >= minimum)
			return (int) (getBalance() * annualInterest / MONTH_IN_YEAR);
		else
			return 0;
	}

}
