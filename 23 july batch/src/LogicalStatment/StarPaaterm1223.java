package LogicalStatment;

public class StarPaaterm1223 {
	
	public static void main(String[] args) {
		
		
		
		for(int i=1; i<=4; i++) {
			
			for(int j=1; j<=7; j++) {
				
				if(i==4 || i+j==5 || (j==5 && i==2 )||( i==3 && j==6))
				{ 
				System.out.print("*");
			}
				else {
					System.out.print(" ");
				}
			
	

			}
			System.out.println();
		}
	}
}

