package Programs40;

public class factoriall {
	
	public static void main(String[] args) {
		
	// find factorial number
	
	int no= 5;
	
	int fact = 1 ;
	
	for(int i=1; i<=no; i++) {
		
		fact=fact*i;  // 5*4*3*2*1=120
		
	}
	System.out.println(fact);
	}
}
