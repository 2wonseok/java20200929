package chap04.exercises;

public class Exercises05 {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i ++) {
			for (int j = 1; j <= 10; j++) {
			int num1 = i;
			int num2 = j; 
				if ((4 * num1) + (5 * num2) == 60) {
				System.out.println("("+"x:"+num1+","+"y:"+num2+")");
				}
			}
		}
	}
}
