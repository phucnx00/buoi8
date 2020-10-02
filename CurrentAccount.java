package bank;

public class CurrentAccount extends  Account{
	private double charge;

	
	public CurrentAccount(String id, double balance, double charge) {
		super(id, balance);
		this.charge = charge;
	}
	
	public void clearcheck(double amount) {
		if(getBalance() < amount)
			throw new IllegalArgumentException("so du k du");
		deduct(amount + charge);
	}
	@Override
	public int monthlyinterest() {
		return 0;
	}
}
