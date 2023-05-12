package StringePractice;

public class CountSlash {
	
	public static void main(String[] args) {
		
		String g = "I/LOVE/CRICKET/AND/CHESS";
		
		int count=0;
		
		for(int i=0; i<=g.length()-1; i++) {
			
			char b = g.charAt(i);
			
			if(b=='/') {
				
				count++;
		}
		
			
		}
		System.out.println("total slash in this string is "+count);
	}

}
