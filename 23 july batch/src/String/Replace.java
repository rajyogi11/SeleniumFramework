package String;

public class Replace {
	
	public static void main(String[] args) {
		
		String a = "Sachin Saurabh Sadashiv Kala ";
		String b= "Velocity";
		String c = "" ;
		
		System.out.println(a.replace("a", "A").replace("K","l"));
		
		System.out.println(c.isEmpty()); // empty method
		
		System.out.println(b.endsWith("t")); // ends with method
		
		
	    System.out.println(b.startsWith("V"));
	}

}
