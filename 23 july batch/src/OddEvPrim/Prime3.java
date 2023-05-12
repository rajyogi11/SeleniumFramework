package OddEvPrim;

public class Prime3 {
	
	
	
	
	public static void main(String[] args) {
		
		int a = 3;
		int factor=0;
		
		for(int i =1; i<=a; i++) {
			
			if(a%i==0) {
				factor++;
			}
			
		}
		if(factor==2) {
			System.out.println(a+ " no is prime ");
		}
		else {
			System.out.println((a+ " no is not prime"));
		}
		
	}
}
