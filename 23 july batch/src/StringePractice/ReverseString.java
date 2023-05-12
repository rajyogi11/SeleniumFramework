package StringePractice;

public class ReverseString {
	
	public static void main(String [] arg) {
		
		String a = "Testing of application";
		
		String b = "";
		
		for(int i=a.length()-1; i>=0; i--) {
			
			b = b+ a.charAt(i);
			
		}
		System.out.println(b);
	}

}
