package Interface;

public class TestDefault1 implements Default  { // new implementation class
	
	
	public void Mart () {  // completed from interface
		System.out.println("All Shops Closed"); 
			
	}
	
	public static void main(String[] args) {
		
		TestDefault x = new TestDefault (); // create object for TestDefault
		
		TestDefault1 y = new TestDefault1 ();  // create object for different class like TestDEfault1
		
		x.Mart(); // completed method from interface to class Default
		x.Dmart(); // default method of interface from TestDefault implements and implementation change
		
		
		y.Mart(); // completed from interface implements to class TestDefault1 
		y.Dmart(); // default method come from Default interface
		
	}
	
	
	

}
