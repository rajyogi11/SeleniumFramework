package arrayProgr;

public class SecondMax {
	
	public static void main(String[] args) {
		
		int x [] = {12,77,52,63,98,110};
		
		int max=x[0];
		
		int sec = x[0];
		
		for(int i=0; i<=x.length-1; i++) {
			
			if(x[i]>max) {
				
				max=sec;
				sec=x[i];
				
			}
			else if(x[i]<max) {
				x[i]=max;
				
			}
		}
		System.out.println(max);
		
	}

}
