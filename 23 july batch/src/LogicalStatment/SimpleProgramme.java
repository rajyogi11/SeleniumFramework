package LogicalStatment;

public class SimpleProgramme {
	
	public static void main(String[] args) {
		
		String s1="Simple";
		
		int s2 = s1.length();
		
		for(int i=0; i<=s2-1; i++) {
			
			for(int j=0; j<=i; j++) {
				System.out.print(s1.charAt(j)+ " ");
				
			}
			System.out.println();
		}
		
	}

}
