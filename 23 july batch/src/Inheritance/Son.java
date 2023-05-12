package Inheritance;

public class Son extends Father {
	
	
	public void bike() {
		
		System.out.println("bike");
	}
	
	public void dress() {
		System.out.println("dress");
	}
	
	public static void main(String[] args) {
		
		
		Son x = new Son();
		
		
		System.out.println(x.a);
		x.Home();
		x.car();
		x.pen();
		x.money();
		Father.phone();
		x.bike();
		x.dress();
		
	}

}
