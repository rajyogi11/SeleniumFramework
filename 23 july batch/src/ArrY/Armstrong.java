package ArrY;

public class Armstrong {
	
	
		public static void main(String [] arg){

		int a = 153;  // check armstrong no 

		int reminder=0; // 

		int temp=a;

		int result=0;  // stored remindrs

		 while(temp !=0){

		reminder= temp%10;  // 153%10=15.3

		result=result+(reminder*reminder*reminder); // 1(3)+5(3)+3(3)=153

		temp=temp/10;  // 

		System.out.println(temp);
		}

		if(result==a){
		System.out.println("Armstrong number");

		}
		else{
		System.out.println("Not Armstrong number");

		}




		}










		}
		


