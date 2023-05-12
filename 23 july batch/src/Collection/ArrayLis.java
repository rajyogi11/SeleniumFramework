package Collection;

import java.util.ArrayList;
import java.util.function.UnaryOperator;

public class ArrayLis {
	
	public static void main(String[] args) {
		
		// Heterogeneous
		ArrayList list = new ArrayList();  // create object of arraylist
		
		int [] a = {10,20,11,22,30};
		
		list.add(12345); 
		list.add("Velocity");
		list.add(null);
		list.add(21.5f);
		list.add("xyz");
		list.add('m');
		list.add("abc");
		list.add('m');
	//	list.add('b');
	//	list.add('g');
	/*	list.add('k');
		list.add(null);
		list.add("mcg");
		list.add('@');
		list.add('j');
		list.add('b');
		list.add(12.8f); */
		
		
		int h = list.size();
		System.out.println(h);
		//list.remove(2);
		
	System.out.println("---------------------------------");	
	
		for(int i=1; i<8; i++) {
			
			System.out.println(list.get(i));
		}
		
		
	}

}
