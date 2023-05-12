package Method;

public class Testabstract extends ABCD{ // Test abstract is concrete class or sub class
	
	public  void Test () {  // complete abstract method
		System.out.println("go");
	}
	public void Demo1 () {  // non static method override
		System.out.println("by");
	}
	
	public static void Demo () {
		System.out.println("Static method is Ended");
	}
	
	
	
	public static void main(String[] args) {
		
		ABCD.Demo();
		
		
		Testabstract x = new Testabstract ();
		x.Demo1();
		x.Test();
		
		
	}
}
