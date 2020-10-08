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
		
//		String c = scanner.nextLine();
//		
//		switch (c) {
//		case "1":
//			System.out.print("예금액>");
//			String moneyStr1 = scanner.nextLine();
//			int money1 = Integer.valueOf(moneyStr1);
//			balance = balance + money1;
//			break;
//		case "2":
//			System.out.print("출금액>");
//			String moneyStr2 = scanner.nextLine();
//			int money2 = Integer.valueOf(moneyStr2);
//			balance = balance - money2;
//			break;
//		case "3":
//			System.out.println("잔고>" + balance);
//			break;
//		case "4":
//			run = false;
//			break;
//			
//		}
//		
//	}
//	System.out.println("프로그램 종료");
	}
}


