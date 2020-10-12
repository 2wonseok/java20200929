package chap06.textbook.s060705;

public class Car {
	// 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	public Car() {
		
	}
	
	public Car(String model) {
		this(model, "은색", 250);
	}
	
	public Car(String model, String color) {
		this(model, color, 250);
	}
	
	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
