package LogicalStatment;

public class Pattern12 {
	
	

	public static void main(String[] args) {
		int star =5;
		int space =0;
		
		for (int i=1; i<=9; i++) {
			
			
			for (int j =1; j<=star; j++) {
				System.out.print("*");
				
			}
			for (int k =1; k<=space; k++) {
				System.out.print(" ");
			}
				
				
			
				System.out.println();
				if  (i<=4) { // for outer loop
					star--; // for falls condtion
				space++;    // for falls condition
				
				}
				
				else  { // for innerloop
					star = star+2-1; // 3-1=2 hence this use for inner loop
					space--; // space-- true
				}
				

				}
			}
	}

	
