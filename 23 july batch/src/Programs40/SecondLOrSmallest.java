package Programs40;

import java.util.Arrays;

public class SecondLOrSmallest {
	
	

		public static void main(String [] arg){

		int r [] = {12,74,85,65,30,45};  // second largest or smaller value 
		            //12 65
		                                                 // 12,30,45,65,74,85
		                                                // i=12,
		for(int i=0; i<=r.length-1; i++) {  // constant 
			
			
			for(int j=i+1; j<r.length; j++) {  // Complete itration up to last index (45) then go i=74
				
				
				if(r[i]>r[j]) {  // less than second max and greater than second min
				
					
				int temp = r[i]; 
				            //74
				
				r[i]=r[j];  
				//74  //65
				//65   //74
				r[j]=temp;  
			}
			
		}
		System.out.println(r[i]);  //Ascending Descending array without using sort method

		}
		//System.out.println(r[0]); // take index number number of min and max value we can find
}
}		




