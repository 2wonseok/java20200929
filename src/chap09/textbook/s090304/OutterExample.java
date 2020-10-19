package chap09.textbook.s090304;

public class OutterExample {
	public static void main(String[] args) {
		Outter outter = new Outter();
		Outter.nested nested = outter.new nested();
		nested.print();
	}
}
