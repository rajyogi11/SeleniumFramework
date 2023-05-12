package arrayProgr;

import java.util.Arrays;

public class Desc {
	
	public static void main(String[] args) {
		
		int ar [] = {1,3,2,4};
		
	
		for(int i=0; i<=ar.length-1; i++) {	
			Arrays.sort(ar);
			
			System.out.println(ar[i]);
		}
	}

}
