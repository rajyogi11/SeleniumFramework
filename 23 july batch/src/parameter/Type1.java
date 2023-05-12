package parameter;

public class Type1 {
	
	public static void demo() {
		
		System.out.println("Runing fast"); // without integer
		
		int a=10; // with integer
		int b=20;
		int c= a*b;
		System.out.println(c);		
				
		
	}
	
	public void memo () {
		
		System.out.println("Running slow"); // with integer
		
		int a = 50;
		int b = 4;
		int c = a/b;
		System.out.println("Division =" +c);
	}
	
	
	public static void main(String[] args) {
		
		demo();
		
	    Type1 s = new Type1();
	    s.memo();
	    		
	    
	
		
	}
	
	
	
	
	
	
	

}
