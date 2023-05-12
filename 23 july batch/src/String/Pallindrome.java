package String;

public class Pallindrome {
	
	public static void main(String[] args) {
		
		String a = "242";
		String b ="";
		
		for(int i=a.length()-1; i>=0; i--) {
			
			b=b+a.charAt(i);
		}
		
		//System.out.println();
		
		if(a.equals(b)) {
			System.out.println("given string is pallindrome");
		}
		else {
			System.out.println("given string is not pallindrome");
		}
	}

}
