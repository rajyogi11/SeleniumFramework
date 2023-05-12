
package arrayProgr;

public class ArmstrongNumber {
	
	public static void main(String[] args) {

		int no = 1634;  // 1*1*1+5*5*5+3*3*3=1+125+27=153 Armstrong number
		int temp = no;
		int reminder=0;
		int result=0;
		
		while (temp != 0) {  // 163.4 , 16.3, 1.6 , 0.1
			
			reminder = temp % 10; //  15.3
			
			result = result +(reminder*reminder*reminder*reminder);  // 256+81+1296+1
			
			temp = temp/10;  // 163/10 , 16/10, 1/10, 0/10 
			
		}
		if(result==no) {
		
			System.out.println("Given Number "+no+" is an Armstrong Number");
		}
		else {
			System.out.println("Given Number "+no+" is NOT an Armstrong Number");
		}
	}
}

// itration start from right to left
// if we use 3 digit armstrong number then we use 3 as reminders like(reminder*reminder*reminder)
// if we use 4 digit then(reminder*reminder*reminder*reminder)