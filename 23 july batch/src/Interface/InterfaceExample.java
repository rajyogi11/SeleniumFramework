package Interface;

public class InterfaceExample implements MyInterface {
	
	public void display() {
		System.out.println("up casting");
	}
	
	public void show() {
		System.out.println("Sub class method");
	}
	
	public static void main(String[] args) {
		
		MyInterface  x = new InterfaceExample();  // up casting  reference of interface
		
		x.display(); // inherited method eligible for up casting
		
		
		
	}


}
