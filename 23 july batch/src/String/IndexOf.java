package String;

public class IndexOf {
	
	public static void main(String[] args) {
		
		String a = "Sachin Pass Examination";
		String b = "Velocity";
		
		System.out.println(a.indexOf("a"));
		System.out.println(a.indexOf("E"));
		System.out.println(a.indexOf("x"));
		
		System.out.println(a.indexOf(a));
		
		System.out.println(a.lastIndexOf("a")); // last index
		
		System.out.println(b.contains("cit")); // contains method

	}

}
