package arrayProgr;

public class primenousingifelse {
	
	public static void main(String[] args) {
		
		int no=7;
		int t= 0;
		
		if(no>1) {
			
			for(int i=1; i<=no; i++) {
				
				if(no%i==0)  // 
					t++;
				
			}
			if(t==2) {
				
				System.out.println("Prime no");
			}
			else {
				System.out.println("no prime");
			}
		}
		
	
	}
}