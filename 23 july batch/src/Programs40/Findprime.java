package Programs40;

public class Findprime {
	
	public static void main(String[] args) {
		
		//int no=27; remove         changes particular no to 1 to 100
		int temp=0;
		
		for(int no=1; no<=100; no++) { // extra for loop
		
		for(int i=2; i<=no-1; i++) {
			//if(no%2==0) { // change
			if (no%i==0 ) {
				temp=temp+1;
			}
		}
		if (temp==0) {
			//System.out.println("No is not prime"); change
			System.out.println(no);
		}
		else {
			//System.out.println("No is prime");  change
			temp=0;
		}
		
	}

}
}
