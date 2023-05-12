package Interface;

public class inter1 implements Inter  { // interface to class using implements keywords
	
	public void Demo () {
		System.out.println("hi"); // complete the method from  interface 
	}
	
	public void memo () {
		System.out.println("by");  // complete the method from  interface
	}
	
	
	public static void main(String[] args) {
		
	
	inter1 x = new inter1 ();
	x.Demo();
	x.memo();
	
	}	
	

	

}
