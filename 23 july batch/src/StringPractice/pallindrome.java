package StringPractice;

public class pallindrome {
	
	public static void main(String[] args) {
		
		
		
		String a = "mom";
		
		String b ="";
		
		for(int i=a.length()-1; i>=0; i--) {
			b=b+a.charAt(i);
		}
		if(a.equals(b)) {
			System.out.println("Given string is pallindrome");
		}
		else {
			System.out.println("Given string is not pallindrome");
		}
	}

}
