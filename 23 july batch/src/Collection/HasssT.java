package Collection;

import java.util.HashSet;

public class HasssT {
	
	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		set.add(8874);
		set.add(784);
		set.add(123);
		set.add(8874);
		set.add(null);  // duplicate value is not allowed 
		// not follow insertion order
		
		
		
		for(int y:set) {  // advance forloop with syntax
			
			System.out.println(y);
		}
		
		
	}

}
