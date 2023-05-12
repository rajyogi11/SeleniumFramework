package Programs40;

public class CountSpace {
	public static void main(String[] args) {
		
	
	
	String s = "Velocity is the best training institute";
	
	int count =0;  // 
	
	
	for (int i=0; i<=s.length()-1; i++) {
		
		
	int s1= s.charAt(i);
	
	if(s1=='t') { // we count space as well as character in string using count
		count++;
	}
	
	}
	
	System.out.println(count);
	
	}
}
