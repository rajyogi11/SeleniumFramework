package OddEvPrim;

public class Cb {
	
	

		public static void main(String [] arg){

		int num=153, result=0, rem;
		int temp=num;

		while(num>0){

		rem=num%10;  // 153%10=3 , 15%10=5, 1%10=1  0>0 condition is falls
		
		
        num=num/10;  //153/10=15 ,Numb=15/10 =1 , 1/10=0

		result=result+(rem*rem*rem); //(3*3*3)=27,(5*5*5)=125,(1*1*1)=1 =153


		}
		if(result==temp){
		System.out.println("Armstrong number");
		}

		else{
		System.out.println("Number is not armstrong");
		}

		}


		}


