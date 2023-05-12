package Method;

public class Globallocal {
	
	
	int a = 80 ; // global variable declared outside the method
	
	public void Test () {
		int b = 78; // local variable declared in side the method
		int a = 45;
		System.out.println(a);
		System.out.println(b);
		
		                 //user define global variable out side method call betn'n two method
	}
	public void Test1 () {
		int c = 90;
		int b = 12;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
	    public static void main(String[] args) {
	    	
          Globallocal  x = new Globallocal () ;
          
	    	 System.out.println(x.a); // global variable
	   
	    	 
	    	 x.Test();
	    	 x.Test1();
	    	
			
		}

	   
	    
	    
	    
	    
	
}
