package OddEvPrim;

public class armStrong {
	
	public static void main(String[] args) {
		
		int no =7;
		int temp=no;
		int result=0;
		int reminder=0;
		
		while(temp!=0) {
			
			reminder= temp%10;
			
			result= result+(reminder*reminder*reminder);
			
			temp=temp/10;
			
		}
		if(result==no) {
			System.out.println("No is Prime ");
		}
		else {
			System.out.println("No is not Prime");
		}
	}

}
