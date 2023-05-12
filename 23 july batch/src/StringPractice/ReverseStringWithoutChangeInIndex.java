package StringPractice;

public class ReverseStringWithoutChangeInIndex {
	
	public static void main(String[] args) {
		
		String a ="My name";
		
		String b [] = a.split(" ");
		
		for(int i=0; i<=b.length-1; i++) {
			
			String c=b[i];
			
			String v = " ";
			
			for(int j =c.length()-1; j>=0; j--) {
				
				v+=c.charAt(j);
			}
			System.out.print(v);
		}
		
		
	}

}
