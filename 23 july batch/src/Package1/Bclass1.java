package Package1;

public class Bclass1 {
	
	public int a =45; //scope within project
	
	private int b = 44; // scope within class
	
	int c = 55 ; // default scope within package
	
	protected int e =12; // within ass well as outside the package by using inheritance
	
	
	public static void main(String[] args) {
		
		Bclass1 m = new Bclass1();
		
		System.out.println(m.a);
		System.out.println(m.b);
		System.out.println(m.c);
		System.out.println(m.e);
		
		
		
		
	}

}
