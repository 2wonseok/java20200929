package chap06.textbook.s061401;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setSpeed(-50); // 0보다 작으면 speed가 0이 되고 리턴하기 때분에 변경되지않음.
		
		System.out.println("현재속도: " + myCar.getSpeed());
		
		myCar.setSpeed(60);
		
		if (!myCar.isStop()) {
			myCar.setStop(true);
		}
		
		System.out.println("현재속도: " + myCar.getSpeed());
	}
}
