package Collection;

import java.util.Vector;

public class Vc {
	
	
	// Homogeneous
	
	public static void main(String[] args) {
		
		Vector  vec = new Vector();
		
		vec.add("mvk");
		
		vec.add("vnv");
		
		vec.add('1');
		
		vec.add(1);
		
		for(int i=0; i<4; i++) {
			System.out.println(vec.get(i));
			// one thread means one execution
			// synchronization in control the multiple threads
		}
	}

}
