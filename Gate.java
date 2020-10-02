package system;

public class Gate {
	private String name;
	private double distance;
	private double fare;

	public Gate(String name, double distance) {
		this.name = name;
		this.distance = distance;
	}

	public void enter(Ticket ticket) {
		if (ticket.isValid()) {
			ticket.setOrigin(this);
			open();
		} else
			close();
	}

	public void exit(Ticket ticket) {
		Gate origin = ticket.getOrigin();
		if (ticket.isValid()) {
			double d = Math.abs(getDistance() - origin.getDistance());
			fare = Line.getFare(d);
			if (ticket.getValue() > fare) {
				open();
				ticket.deduct(fare);
				ticket.setOrigin(null);

			} else
				close();
		} else
			close();
	}

	public double getFare() {
		return fare;
	}

	public void open() {
		System.out.println(this.name + " is open");
	}

	public void close() {
		System.out.println(this.name + " is close");
	}

	public double getDistance() {
		return distance;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Fare" + getFare();
	}
}
