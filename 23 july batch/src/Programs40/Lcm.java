package Programs40;

public class Lcm {
	
	public static void main(String[] args) {
		
		int a=8;
		int b=6;
	    int g=0;

	         for (int i=1;i<=a;i+=1){

	            if(a%i==0 && b%i==0)

	                 g=i;     // i itrates up to 2 only bcz 8,6 is divisible only by 2
	     //       System.out.print(g+" ");

	             }

	           int lcm = a*b/g;   // here g =2
	              System.out.println("LCM is ="+lcm);

		
	}

}
