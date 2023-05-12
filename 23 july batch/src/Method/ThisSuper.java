package Method;

public class ThisSuper extends This1Super{
	
	int a =45;
	int b =78;  // global variable
	
	
	
	
	public void name() {
		
		String w = ("Welcome to the office");
		
		System.out.println(this.a); // local variable
		System.out.println(this.b);
		System.out.println(super.a); // global variable from super class
	    System.out.println(w);
		
	}
	
public static void main(String[] args) {
	
	
	ThisSuper x = new ThisSuper();
	x.name();
	System.out.println(x.a);
	System.out.println(x.b);
	
}
		
		
		
		
		
	}


