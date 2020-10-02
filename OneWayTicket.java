package system;

public class OneWayTicket extends Ticket {

	
	private boolean valid = true;

	public OneWayTicket(double value) {
		// TODO Auto-generated constructor stub
		super(value);
	}

	@Override
	public void adjustValue(double amount) {

	}

	@Override
	public boolean isValid() {
		// TODO Auto-generated method stub
		return this.valid;
	}

}
