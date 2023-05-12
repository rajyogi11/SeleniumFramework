package arrayProgr;

public class abc {
	
	public static void main(String[] args) {

		int a = 153;
		int temp =a;
		int reminder=0;
		int result=0;
		
		while (temp != 0) {
			reminder = temp % 10;//reminder=3   
								//	remindr=5
								//reminer=1
			
		//System.out.println(reminder);
			
			result = result + (reminder*reminder*reminder);
							//3*3*3  result=27      27+125+1
							//5*5*5  result=125
							//1*1*1  result=1
			
			temp = temp/10;  // we minimise temp value by divide 
			//153/10  temp=15
			//15/10=1
			
			System.out.println(temp);
		}
		
		if(result==a)
		
			System.out.println("Given Number "+a+" is an Armstrong Number");
		else
			System.out.println("Given Number "+a+" is NOT an Armstrong Number");
	}
}


