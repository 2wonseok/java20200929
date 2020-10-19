package chap08.textbook.s080505;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
			vehicle.run();
			
			Bus bus = (Bus) vehicle;
			
			bus.run();
			bus.checkFare();
			
			System.out.println(vehicle instanceof Bus);
			System.out.println(bus instanceof Vehicle);
			
			System.out.println("--------------------");
			
			Driver driver = new Driver();
//			Driver d1 = (new Bus());
	}
}
