package OddEvPrim;

public class PrimeAbcd1to100 {
	
	
	public static void main(String[] args) {
		
		
		int temp=0;
		
		for(int i=2; i<100;i++) {
			
			for(int j=2;j<i;j++) {  // j=2 constant
				
				if(i%j==0) {
				temp++;
				}
			}
			
		
		if(temp==0) {
			System.out.println(i);
			
			
		}
		
		else {
			temp=0;
		}
	}

}
}