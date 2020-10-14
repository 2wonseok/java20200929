package chap06.textbook.exercises.p20;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scaneer = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scaneer.nextInt();
			
			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
	}
	
	//계좌 생성하기
	private static void createAccount() {
		System.out.println("------------");
		System.out.println("계좌생성");
		System.out.println("------------");
		
		System.out.print("계좌번호: ");
		String ano = scaneer.next();
		
		System.out.print("계좌주: ");
		String owner = scaneer.next();
		
		System.out.print("초기 입금액: ");
		int balance = scaneer.nextInt();
		
		Account newAccount = new Account(ano, owner, balance);

		for (int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("결과:계좌가 생성되었습니다.");
				break;
			}
		}
		
	}
	//계좌 목록 보기
	private static void accountList() {
		System.out.println("------------");
		System.out.println("계좌 목록");
		System.out.println("------------");
		
		for (int i = 0; i < accountArray.length; i++) {
			Account account = accountArray[i];
			if(account != null) {
				System.out.println("계좌번호: " + account.getAno());
				System.out.println("계좌주 " + account.getOwner());
				System.out.println("잔액: " + account.getBalance());
			}
			
		}
	}
	//예금하기
	private static void deposit() {
		System.out.println("------------");
		System.out.println("예금");
		System.out.println("------------");
		
		System.out.print("계좌번호: ");
		String ano = scaneer.next();
		
		System.out.print("예금액: ");
		int balance = scaneer.nextInt();
		
		Account account = findAccount(ano);
		
		if (account == null) {
			System.out.println("계좌정보가 없습니다.");
			return;
		}
		
		account.setBalance(account.getBalance() + balance);
		System.out.println("입금이 완료되었습니다.");
	
	}
	//출금하기
	private static void withdraw() {
		System.out.println("------------");
		System.out.println("출금");
		System.out.println("------------");
		
		System.out.print("계좌번호: ");
		String ano = scaneer.next();
		
		System.out.print("출금액: ");
		int balance = scaneer.nextInt();
		
		Account account = findAccount(ano);
		
		if (account == null) {
			System.out.println("계좌정보가 없습니다.");
			return;
		}
		
		int bal = account.getBalance() - balance;
		if (bal >= 0) {
			account.setBalance(bal);
			System.out.println("출금이 완료되었습니다.");
		} else {
			System.out.println("잔액이 부족합니다.");
		}
	}
	
	private static Account findAccount(String ano) {
		Account account = null;
		for (int i = 0; i < accountArray.length; i++) {
			if(accountArray[i].getAno().contentEquals(ano)) {
				return accountArray[i];
			} else {
				return account;
			}
		}	
		return account;
	}
	
}
