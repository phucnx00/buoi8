package highway;

public class PrepaidCard implements Payable{
	private Gate gate;
	private int value;
	
	
	public PrepaidCard(int value) {
		this.value = value;
		
	}
	@Override
	public void adjustValue(int amount) {
		// TODO Auto-generated method stub
		deduct(amount);
	}
	
	@Override
	public void deduct(int fare) {
		// TODO Auto-generated method stub
		value -= fare;
		
	}
	public boolean isValid() {
		// TODO Auto-generated method stub
		return getValue() > 0;
	}
	
	@Override
	public void setOrigin(Gate origin) {
		this.gate = origin;
	}
	@Override
	public Gate getOrigin() {
		// TODO Auto-generated method stub
		return gate;
	}
	@Override
	public int getValue() {
		// TODO Auto-generated method stub
		return value;
	}
	@Override
	public void setValid(boolean valid) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "prepaid value: " + this.getValue();
	}
}
