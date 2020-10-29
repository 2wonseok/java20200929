package chap12.lecture.concurrency;

public class ConcurrencyEx2 {
	static int field = 0;

	public synchronized static void inc() {
		field++;
	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 100_0000; i++) {
					inc();
				}
				System.out.println(getName() + "종료");
				System.out.println(field);
			};
		};
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 100_0000; i++) {
					inc();
				}
				System.out.println(getName() + "종료");
				System.out.println(field);
			};
		};
		
		t1.start();
		t2.start();
	}
}
