package Programs40;

import java.util.Arrays;

public class Dscending {
	
	public static void main(String[] args) {
		
		int c [] = {45,78,87,20,58,60};  //87,78,60,58,45,20
		
		System.out.println("---------------------------");
		for(int i = c.length-1; i>=0 ; i--) {
			Arrays.sort(c);
			System.out.println(c[i]);
		}
	
	
	}
}
