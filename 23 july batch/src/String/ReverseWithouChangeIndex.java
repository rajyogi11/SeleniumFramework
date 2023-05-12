package String;

public class ReverseWithouChangeIndex {
	
	public static void main(String[] args) {
		
		String a = "Hello world";
		
		String b[]=a.split(" ");   // split string from ""
		
		for(int i =0; i<=b.length-1; i++) {
			
			String c = b[i];   // store hello world
			
			String d =" "; // store the space between two string
		    
		   for(int j=c.length()-1; j>=0; j--) {
				
				d+=c.charAt(j);  // reverse the string 
			}
			
			System.out.print(d);
		}
	}

}
