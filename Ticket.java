 package system;

public  abstract class Ticket {
	private double value;
	private Gate origin;
	
	public Ticket(double value ) {
		// TODO Auto-generated constructor stub
		this.value = value;
	}
	
	public double getValue() {
		return this.value;
	}
	
	public void deduct(double amount) {
		value -= amount;
	}
	
	public abstract void adjustValue(double amount);
	
	public void setOrigin(Gate gate) {
		this.origin = gate;
	}
	
	public Gate getOrigin() {
		return origin;
	}
	
	public abstract boolean isValid();
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Gate: " + (origin != null ? origin.getName() : "") +
                ". Ticket value: " + value;
	}
}
