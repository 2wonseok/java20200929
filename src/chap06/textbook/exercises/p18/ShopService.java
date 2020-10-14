package chap06.textbook.exercises.p18;

public class ShopService {
	private final static ShopService ins = new ShopService();
	
	private ShopService() {}
	
	static ShopService getInstance() {
		return ins;
	}
}