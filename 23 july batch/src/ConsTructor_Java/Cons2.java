package ConsTructor_Java;

public class Cons2 {
	
	int a; // variable declaration
	int b;
	int m;
	String name;
	String velocity;
	
	Cons2 () {  //zero argument 1
		a = 89; // variable initialization
		b = 90;
	}
		Cons2 (int c, int d) { // user define with Argument/Parameter 2
		a=c;
		b=d;
		}
	Cons2 (int c, int d, int i) { // user define with parameter 3
		 a=c;
		 b=d;
		 m=i;
	} 
	Cons2 (String name, String Velocity) { // user define with parameter 4
		name ="Hello";
		Velocity ="Testing";
	}
		public void addition() { // user define method non static
			System.out.println(m+a+b);
		}
			
		public void St() { // user define method non static 
			System.out.println("Hello");
			System.out.println("Testing");
		}
		
		public static void main(String[] args) {
			Cons2 x = new Cons2 ();
			x.addition();
			x.St();
			
			Cons2 y = new Cons2 (70,70);
			y.addition();
			
			
			Cons2 z = new Cons2 (70,80,90);
			z.addition();
			
			
		}
		
		
		
		
		
		
		
		
	


}
