package highway;

public interface Payable {
	boolean isValid();

	void adjustValue(int amount);

	void deduct(int amount);

	void setOrigin(Gate origin);

	Gate getOrigin();

	int getValue();
	void setValid(boolean valid);
}
