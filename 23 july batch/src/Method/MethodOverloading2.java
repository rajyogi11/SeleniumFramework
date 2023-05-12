package Method;

public class MethodOverloading2 {
	
	int a =10;
	int b=20;
	int c=30;
	long d = 40;
	float e = 50L;
	
	public static void addition() { // zero argument
	int a = 10;
	int b= 20;
	int c = a+b;
	int d =	a*b;
	
	System.out.println("Addition =" +c);
	System.out.println("Multiplication=" + d);
	}
	
	public static void division(float f, float g, float v) { // with argument
		float a = f;
		float b = g;
		float c = v;
		
		System.out.println(a/b/c);
	}
		
	public void substraction(int m, int n, int o) { // with argument
		int a=m;
		int b= n;
		int c = o;
		
		System.out.println(a-b-c);
	}
	public void multiplication(long x, long y, long z) { // with argument
		long a = x;
		long b = y;
		long c = z;
		System.out.println(a*b*c);
	}
	public static void main(String[] args) {
		
		addition ();
		division(40, 77, 45);
		
		
		MethodOverloading2  s = new MethodOverloading2  ();
		s.substraction(1000, 200, 500);
		s.multiplication(22, 23, 24);
		
	}

} 
