package arrayProgr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;


	
	public class Test1 {
		public static void main(String[] args) {

			int ar[] = {12,55,44512,8,66,74,89,5,6,78,559,9,5};
			
			
			
			TreeSet tr = new TreeSet(); // method 1
			
			for(int i:ar)  // connect ar to i 
				
				tr.add(i);  // method 2 i to tr
			
			ArrayList al= new ArrayList(tr);  // method 3
			
			System.out.println("2nd Largest number in array: " + al.get(al.size()-2));
			System.out.println(("2nd Lowest Number in array: "+ al.get(1)));
		}                                                      // method 4   
	}
	//Output:
	//2nd Largest number in array: 89
//	2nd Lowest Number in array: 6


