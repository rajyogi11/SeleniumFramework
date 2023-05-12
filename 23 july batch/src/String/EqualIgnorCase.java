package String;

public class EqualIgnorCase {
	
	public static void main(String[] args) {
		
		String a = "saChin";
		String b = "saChin";
		String c = new String("Sachin");
		
		System.out.println(c.equals(a));// compaire adrres of memory
		
		System.out.println(a.equalsIgnoreCase(b));  //Compaire string only
		
	}

}
