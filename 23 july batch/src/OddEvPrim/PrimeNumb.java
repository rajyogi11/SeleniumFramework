package OddEvPrim;

public class PrimeNumb {
	
	public static void main(String[] args) {
		
		int no = 7; 
		int temp = 0;
		
		for (int i =2; i<=no-1; i++ ) { // check 7 number is divisible to the 6-1 or not
			
			if (no%2==0) {  //reminder, if divisible with 2,3,4,5,6 then comes here and number is not prime
				
				temp = temp+1; // if not then number is prime
			}
		}
		
		if (temp>0) {
			System.out.println("No is not prime");
		}
		else {
			System.out.println("No is Prime");
		}
	}

}
