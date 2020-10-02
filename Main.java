package system;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var oneway = new OneWayTicket(200);
		
		Line.A.enter(oneway);
		Line.B.exit(oneway);
		
		System.out.println(oneway.toString());
		System.out.println(Line.B);
		
		Line.A.enter(oneway);
		Line.B.exit(oneway);
		System.out.println(oneway.toString());
		System.out.println(Line.B);
	}

}
