package OddEvPrim;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
		int no = 153;
		int temp=no;
		int reminder=0;
		int result=0;
		
		while(temp!=0) {
			
			reminder= temp%10; // we get reminder of 153
			
			result = result+(reminder*reminder*reminder);
			
			temp=temp/10;
			
			
		}
		
		if(result==no) {
			
			System.out.println("given number is armstrong");
		}
		else {
			System.out.println("given number is not armstrong");
		}
	}

}
