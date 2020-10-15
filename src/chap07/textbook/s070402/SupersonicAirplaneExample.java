package chap07.textbook.s070402;

public class SupersonicAirplaneExample {
	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAirplane.SPUERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
	}
}
