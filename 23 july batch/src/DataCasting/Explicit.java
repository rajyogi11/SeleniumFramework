package DataCasting;

public class Explicit {  // explicit casting from higher to lower and for data is loss
	
	public static void main(String[] args) {
		
		double a = 130.78;    // memory size of double is 8 byte
		System.out.println(a);
		
		int b =(int) a;        // Memory size of integer is 4 byte
		System.out.println(b);
		
		byte c =(byte) b ;     // memory size of byte is 1 byte
		System.out.println(c);
		
		// explicit the data is loss
		
	}

}
