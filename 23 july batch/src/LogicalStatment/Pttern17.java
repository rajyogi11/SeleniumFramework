package LogicalStatment;

public class Pttern17 {
	
	public static void main(String[] args) {
		
		for(int i =1; i<=3; i++) {
			for(int j =1; j<=6; j++) {
				
				if(i==1   || j==1|| j==6 || j+i==4 ||j-i==3) {
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
