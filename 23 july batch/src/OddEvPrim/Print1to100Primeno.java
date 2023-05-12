package OddEvPrim;

public class Print1to100Primeno { // for print 1 to 100 prime no
	
	public static void main(String[] args) {
		
		int temp=0;
		
		for(int k =1; k<=100; k++) { // extra for loop for 1to100
			
			for(int i=2; i<=k-1; i++) { // k-1 for index
				
				if(k%i==0) {  // change 
					temp=temp+1;
				}
			}
		
		
		if (temp==0) {  //  comparison is change
			System.out.println(k);
		}
		else {  // change
			temp=0;
		}
		
	}

}
}
