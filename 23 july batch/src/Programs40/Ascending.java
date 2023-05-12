package Programs40;

import java.util.Arrays;

public class Ascending {

	public static void main(String[] args) {
		
		int b [] = {45,78,20,58,60,87};
			
		for(int i=0; i<b.length; i++) {
			Arrays.sort(b);
			
			System.out.println(b[i]); // 
		}
		//System.out.println(b[2]);
		
	}
}
