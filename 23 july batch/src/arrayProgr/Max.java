package arrayProgr;

public class Max { // find max array
	
	public static void main(String[] args) {
		
	
	
	int a [] = {12,45,74,52};
	 
	int c = a[0];
	
	for(int i =0; i<=a.length-1; i++) {
		
		if(a[i]>c) {
			
			c=a[i];
		}
		
	}
	System.out.println(c);
	}
}
