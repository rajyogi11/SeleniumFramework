package String;

public class Fibonacci {
	
	public static void main(String[] args) { // 0 1 1 2 3 5 8 etc
		
		int a = 0;
		int b=1;
		int d =0;
		int n =10;
		
	
		
		for (int i=0; i<n; i++) {
			
			d=a+b;  // a=0 b =1
			
			System.out.print(a+" "); // 1
			
			a=b;  // a value assign to b =0 and a is empty
			b=d;  // b value assign to d=0 and b=1
		}
	}
	

}
