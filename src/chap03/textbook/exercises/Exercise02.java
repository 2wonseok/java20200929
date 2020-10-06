package chap03.textbook.exercises;

public class Exercise02 {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z);
		// 3번 문제
		int score = 85;
		String result = (!(score > 90)) ? "가" : "나";
		System.out.println(result);
		// 4번 문제
		int pencils = 534;
		int student = 30;
		
		int pencilsPerStudent = pencils / student;
		System.out.println(pencilsPerStudent);
		
		int pencilsLeft = pencils % student;
		System.out.println(pencilsLeft);
		// 5번 문제
		int value = 356;
		System.out.println((value / 100) * 100);
		// 6번 문제
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		
		double area = ((double) lengthTop + lengthBottom) * height / 2;
		System.out.println(area);
		// 7번 문제
		int a = 10;
		int b = 5;
		
		System.out.println( (a > 7) && ( b <= 5));
		System.out.println( (a % 3 == 2) || (b % 2 != 1));
		// 8번 문제
		double j = 5.0;
		double i = 0.0;
		
		double k = j % i;
		
		if (Double.isNaN(k)) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		} else {
			double result2 = k + 10;
			System.out.println("결과:" + result2);
		}
	}
}
