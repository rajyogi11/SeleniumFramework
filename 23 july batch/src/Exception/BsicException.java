package Exception;

public class BsicException {
	
	static void demo() {
		
		throw new NullPointerException();
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.out.println("Hello");
		
		demo();
		
		Thread.sleep(5000);
		
		System.out.println("Hi");
	}

}
