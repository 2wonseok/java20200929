package chap04.exercises;

import java.util.Scanner;

public class Exercises07 {
	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while (run) {
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택> ");
			
			int num = scanner.nextInt();
			
			if(num == 1) {
				System.out.println("입금할 금액을 입력하세요 -> ");
				balance += scanner.nextInt();
			} else if (num == 2) {
				System.out.println("출금할 금액을 입력하세요 -> ");
				balance -= scanner.nextInt();
			} else if (num == 3) {
				System.out.println("남은 금액 = ");
				System.out.println(balance);
			} else if (num == 4) {
				run = false;
			}
		}	
		System.out.println("프로그램 종료");
	}
}


