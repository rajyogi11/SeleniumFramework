package ArrY;

public class arrayy {
	
	public static void main (String [] args) {
		
		int no=157;
		int temp=no;
		int result=0;
		int reminder=0;
		
		
		while(temp !=0) {
			
			reminder=temp%10;
			
			result=result+(reminder*reminder*reminder);
			
			temp=temp/10;
		}
		if(result==no) {
			System.out.println("Armstrong number "+no+" is armstrong number");
		}
		else {
			System.out.println("Not armstrong number "+no+"is not armstrong number");
		}
	}

}
