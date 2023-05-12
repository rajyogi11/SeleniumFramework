package Programs40;


public class FindPrimeNumber {
	
	public static void main(String[] args) {
		
		int no = 17;  //    Final prime 
		int temp = 0;
		
		for (int i=2; i<no; i++) {
			
			if (no%i==0) {   //
				temp++;
			}      
		
		}
		if (temp==0) {
			System.out.println("number is prime");
		}
		else {
			System.out.println("not prime number");
		}
	}

}
