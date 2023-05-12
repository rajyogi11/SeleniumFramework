package Collection;

import java.util.ArrayList;

public class Aaaary {
	
	public static void main(String[] args) {
		
		
		/// homogeneous 
		
		ArrayList <Integer> list  = new ArrayList();
		
		
		
		//list.add("123");
		
		
		list.add(null);
		list.add(null);
		list.add(null);
		list.add(123);
		list.add(123);
		list.add(123);
		list.add(123);
		list.add(123);
		list.add(123);
		
		System.out.println(list.get(0));
		
		
		System.out.println("--------------");
		for(int i=0; i<9; i++) {
			System.out.println(list.get(i));
		}
	}

}
