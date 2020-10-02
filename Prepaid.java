package system;

public class Prepaid extends Ticket {

	
	public Prepaid(double value) {
		// TODO Auto-generated constructor stub
		super(value);
	}

	@Override
	public void adjustValue(double amount) {
		super.deduct(amount);

	}

	@Override
	public boolean isValid() {
		// TODO Auto-generated method stub
		return this.getValue() > 0;
	}

}
