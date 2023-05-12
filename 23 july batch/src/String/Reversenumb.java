package String;

public class Reversenumb {
	
	public static void main(String[] args) {
		
		String a = "bappa morya";
		
		String [] b = a.split(" ");
		
		for(int i=0; i<=b.length-1; i++) {
			
			String c = b[i];
			
			String d =" ";
			
			for(int j=c.length()-1; j>=0; j--) {
				
				d+=c.charAt(j);
			}
			
			System.out.print(d);
			
		}
		
	}

}
