

package String;

public class String1 {
	
	public static void main(String[] args) {
		
		String a = "velocity"; // constant pool area
		String b = "velocity";
		
		String c = new String("velocity");  // non constant pool area
		String d = new String ("velocity");
		
		
		System.out.println(a==b);// True
		System.out.println(c==d);// False comparison of address
		System.out.println(a==c);// false
		
		System.out.println("------------------------");
		
		b= "class";
		
		System.out.println(b);
		System.out.println(a);
		System.out.println(a==b);// false
		
		System.out.println("---------------------------------------");
		
		
		b="velocity";
		
		System.out.println(b);
		System.out.println(a);
		System.out.println(a==b);// true
		
		
	}

}
