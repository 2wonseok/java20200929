package chap07.textbook.s070502;

public class SpootsCar extends Car {
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	//오버라이딩을 할 수 없음
	public void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}
}
