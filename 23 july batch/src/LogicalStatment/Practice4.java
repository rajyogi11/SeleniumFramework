package LogicalStatment;

public class Practice4 {
	
	public static void main(String[] args) {
		
		int space=4;
		int star=1;

		for(int i=1; i<=5; i++) { // outer for loop
			
			for(int j=1; j<=space; j++) { // inner for loop1
				System.out.print(" "); }
			
			for(int k=1; k<=star; k++) { // inner forloop2
				System.out.print("*"); }
			
			System.out.println();
			space--;
			star++;

			
			}
		}
	}
	


