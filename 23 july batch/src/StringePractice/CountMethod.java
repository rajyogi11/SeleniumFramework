package StringePractice;

public class CountMethod {
	
	public static void main(String[] args) {
		
		String b = "MY/NAME IS RAJ";
		
		int count=0;
		
		for(int i=0; i<=b.length()-1; i++) {
			
	     char c = b.charAt(i);
	     
	     if(c=='/') {
			
			count++;
	     }	
	     
		}
		System.out.println(count);
	}

}
