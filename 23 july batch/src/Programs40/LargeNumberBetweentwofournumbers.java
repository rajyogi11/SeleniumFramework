package Programs40;

public class LargeNumberBetweentwofournumbers {
	
	public static void main(String[] args) {
		
		int a = 44;
		int b = 90;
		int c = 777;
		int d = 22;
		
		if(a>=b &&  a>=c && a>=d ) {
			
			System.out.println("a is largest");
		}
		
		
		
		else  if(b>=a && b>=c && b>=d) {
			
			System.out.println("b is largest number");
		}
		 
		 else if(c>=a && c>=b && c>=d) {
			 
			 System.out.println("c is largest number");
		 }
		
		 else {
			 
			 System.out.println("d is largest number");
		 }
	}

}
