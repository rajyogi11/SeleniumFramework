package Programs40;

import java.util.Arrays;

public class ConvertStringInto_Character {
	
	public static void main(String[] args) {
		
		String a = "helLo world india"; 
		
		//a=a.toLowerCase();
		 
		char []s=a.toCharArray(); // convert Array
		Arrays.sort(s);  // Sorted array in ascending order
		     
		char temp;

		//System.out.println(s);
		
		for(int i=0; i<=s.length; i++) {   // by using foor loop
			
			for(int j=i+1; j<s.length; j++) {
				
				if(s[i]>s[j]) {
					temp = s[i];
					s[i]=s[j];
					s[j]=temp;
					
					
				}
				
				
				
			}
			
		}
	System.out.println(s);
		
			
			
			
		
		
		
		
	}

}

