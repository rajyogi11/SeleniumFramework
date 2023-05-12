package String;

public class FindDuplicateCharInString {
	
	public static void main(String[] args) {
		
		String a= "Gabbar";
		
		int lenght=a.length();
		
		char [] ch =a.toCharArray(); // String to array
		
		for(int i=0; i<=a.length()-1; i++) {
			
			for(int j=i+1; j<=a.length()-1; j++) {
				
				if(ch[i]==ch[j] ) {
					
					System.out.println("Duplicate array in string are "+ch[j]);
					 break;
				}
			}
		}
	}
}
