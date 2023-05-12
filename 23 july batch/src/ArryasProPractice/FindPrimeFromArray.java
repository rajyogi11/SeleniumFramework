package ArryasProPractice;

public class FindPrimeFromArray {
	
	public static void main(String[] args) {
		
		
		int arr [] = {12,55,30,17,45,3,7};
		
		int temp=0;
		
		for(int i=0; i<arr.length-1; i++) { // extra for loop
			
			for(int j=1; j<i; i++) {
				//if(no%2==0) { // change
				if (arr[i]%j==0 ) {
					temp=temp+1;
					
				}
			}
			if (temp==0) {
				//System.out.println("No is not prime"); //change
				System.out.println(arr[i]);
			}
	//		else {
		//		System.out.println("No is prime"); // change
		//		temp=0;
		//	}
			
		}

	}
	}


	


