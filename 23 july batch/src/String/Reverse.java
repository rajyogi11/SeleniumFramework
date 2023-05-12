package String;

public class Reverse {
	
	public static void main(String[] args) {
		
		String a = "dad";
		String b = "";
		
		for(int i=a.length()-1; i>=0; i--) {  //  reverse string
			
			b = b +a.charAt(i); // index number is given by char At
			
			
		}
		
		//System.out.println(b);
		
		if (a.equals(b)) {  // compair a equals rev
			
			System.out.println("Given string is  pallindrome");
		}
		
		else {
			
			System.out.println("Given string not  pallindrome");
		}	
	}

}
