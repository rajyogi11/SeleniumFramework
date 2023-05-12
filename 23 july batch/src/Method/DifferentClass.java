package Method;

public class DifferentClass extends ThisSuper {
	
	
	int a = 12;
	
	
	
	public void Test() {
		
		
		int b=20;
		int c = 44;
		String y = ("hello");
		System.out.println(y);
		System.out.println(b);
		System.out.println(c);
		System.out.println(super.a);
		System.out.println(super.b);
		
	}
	public static void main(String[] args) {
		
		 DifferentClass x = new  DifferentClass ();
		 x.name();
		 x.Test();
		 
		 
		
	}
		
		
		
		

}
