package Interface;

public class MultipleD implements C { // multiple inheritance
	
	public void Science () {
		System.out.println('#');
	}
	public void Physics () {
		System.out.println("Method Physics is Running");
	}
	public void Chemistry () {
		System.out.println("Method Chemistry is Running");
	}
	public void math () {
		System.out.println("Method Math is Running");
	}
	
	public static void main(String[] args) {
		
		MultipleD x = new MultipleD ();
		x.Science();
		x.Physics();
		x.Chemistry();
		x.math();
		
	}
		

}
