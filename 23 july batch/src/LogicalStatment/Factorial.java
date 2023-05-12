package LogicalStatment;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		
		
		
		Scanner d = new Scanner(System.in);
		
		 System.out.println("enter the number");  // factorial number 5=5*4*3*2*1=120
		 
	   int no=d.nextInt();
	   
	    int fact =1;
	    
		for(int i=1; i<=no; i++) {
			
			fact= fact*i;
		}
		
		System.out.println("factorial of "+no+" is "+fact);
	
		
	}

}
