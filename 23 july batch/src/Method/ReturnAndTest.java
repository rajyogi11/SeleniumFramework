package Method;

public class ReturnAndTest {
	
	static int Demo() { // user define with int return type
		
		int x=12;
		int y=22;
		int z = x+y;
		return z;
		
	}
	
	static String Test () { // user define with String return type
		return "Welcome to velocity";
		
	}


  public static void main(String[] args) { // main method
	  
	  int z = Demo ();
	  System.out.println(z);
	  
	  String a = Test ();
	  System.out.println(a);
  }
	  
  }
