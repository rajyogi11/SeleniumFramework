package OddEvPrim;

public class Even1 {
	
	public static void main(String[] args) {
		
		int temp =0;
		int no = 29;
		
		
		for (int i=1; i<=no-1; i++) {
			temp++;
		}
		if(no%2==0) {
			System.out.println("No is not Prime");
		}
		else {
			System.out.println("No is Prime");
		}
		
		
		
		
	}
}
