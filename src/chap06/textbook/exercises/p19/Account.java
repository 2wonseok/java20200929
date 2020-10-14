package chap06.textbook.exercises.p19;

public class Account {
	private int balance;
	private final int MIN_BALANCE = 0;
	private final int MAX_BALANCE = 1000000;
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if (balance < MIN_BALANCE || balance >= MAX_BALANCE) {
			//this.balance = 0;
			return;
		} else {
			this.balance = balance;
		}
		
		//this.balance = balance;
	}
	
	
	
}
